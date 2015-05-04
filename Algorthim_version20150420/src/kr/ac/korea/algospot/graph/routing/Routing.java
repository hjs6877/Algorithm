package kr.ac.korea.algospot.graph.routing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ====== 그래프 생성 프로세스 ====
 * graphMap(출발정점, 도착정점의 목록 List<Map<도착정점, 가중치 List<가중치>>>);
 * 1.맵에 저장된 출발정점이 존재하는지 확인.
 * 		1-1. 존재한다면, 출발정점을 키로 도착정점의 목록을 가져온다.
 * 			1-1-1. 목록을 루프 돌면서 도착 정점이 존재하는지 확인.
 * 				1-1-1-1. 도착 정점이 존재한다면 도착 정점을 키로 가중치 List를 가져온 후, 목록에 가중치를 추가한다.
 * 			1-1-2. 도착 정점이 존재하지 않는다면 도착 정점을 키로하고 가중치 List를 생성해서 가중치를 추가한다.
 * 		1-2. 존재하지 않는다면, 
 * 			1-2-1. 출발정점을 키로, 도착정점의 List를 생성하고, 도착 정점의 Map을 생성하여 가중치 List를 생성 한 후, 가중치를 추가한다.
 * 
 * 
 * ===== 다익스트라 알고리즘 프로세스 ====
 * 1. 우선 순위 큐와 dist[]을 초기화한다.
 * 2. 우선 순위큐에 시작 정점 0을 추가한다.
 * 3. while(큐가 비어있지 않은 동안){
 * 		int cost = queue.top.key;               // 해당 정점까지의 최단거리.
 * 		int selectedV = queue.top.value.
 *     
 *     // 꺼낸것보다 더 짧은 경로를 이미 알고 있다면 꺼낸 정점을 무시한다.
 *     if(dist[selectedV] < cost) continue;
 *     
 *     for(꺼낸 정점의 인접한 정점을 모두 검사){
 *     		int V(연결된 정점 번호) = xxxxxxx;
 *     		int D(연결된 정점까지의 거리) = cost + 연결된 정점까지의 간선 가중치
 *     
 *     		// 더 짧은 경로를 발견하면, dis[]를 갱신하고 우선순위 큐에 넣는다.
 *     		if(dist[V] > D){
 *     			dist[V] = D;
 *        
 *     			queue.push(V);
 *     		}
 *     }
 * }
 * 
 * 
 * 
 * ==== 문제가 되었던 부분 ====
 * 1. 정점까지의 최단거리를 저장하는 dist[] 배열에 '무한대'에해당하는 초기값을 넣어주지 않아서 알고리즘 수행 시, 정상적이 계산을 하지 못했음.
 * 2. 정점간의 단일 간선이 아닌 다중 간선이 존재하는 부분으로 인해 링크드 리스트를 사용하지 않고, 맵으로 구현한 부분에서 시간 지체.
 */
public class Routing {
	public static Map<Integer, List<Map<String, Object>>> graphMap = null;
	public static List<Map<String, Object>> endVList = null;
	public static Map<String, Object> endVMap = null;
	public static List<Double> weightList = null;
	public static double weight = 0;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		int executeCount = scanner1.nextInt();
		for(int i=0; i<executeCount; i++){
			graphMap = new HashMap<Integer, List<Map<String, Object>>>();
			endVList = null;
			endVMap = null;
			weightList = null;
			weight = 0;
			
			Scanner scanner2 = new Scanner(System.in);
			String vertexEdge = scanner2.nextLine();
			String[] veInfos = vertexEdge.split("\\s+");
			
			/**
			 * 그래프 생성.
			 */
			Routing.createGraph(Integer.parseInt(veInfos[0]), Integer.parseInt(veInfos[1]));
			
			/**
			 * 다익스트라 알고리즘을 통한 최소 노이즈 경로의 노이즈 값 출력....
			 */
//			System.out.println();
//			System.out.println("시작정점 0에 부수된 정점 개수: " + graphMap.get(0).size());
//			System.out.println("시작정점 0에 부수된 정점 목록: " + graphMap.get(0));
//			System.out.println();
			
			// 시작정점에서 해당 정점까지의 가장 짧은 거리가 저장 된 배열.
			double[] dist = new double[Integer.parseInt(veInfos[0])];
			
			// dist 배열의 원소를 무한대 값으로 초기화.
			for(int j=0; j < dist.length; j++){
				dist[j] = Double.MAX_VALUE;
			}
			
			PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
			Vertex v = new Routing.Vertex(0, 1.0);
			
			/**
			 * 시작 정점을 0으로 지정하고, 큐에 추가한다.
			 */
			dist[0] = 1.0;
			pq.add(v);
			
			while(!pq.isEmpty()){
				Vertex topV = pq.poll();
				int no = topV.getVertexNo();
				double cost = topV.getCost();
				
				// 꺼낸 정점 보다 더 짧은 경로를 이미 알고 있다면 꺼낸 정점은 무시한다.
				if(dist[no] < cost){
					continue;
				}
				
				List<Map<String, Object>> adjVList = graphMap.get(no);
				if(adjVList != null){
//					System.out.print(no + "에 인접한 정점: ");
					for(Map<String, Object> adjVMap : adjVList){
						int adjVNo = (int) adjVMap.get("no");
						List<Double> adjVWeightList = (List<Double>) adjVMap.get("weightList");
//						System.out.print("[" + adjVNo + ":  " + adjVWeightList + "], ");
						
						// 연결된 정점에 다중 간선이 존재할 수 있음.
						for(int j=0; j < adjVWeightList.size(); j++){
							double adjVCost = cost * adjVWeightList.get(j);
							// 더 짧은 경로를 발견하면, dist[ ]를 갱신하고 우선순위 큐에 넣는다.
							if(dist[adjVNo] > adjVCost){
								dist[adjVNo] = adjVCost;
								Vertex vertex = new Vertex(adjVNo, adjVCost);
								pq.add(vertex);														// 큐 내부적으로 거리가 작은놈이 우선 순위가 높으므로 먼저 나옴.
							}
						}
					}
				}
			}
//			System.out.println("\n");
			//System.out.println(0 + "에서 " + (dist.length-1) + "까지의 최단거리: " + dist[dist.length-1]);
//			DecimalFormat format = new DecimalFormat("#.##########");
//			String str = format.format(dist[dist.length-1]);
//			System.out.println(str);
			
			String str = String.format("%.10f", dist[dist.length-1]);
			System.out.println(str);
		}
		
		
		
	}
	
	/**
	 * 그래프 생성.
	 * - 정점의 번호는 vCount보다 작아야한다.
	 * - 간선의 갯수 만큼만 루프를 돈다.
	 * 
	 * 
	 * ====== 그래프 생성 프로세스 ====
	 * graphMap(출발정점, 도착정점의 목록 List<Map<도착정점, 가중치 List<가중치>>>);
	 * 1.맵에 저장된 출발정점이 존재하는지 확인.
	 * 		1-1. 존재한다면, 출발정점을 키로 도착정점의 목록을 가져온다.
	 * 			1-1-1. 목록을 루프 돌면서 도착 정점이 존재하는지 확인.
	 * 				1-1-1-1. 도착 정점이 존재한다면 도착 정점을 키로 가중치 List를 가져온 후, 목록에 가중치를 추가한다.
	 * 			1-1-2. 도착 정점이 존재하지 않는다면 도착 정점을 키로하고 가중치 List를 생성해서 가중치를 추가한다.
	 * 		1-2. 존재하지 않는다면, 
	 * 			1-2-1. 출발정점을 키로, 도착정점의 List를 생성하고, 도착 정점의 Map을 생성하여 가중치 List를 생성 한 후, 가중치를 추가한다.
	 * @param vCount
	 * @param eCount
	 */
	@SuppressWarnings("unchecked")
	public static void createGraph(int vCount, int eCount){
		for(int i=0; i < eCount; i++){
			Scanner scanner = new Scanner(System.in);
			String InfoStr = scanner.nextLine();
			String[] infos = InfoStr.split("\\s+");
			
			int startV = Integer.parseInt(infos[0]);
			int endV = Integer.parseInt(infos[1]);
			
			weight = Double.parseDouble(infos[2]);			
			
			/**
			 * 핵심 포인트: 모든 회선이 양방향으로 데이터를 전송할 수 있으므로, 
			 * 시작 정점과 끝정점의 위치를 바꾸어서 가중치를 추가해준다.
			 */
			if(Routing.isValidVertex(vCount, startV) && Routing.isValidVertex(vCount, endV)){
				Routing.addVertexToGraphMap(startV, endV);
				Routing.addVertexToGraphMap(endV, startV);
			}else{
				System.out.println("유효하지 않은 정점입니다.");
				scanner.close();
				return;
			}
		}
	}
	
	/**
	 * 유효한 정점인지 체크.
	 * 
	 * @param vertexCount
	 * @param vertex
	 * @return
	 */
	public static boolean isValidVertex(int vertexCount, int vertex){
		return ((vertex >-1) && (vertex < vertexCount));
	}
	
	public static void addVertexToGraphMap(int startV, int endV){
		/**
		 * 그래프 생성.
		 * 시작 정점이 존재 할 때와 존재하지 않을 때로 구분해서 처리.
		 */
		if(graphMap.containsKey(startV)){
			endVList = graphMap.get(startV);
			boolean isExistEndV = false;
			
			for(Map<String, Object> map : endVList){
				/**
				 * - 끝 정점이 존재한다면 해당 정점의 가중치 리스트를 가져와서 가중치 추가.
				 */
				if((Integer)map.get("no") == endV){
					isExistEndV = true;
					weightList = (List<Double>) map.get("weightList");
					weightList.add(weight);
//					System.out.println(startV + "(기존 시작정점)" + " -> " + (Integer)map.get("no") + "(기존 끝정점)" + "에 가중치 추가");
					break;
				}
			}
			
			/**
			 * - 끝 정점이 존재하지 않는다면 끝 정점 생성, 끝 정점에 간선 가중치 값 추가한 후, 끝 정점 추가.
			 */
			if(!isExistEndV){
				endVMap = new HashMap<String, Object>();
				weightList = new ArrayList<Double>();
				
				weightList.add(weight);
				endVMap.put("no", endV);
				endVMap.put("weightList", weightList);
				
				endVList.add(endVMap);
//				System.out.println(startV + "(기존 시작정점)" + " -> " + endV + "(새로운 끝 정점)" + "에 가중치 추가");
			}
			
			
		}else{
			endVList = new ArrayList<Map<String, Object>>();
			endVMap = new HashMap<String, Object>();
			weightList = new ArrayList<Double>();
			
			weightList.add(weight);
			endVMap.put("no", endV);
			endVMap.put("weightList", weightList);
			endVList.add(endVMap);
			 
			graphMap.put(startV, endVList);
//			System.out.println(startV + "(새로운 시작정점)" + " -> " + endV + "(새로운 끝 정점)" + "에 가중치 추가");
		}
	}
		
		
	
	/**
	 * 정점 클래스
	 * 
	 * @author hjs6877
	 *
	 */
	public static class Vertex implements Comparable<Vertex>{
		private double cost;
		private int vertexNo; 
		
		public Vertex(int vertexNo, double cost) {
			super();
			this.vertexNo = vertexNo;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(Vertex o) {
			
			return this.cost <= o.cost ? -1 : 1;
		}

		public double getCost() {
			return cost;
		}

		public int getVertexNo() {
			return vertexNo;
		}
		
		
	}
}

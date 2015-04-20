package kr.ac.korea.algospot.graph;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Routing {
	/**
	 * graphMap(출발정점, 도착정점의 목록 List<Map<도착정점, 가중치 List<가중치>>>);
	 * 1.맵에 저장된 출발정점이 존재하는지 확인.
	 * 		1-1. 존재한다면, 출발정점을 키로 도착정점의 목록을 가져온다.
	 * 			1-1-1. 목록을 루프 돌면서 도착 정점이 존재하는지 확인.
	 * 				1-1-1-1. 도착 정점이 존재한다면 도착 정점을 키로 가중치 List를 가져온 후, 목록에 가중치를 추가한다.
	 * 			1-1-2. 도착 정점이 존재하지 않는다면 도착 정점을 키로하고 가중치 List를 생성해서 가중치를 추가한다.
	 * 		1-2. 존재하지 않는다면, 
	 * 			1-2-1. 출발정점을 키로, 도착정점의 List를 생성하고, 도착 정점의 Map을 생성하여 가중치 List를 생성 한 후, 가중치를 추가한다.
	 */
	public static Map<Integer, List<Map<Integer, List<Double>>>> graphMap;
	
	public static void main(String[] args){
		graphMap = new HashMap<Integer, List<Map<Integer, List<Double>>>>();
		Scanner scanner1 = new Scanner(System.in);
		int executeCount = scanner1.nextInt();
		for(int i=0; i<executeCount; i++){
			Scanner scanner2 = new Scanner(System.in);
			String vertexEdge = scanner2.nextLine();
			String[] veInfos = vertexEdge.split("\\s+");
			
			Routing.createGraph(Integer.parseInt(veInfos[0]), Integer.parseInt(veInfos[1]));
			
			/**
			 * 다익스트라 알고리즘을 통한 최소 노이즈 경로의 노이즈 값 출력.
			 */
		}
		
		
		
	}
	
	/**
	 * 그래프 생성.
	 * - 정점의 번호는 vCount보다 작아야한다.
	 * - 간선의 갯수 만큼만 루프를 돈다.
	 * 
	 * @param vCount
	 * @param eCount
	 */
	public static void createGraph(int vCount, int eCount){
		for(int i=0; i < eCount; i++){
			Scanner scanner = new Scanner(System.in);
			String InfoStr = scanner.nextLine();
			String[] infos = InfoStr.split("\\s+");
			
			int startV = Integer.parseInt(infos[0]);
			int endV = Integer.parseInt(infos[1]);
			double weight = Double.parseDouble(infos[2]);
			
			if(Routing.isValidVertex(vCount, startV) && Routing.isValidVertex(vCount, endV)){
				List<Map<Integer, List<Double>>> endVList = null;
				Map<Integer, List<Double>> endVMap = null;
				List<Double> weightList = null;
				
				/**
				 * 그래프 생성.
				 * 시작 정점이 존재 할때와 존재하지 않을때로 구분해서 처리.
				 */
				if(graphMap.containsKey(startV)){
					endVList = graphMap.get(startV);
					boolean isExistEndV = false;
					
					for(Map<Integer, List<Double>> map : endVList){
						/**
						 * - 끝 정점이 존재한다면 해당 정점의 가중치 리스트를 가져와서 가중치 추가.
						 */
						if(map.containsKey(endV)){
							isExistEndV = true;
							weightList = map.get(endV);
							weightList.add(weight);
							System.out.println(startV + "(기존 시작정점)" + " -> " + endV + "(기존 끝정점)" + "에 가중치 추가");
							break;
						}
					}
					
					/**
					 * - 끝 정점이 존재하지 않는다면 끝 정점 생성, 끝 정점에 간선 가중치 값 추가한 후, 끝 정점 추가.
					 */
					if(!isExistEndV){
						endVMap = new HashMap<Integer, List<Double>>();
						weightList = new ArrayList<Double>();
						
						weightList.add(weight);
						endVMap.put(endV, weightList);
						System.out.println(startV + "(기존 시작정점)" + " -> " + endV + "(새로운 끝 정점)" + "에 가중치 추가");
					}
				}else{
					endVList = new ArrayList<Map<Integer, List<Double>>>();
					endVMap = new HashMap<Integer, List<Double>>();
					weightList = new ArrayList<Double>();
					
					weightList.add(weight);
					endVMap.put(endV, weightList);
					endVList.add(endVMap);
					 
					graphMap.put(startV, endVList);
					System.out.println(startV + "(새로운 시작정점)" + " -> " + endV + "(새로운 끝 정점)" + "에 가중치 추가");
				}
			}else{
				System.out.println("유효하지 않은 정점입니다.");
				scanner.close();
				return;
			}
		}
	}
	
	public static boolean isValidVertex(int vertexCount, int vertex){
		return ((vertex >-1) && (vertex < vertexCount));
	}
}

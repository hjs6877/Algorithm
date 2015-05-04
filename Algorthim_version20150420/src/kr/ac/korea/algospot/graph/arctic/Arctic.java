package kr.ac.korea.algospot.graph.arctic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
/**
 * 결정 문제를 이분법 알고리즘으로 해결.
 * 
 * @author hjs6877
 */
public class Arctic {
	public static List<Arctic.Vertex> vList = null;
	public static double dist[][] = null;
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		int executeCount = scanner1.nextInt();
		for(int i=0; i<executeCount; i++){
			vList = null;
			dist = null;
			
			Scanner scanner2 = new Scanner(System.in);
			int vCount = scanner1.nextInt();
			
			/**
			 * 기지 정점 추가.
			 */
			vList = Arctic.addV(vCount);
			
			/**
			 * 기지 정점간 통신 반경 값 계산.
			 */
			dist = Arctic.calcDist(vList);
			
			double result = Arctic.optimize();
			System.out.println(String.format("%.2f", result));
		}
		
		
	}
	
	/**
	 * 거리가 d 이하인 기지들이 하나로 연결되어 있는지 확인한다.
	 * 
	 * @param d
	 * @return
	 */
	public static boolean decide(double d){
		boolean[] visited = new boolean[vList.size()];
		visited[0] = true;
		
		Queue<Arctic.Vertex> q = new LinkedList<Arctic.Vertex>();
		q.add(vList.get(0));
		
		int possible = 0;
		
		while(!q.isEmpty()){
			Vertex v = q.poll();
			int vNo = v.getNo();
			possible++;
			
			for(int i=0; i < vList.size(); i++){
				/**
				 * 정점 리스트에 있는 정점이 아직 방문하지 않은 정점이고, 
				 * 큐에서 뽑은 정점의 통신거리가 d보다 작거나 같다면,
				 * 방문한 후, 해당 정점을 큐에 추가한다.
				 */
				if(!visited[i] && dist[vNo][i] <= d){
					visited[i] = true;
					Vertex v2 = vList.get(i);
					q.add(v2);
				}
			}
		}
		
		return possible ==vList.size();
	}
	
	/**
	 * 이분법을 이용해서 서로 거리가 mid 이하인
	 * 기지들을 연결해서 연락망을 만든 후, decide() 메서드를
	 * 호출해서 이 연락망들이 하나로 연결이 되어있는지를 확인한다.
	 * 
	 * @return
	 */
	public static double optimize(){
		double low = 0;
		double high = 1416.00;
		
		for(int i = 0; i < 100; i++){
			double mid = (low + high) / 2;
			
			if(Arctic.decide(mid)){
				high = mid;
			}else{
				low = mid;
			}
		}
		
		return high;
	}
	public static double[][] calcDist(List<Arctic.Vertex> vList){
		int count = vList.size();
		double dist[][] = new double[101][101];
//		System.out.print("추가된 기지 정점: [");
//		for(Arctic.Vertex v : vList){
//			System.out.print(v.getNo() + ":" + v.getX() + ":" + v.getY() + ", ");
//		}
//		System.out.print("]");
//		System.out.println();
		
		for(int j=0; j < count; j++){
			Arctic.Vertex v1 = vList.get(j);
			int v1No = v1.getNo();
			double v1X = v1.getX();
			double v1Y = v1.getY();
			
			for(int k=0; k < count; k++){
				Arctic.Vertex v2 = vList.get(k);
				int v2No = v2.getNo();
				double v2X = v2.getX();
				double v2Y = v2.getY();
				double d = 0.0;
				
				if(v1No == v2No){
					continue;
				}else{
					
					if(v1X == v2X && v1Y != v2Y){
						d = Math.abs(v1Y - v2Y);
					}else if(v1X != v2X && v1Y == v2Y){
						d = Math.abs(v1X - v2X);
					}else {
						d = Math.sqrt(Math.pow(Math.abs(v1X - v2X), 2) + Math.pow(Math.abs(v1Y - v2Y), 2));
					}
				}
				
				dist[v1No][v2No] = d;
				dist[v2No][v1No] = d;
			}
		}
		
//		for(int m=0; m < dist.length; m++){
//			for(int n=0; n < dist[m].length; n++){
//				System.out.print("dist[" + m + "][" + n+ "]: " + dist[m][n] + ", ");
//			}
//		}
		return dist;
	}
	public static List<Arctic.Vertex> addV(int vCount){
		List<Arctic.Vertex> vList = new ArrayList<Arctic.Vertex>();
		for(int i=0; i < vCount; i++){
			Scanner scanner = new Scanner(System.in);
			String InfoStr = scanner.nextLine();
			String[] infos = InfoStr.split("\\s+");
			
			double x = Double.parseDouble(infos[0]);
			double y = Double.parseDouble(infos[1]);
			
			Arctic.Vertex v = new Arctic.Vertex(i, x, y);
			vList.add(v);
		}
		return vList;
	}
	
	public static class Vertex {
		private int no;
		private double x;
		private double y;
		
		public Vertex(int no, double x, double y) {
			super();
			this.no = no;
			this.x = x;
			this.y = y;
		}

		public int getNo() {
			return no;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}
	}
}

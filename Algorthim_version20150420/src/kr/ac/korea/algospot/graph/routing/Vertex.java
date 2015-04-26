package kr.ac.korea.algospot.graph.routing;


public class Vertex implements Comparable<Vertex>{
	private double cost;
	private int vertexNo; 
	
	public Vertex(double cost, int vertexNo) {
		super();
		this.cost = cost;
		this.vertexNo = vertexNo;
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

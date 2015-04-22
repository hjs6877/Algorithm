package kr.ac.korea.test.graph;

import static org.junit.Assert.*;

import java.util.PriorityQueue;

import kr.ac.korea.algospot.graph.Routing;
import kr.ac.korea.algospot.graph.Routing.Vertex;

import org.junit.Test;

public class VertexTest {

	@Test
	public void test() {
		Vertex v1 = new Routing.Vertex(0, 1.45);
		Vertex v2 = new Routing.Vertex(1, 1.11);
		Vertex v3 = new Routing.Vertex(2, 1.46);
		
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
		
		pq.add(v1);
		pq.add(v2);
		pq.add(v3);
		
		int size = pq.size();
		
		assertEquals(3, size);
		
		assertEquals(1, pq.poll().getVertexNo());
		assertEquals(0, pq.poll().getVertexNo());
		assertEquals(2, pq.poll().getVertexNo());
	}
}

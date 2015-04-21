package kr.ac.korea.test.graph;

import static org.junit.Assert.*;

import java.util.PriorityQueue;

import kr.ac.korea.algospot.graph.Vertex;

import org.junit.Test;

public class PriorityQueueTest {

	@Test
	public void sortTest() {
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
		pq.add(new Vertex(4.53, 3));
		pq.add(new Vertex(2.23, 2));
		pq.add(new Vertex(1.26, 1));
		pq.add(new Vertex(1.12, 0));
		
		
		int size = pq.size();
		
		assertEquals(size, 4);
		
		int i = 0;
		while(!pq.isEmpty()){
			Vertex v = pq.poll();
			assertEquals(v.getVertexNo(), i);
			i++;
			System.out.print("(" + v.getCost() + ", " + v.getVertexNo() + ")" + ",");
		}
		
	}

}

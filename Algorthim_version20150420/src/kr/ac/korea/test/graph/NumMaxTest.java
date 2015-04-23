package kr.ac.korea.test.graph;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumMaxTest {

	@Test
	public void test() {
		int[] A = new int[3];
		for(int i=0; i < A.length; i++){
			A[i] = Integer.MAX_VALUE;
		}
		
		assertEquals(2147483647, A[0]);
		assertEquals(2147483647, A[1]);
		assertEquals(2147483647, A[2]);
	}

}

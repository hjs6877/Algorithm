package kr.ac.korea.test.algorithm.array;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.array.MetrixProblem1;

import org.junit.Test;

public class MetrixProblem1Test {

	@Test
	public void test() {
		int[][] A = {{1,2,3},{3,0,6},{8,7,9}};
		MetrixProblem1 obj = new MetrixProblem1(A);
		
		obj.replaceAllZero();
		
		
		assertEquals(0, obj.getMetrixElement(1,0));
		assertEquals(0, obj.getMetrixElement(1,1));
		assertEquals(0, obj.getMetrixElement(1,2));
		
		assertEquals(0, obj.getMetrixElement(0,1));
		assertEquals(0, obj.getMetrixElement(1,1));
		assertEquals(0, obj.getMetrixElement(2,1));
	}

}

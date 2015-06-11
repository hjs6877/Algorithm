package kr.ac.korea.test.algorithm.search;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.search.BinarySearch1;

import org.junit.Test;

public class BinarySearch1Test {

	@Test
	public void test() {
		int[] A = {1,2,3,4,5,6,7,8,9,10};
		int num = 2;
		
		BinarySearch1 obj = new BinarySearch1(A, num);
		
		int resultNum = obj.search();
		
		assertEquals(num, resultNum);
	}

}

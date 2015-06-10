package kr.ac.korea.test.sort.insertion;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.sort.insertion.InsertionSort3;

import org.junit.Test;

public class InsertionSort3Test {

	@Test
	public void test() {
		int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
		int[] B = new int[num.length];
		
		System.arraycopy(num, 0, B, 0, num.length);
		Arrays.sort(B);
		
		InsertionSort3 obj = new InsertionSort3(num);
		obj.sort();
		assertArrayEquals(B, num);
	}

}

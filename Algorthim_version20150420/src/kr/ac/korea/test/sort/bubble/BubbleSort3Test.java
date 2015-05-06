package kr.ac.korea.test.sort.bubble;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.sort.bubble.BubbleSort3;

import org.junit.Test;

public class BubbleSort3Test {
	
	@Test
	public void test() {
		int[] A = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
		int[] B = new int[A.length];
		System.arraycopy(A, 0, B, 0, B.length);
		Arrays.sort(B);
		BubbleSort3 obj = new BubbleSort3(A);
		
		obj.sort();
		
		assertArrayEquals(B, A);
	}

}

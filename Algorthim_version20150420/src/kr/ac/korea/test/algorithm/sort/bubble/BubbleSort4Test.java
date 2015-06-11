package kr.ac.korea.test.algorithm.sort.bubble;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.algorithm.sort.bubble.BubbleSort4;

import org.junit.Test;

public class BubbleSort4Test {

	@Test
	public void test() {
		int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
		int[] B = new int[num.length];
		
		System.arraycopy(num, 0, B, 0, num.length);
		Arrays.sort(B);
		
		BubbleSort4 obj = new BubbleSort4(num);
		obj.sort();
		assertArrayEquals(B, num);
	}

}

package kr.ac.korea.test.algorithm.sort.selection;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.algorithm.sort.selection.SelectionSort2;

import org.junit.Test;

public class SelectSort2Test {

	@Test
	public void test() {
		int[] numArray = {5,6,2,8,1,4,3,9,7,10};
		int[] B = new int[numArray.length];
		System.arraycopy(numArray, 0, B, 0, B.length);
		SelectionSort2 obj = new SelectionSort2(numArray);
		
		Arrays.sort(B);
		obj.sort();
		
		assertArrayEquals(numArray, B);
	}

}

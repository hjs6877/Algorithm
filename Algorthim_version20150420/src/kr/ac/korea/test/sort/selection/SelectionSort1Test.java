package kr.ac.korea.test.sort.selection;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.algorithm.sort.selection.SelectionSort1;

import org.junit.BeforeClass;
import org.junit.Test;

public class SelectionSort1Test {
	private static SelectionSort1 obj;
	private static int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
	private static int[] B = new int[num.length];
	
	@BeforeClass
	public static void init(){
		obj = new SelectionSort1(num);
		System.arraycopy(num, 0, B, 0, B.length);
		Arrays.sort(B);
	}
	
	@Test
	public void createObjectTest() {
		assertNotNull(obj);
	}
	
	@Test
	public void sortTest(){
		obj.sort();
		assertArrayEquals(B, num);
	}

}

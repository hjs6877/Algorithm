package kr.ac.korea.test.sort.insertion;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.algorithm.sort.insertion.InsertionSort1;

import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSort1Test {
	private static int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
	private static int[] B;
	private static InsertionSort1 is;
	
	@BeforeClass
	public static void init(){
		
		is = new InsertionSort1(num);
		
		B = new int[num.length];
		System.arraycopy(num, 0, B, 0, 10);
		Arrays.sort(B);
	}
	
	@Test
	public void createObjectTest() {
		assertNotNull(is);
	}

	@Test
	public void sortTest(){
		is.sort();
		assertArrayEquals(num, B);
	}
}

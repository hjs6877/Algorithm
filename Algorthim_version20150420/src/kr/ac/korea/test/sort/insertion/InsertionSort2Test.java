package kr.ac.korea.test.sort.insertion;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.sort.insertion.InsertionSort2;

import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSort2Test {
	private static int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
	private static int[] B;
	private static InsertionSort2 obj;
	
	@BeforeClass
	public static void init(){
		
		obj = new InsertionSort2(num);
		
		B = new int[num.length];
		System.arraycopy(num, 0, B, 0, 10);
		Arrays.sort(B);
	}
	
	@Test
	public void test() {
	
		obj.sort();
		
		assertArrayEquals(num, B);
	}

}

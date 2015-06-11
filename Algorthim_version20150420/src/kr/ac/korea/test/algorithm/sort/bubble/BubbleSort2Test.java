package kr.ac.korea.test.algorithm.sort.bubble;

import java.util.Arrays;

import kr.ac.korea.algorithm.sort.bubble.BubbleSort2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSort2Test {
	private static int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
	private static int[] B;
	private static BubbleSort2 bs;
	
	@BeforeClass
	public static void init(){
		bs = new BubbleSort2(num);
		B = new int[num.length];
		System.arraycopy(num, 0, B, 0, B.length);
		Arrays.sort(B);
	}
	
	@Test
	public void createObjectTest(){
		assertNotNull(bs);
		assertEquals(num, bs.getNum());
	}
	
	@Test
	public void sortTest(){
		bs.sort();
		assertArrayEquals(B, num);
	}
}

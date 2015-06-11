package kr.ac.korea.test.algorithm.sort.bubble;

import static org.junit.Assert.*;

import java.util.Arrays;

import kr.ac.korea.algorithm.sort.bubble.BubbleSort1;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Bubble Sort 테스트.
 * 
 * @author hjs6877
 *
 */
public class BubbleSort1Test {
	private static int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
	private static int[] B;
	private static BubbleSort1 bs;
	
	@BeforeClass
	public static void init(){
		bs = new BubbleSort1(num);
		
		B = new int[num.length];
		System.arraycopy(num, 0, B, 0, B.length);
		Arrays.sort(B);
	}
	
	
	@Test
	public void createObjectTest() {
		assertNotNull(bs);
		assertArrayEquals(num, bs.getNum());
	}

	@Test
	public void sort(){
		bs.sort();
		assertArrayEquals(B, num);
	}
}

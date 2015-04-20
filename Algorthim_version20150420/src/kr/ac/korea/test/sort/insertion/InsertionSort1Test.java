package kr.ac.korea.test.sort.insertion;

import static org.junit.Assert.*;
import kr.ac.korea.sort.insertion.InsertionSort1;

import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSort1Test {
	private static int[] num = {2, 5, 1, 10, 9, 3, 8, 6, 7, 4};
	private static InsertionSort1 is;
	
	@BeforeClass
	public static void init(){
		is = new InsertionSort1(num);
	}
	
	@Test
	public void createObjectTest() {
		assertNotNull(is);
	}

}

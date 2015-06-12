package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.string.PermutationChecker;

import org.junit.BeforeClass;
import org.junit.Test;

public class PermutationCheckerTest {

	private static PermutationChecker obj;
	
	@BeforeClass
	public static void init(){
		obj = new PermutationChecker();
	}
	@Test
	public void test() {
		String str1 = "abcda";
		String str2 = "cdbaa";
		
		boolean isPermutation = obj.isPermutation(str1, str2);
		assertEquals(true, isPermutation);
	}

	@Test
	public void test2(){
		String s = "abacda";
		String t = "acadab";
		
		boolean actual = obj.isPermutation2(s, t);
		
		assertEquals(true, actual);
	}
}

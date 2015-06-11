package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.string.PermutationChecker;

import org.junit.Test;

public class PermutationCheckerTest {

	@Test
	public void test() {
		String str1 = "abcda";
		String str2 = "cdbaa";
		
		PermutationChecker obj = new PermutationChecker();
		
		boolean isPermutation = obj.isPermutation(str1, str2);
		assertEquals(true, isPermutation);
	}

}

package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.string.IsSubstringChecker;

import org.junit.Test;

public class IsSubstringCheckerTest {

	@Test
	public void test() {
		String s1 = "abcda";
		String s2 = "bcdac";
		IsSubstringChecker obj = new IsSubstringChecker();
		boolean isRotationString = obj.isSubstring(s1, s2);
		
		assertEquals(true, isRotationString);
	}

}

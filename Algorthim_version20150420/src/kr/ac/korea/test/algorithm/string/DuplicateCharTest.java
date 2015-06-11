package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.string.DuplicateCharChecker;

import org.junit.Test;

public class DuplicateCharTest {

	@Test
	public void test() {
		String str = "abcdefghijklmna";
		DuplicateCharChecker checker = new DuplicateCharChecker();
		
		boolean isUnique = checker.isUniqueChar(str);
		
		assertEquals(false, isUnique);
	}

}

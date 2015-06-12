package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.string.StringCompressor;

import org.junit.Test;

public class StringCompressTest {

	@Test
	public void test() {
		String s = "aabcccabbaaaaaa";
		
		StringCompressor obj = new StringCompressor();
		String result = obj.compress(s);
		
		assertEquals("a2b1c3a1b2a6", result);
	}

}

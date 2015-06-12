package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;
import kr.ac.korea.algorithm.string.ReplaceSpaceCharManager;

import org.junit.Test;

public class ReplaceSpaceCharTest {

	@Test
	public void test() {
		String s = "My name is  Kevin.";
		ReplaceSpaceCharManager obj = new ReplaceSpaceCharManager();
		String result = obj.replace(s);
		
		assertEquals("My%20name%20is%20%20Kevin.", result);
	}

}

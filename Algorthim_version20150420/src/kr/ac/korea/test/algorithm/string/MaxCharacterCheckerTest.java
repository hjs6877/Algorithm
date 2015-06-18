package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Scanner;

import kr.ac.korea.algorithm.string.MaxCharacterChecker;

import org.junit.BeforeClass;
import org.junit.Test;

public class MaxCharacterCheckerTest {
	private static MaxCharacterChecker obj;
	
	@BeforeClass
	public static void setUp(){
		obj = new MaxCharacterChecker();
	}
	
	@Test
	public void test() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		Map<String, Object> resultMap = obj.findMaxSingleChacter(s);
		assertEquals('p', resultMap.get("maxCharacter"));
	}

}

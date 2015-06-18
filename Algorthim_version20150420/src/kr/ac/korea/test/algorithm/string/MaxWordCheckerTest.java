package kr.ac.korea.test.algorithm.string;

import static org.junit.Assert.*;

import java.util.Scanner;

import kr.ac.korea.algorithm.string.MaxWordChecker;

import org.junit.BeforeClass;
import org.junit.Test;

public class MaxWordCheckerTest {
	private static MaxWordChecker obj;
	
	@BeforeClass
	public static void setUp(){
		obj = new MaxWordChecker();
	}
	
	@Test
	public void test() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		assertEquals("pentasecuritysystem", obj.findMaxWord(s));
	}

}

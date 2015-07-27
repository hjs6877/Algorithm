package kr.ac.korea.test.algorithm.basic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kr.ac.korea.algorithm.basic.FizzBuzz;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		int n = 15;
		List<String> expected = Arrays.asList(new String[]{
				"1","2","Fizz","4", "Buzz", "Fizz","7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"});
		List<String> actual = FizzBuzz.getFizzBuzzList(n);
		
		assertEquals(expected, actual);
	}

}

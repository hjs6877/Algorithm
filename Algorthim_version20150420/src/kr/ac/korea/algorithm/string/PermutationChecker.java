package kr.ac.korea.algorithm.string;

import java.util.Arrays;

public class PermutationChecker {

	public boolean isPermutation(String str1, String str2){
		return sort(str1).equals(sort(str2));
	}
	
	private String sort(String str){
		char[] cArray = str.toCharArray();
		Arrays.sort(cArray);
		return new String(cArray);
	}
}

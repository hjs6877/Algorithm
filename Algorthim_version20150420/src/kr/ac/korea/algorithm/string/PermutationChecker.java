package kr.ac.korea.algorithm.string;

import java.util.Arrays;

public class PermutationChecker {

	public boolean isPermutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
	
	private String sort(String str){
		char[] cArray = str.toCharArray();
		Arrays.sort(cArray);
		return new String(cArray);
	}
	
	public boolean isPermutation2(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		int[] countStr = new int[256];
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		for(char c : str1Arr){
			countStr[c]++;
		}
		
		for(char c : str2Arr){
			/**
			 * 이부분이 핵심 키포인트. 왜 0보다 작아야하는가?
			 * : 두 문자열이 순열 관계가 되려면 각 문자의 출현 횟수가 같아야 하는데 다른 문자열이 하나라도 포함이 되면
			 * 출현하지 않은 문자열이 되고 이 문자열을 증감시키면 0보다 작게되므로 순열 관계가 아니므로 fasle가 된다.
			 */
			if(--countStr[c] < 0){
				return false;
			}
		}
		
		return true;
	}
}

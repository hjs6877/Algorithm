package kr.ac.korea.algorithm.string;

/**
* 문제 2: 임의의 문자열을 입력받아 가장 긴 단어를 출력하시오.
* Constraints
* - 단어의 길이가 동일한 단어의 경우 먼저 출현한 단어를 가장 긴 단어로 간주한다.
* 
* @author hjs6877
*
*/
public class MaxWordChecker {
	public String findMaxWord(String s){
		String[] strs = s.split(" ");
		String maxString = "";
		
		for(String str : strs){
			if(str.length() > maxString.length()){
				maxString = str;
			}
		}
		
		return maxString;
	}
}

package kr.ac.korea.algorithm.string;

public class IsSubstringChecker {

	public boolean isSubstring(String s1, String s2) {
		if(s1.length() != s2.length()){
			return false;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[] countChar = new int[256];
		for(char c : c1){
			countChar[c]++;
		}
		
		for(char c : c2){
			
			if(--countChar[c] < 0){
				return false;
			}
		}
		return true;
	}

}

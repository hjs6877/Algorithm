package kr.ac.korea.algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharChecker {

	public char isDuplicate(String str) {
		for(int i=0; i < str.length(); i++){
			char c1 = str.charAt(i);
			for(int j=i+1; j < str.length(); j++){
				char c2 = str.charAt(j);
				
				if(c1 == c2){
					return c1;
				}
			}
		}
		return 0;
	}

	public char isDuplicateMap(String str){
		Map<Character, Boolean> map = new HashMap<Character, Boolean>();
		
		for(int i=0; i < str.length(); i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				return c;
			}else{
				map.put(c, true);
			}
		}
		return 0;
	}
	
	public boolean isUniqueChar(String str){
		if(str.length() > 256){
			return false;
		}
		
		boolean[] uniqueChar = new boolean[256];
		
		for(int i=0; i < str.length(); i++){
			char c = str.charAt(i);
			if(uniqueChar[c]){
				return false;
			}else{
				uniqueChar[c] = true;
			}
		}
		return true;
	}
}

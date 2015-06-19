package kr.ac.korea.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 1: 임의의 문자열을 입력받아 가장 많이 출현한 문자와 출현 횟수를 출력하시오.
 * Constraints
 * - 가장 많이 출현한 문자 1개이상이라면 먼저 출현한 문자가 가장 많은 문자가 된다.
 * - 알파벳의 경우 대소문자를 구분한다.
 * 
 * @author hjs6877
 *
 */
public class MaxCharacterChecker {
	private Map<String, Object> resultMap;
	private int maxNum = 0;
	private char maxCharacter = 0;
	
	public MaxCharacterChecker(){
		resultMap = new HashMap<String, Object>();
	}
	
	public Map<String, Object> findMaxSingleChacter(String s){
		char[] c = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		/**
		 * 1. 기존에 출현한 문자가 맵에 저장되어 있으면 카운트를 1증가 시켜서 맵에 저장.
		 * 2. 출현한 문자의 출현한 횟수가 maxNum보다 크다면 maxNum을 num으로 교체, 
		 * 현재 출현한 문자를 maxCharacter로 교체.  
		 */
		for(int i=0; i < c.length; i++){
			char ch = c[i];
			if(map.containsKey(ch)){
				int num = map.get(ch);
				map.put(c[i], ++num);
				
				this.setMaxNum(ch, num);
			}else{
				map.put(ch, 1);
				int num = map.get(ch);

				this.setMaxNum(ch, num);
			}
		}
		
		resultMap.put("maxCharacter", maxCharacter);
		resultMap.put("maxNum", maxCharacter);
		return resultMap;
	}
	
	public void setMaxNum(char ch, int num){
		if(num > maxNum){
			maxNum = num;
			maxCharacter = ch;
		}
	}
}

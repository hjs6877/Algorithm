package kr.ac.korea.topcoder.easy;

import java.util.HashMap;
import java.util.Map;

public class InterestingParty {
	public int bestInvitation(String[] first, String[] second){
		int maxNum = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i < first.length; i++){
			
			this.updateCount(map, first[i]);
			this.updateCount(map, second[i]);
			
			maxNum = Math.max(maxNum, map.get(first[i]));
			maxNum = Math.max(maxNum,  map.get(second[i]));
		}
		return maxNum;
	}
	
	private void updateCount(Map<String, Integer> map, String interest){
		if(map.containsKey(interest)){
			map.put(interest, map.get(interest)+1);
		}else{
			map.put(interest, 1);
		}
		
	}
}

package kr.ac.korea.topcoder.easy;

/**
 * 75.03 points
 * 
 * 1. 병에 따르는 횟수만큼 루프를 돈다.
 * 2. from bottle의 용량 + to bottle의 용량 > to bottle의 용량보다 크다면, 
 * to bottle의 최대 용량까지만 from bottle을 따른다.
 * 3. from bottle의 용량 + to bottle의 용량 > to bottle의 용량보다 작거나 같다면,
 * to bottle에 from bottle의 양을 모두 따라 붓는다.
 *  
 * @author hjs6877
 *
 */
public class KiwiJuiceEasy {
	 public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
		 for(int i=0; i < fromId.length; i++){
			 if(bottles[fromId[i]] + bottles[toId[i]] > capacities[toId[i]]){
				 bottles[fromId[i]] = bottles[fromId[i]] - (capacities[toId[i]] - bottles[toId[i]]);
				 bottles[toId[i]] = bottles[toId[i]] + (capacities[toId[i]] - bottles[toId[i]]);
			 }else{
				 bottles[toId[i]] = bottles[toId[i]] + bottles[fromId[i]];
				 bottles[fromId[i]] = 0;
			 }
		 }
		 return bottles;
	 }
}

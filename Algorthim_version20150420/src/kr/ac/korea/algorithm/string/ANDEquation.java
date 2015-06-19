package kr.ac.korea.algorithm.string;

/**
 * 75 point obtained.
 * 
 * @author ideapad
 *
 */
public class ANDEquation {
	public int restoreY(int[] A){
		int num = 0;
		if(A.length < 2){
			return -1;
		}else{
			for(int i=0; i < A.length; i++){
				num = A[i];
				int andNum = Integer.MAX_VALUE;
				for(int j=0; j < A.length; j++){
					if(i != j){
						andNum = andNum & A[j];
					}
				}
				
				if(num == andNum){
					return num;
				}
			}
		}
		
		return -1;
	}
}

package kr.ac.korea.sort.bubble;

public class BubbleSort3 {
	private int[] A;

	public BubbleSort3(int[] A){
		this.A = A;
	}
	
	public void sort(){
		boolean isChanged;
		do{
			isChanged = false;
			
			for(int i=0; i < A.length-1; i++){
				if(A[i] > A[i+1]){
					int temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					
					isChanged = true;
				}
			};
		}while(isChanged);
	}
}

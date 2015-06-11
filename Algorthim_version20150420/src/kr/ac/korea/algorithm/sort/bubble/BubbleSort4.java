package kr.ac.korea.algorithm.sort.bubble;

public class BubbleSort4 {
	private int[] num;

	public BubbleSort4(int[] num){
		this.num = num;
	}
	
	public void sort(){
		boolean isChanged;
		
		do{
			isChanged = false;
			for(int i=num.length-1; i >0; i--){
				if(num[i] < num[i-1]){
					int temp = num[i];
					num[i] = num[i-1];
					num[i-1] = temp;
					
					isChanged = true;
				}
			}
		}while(isChanged);
	}
}

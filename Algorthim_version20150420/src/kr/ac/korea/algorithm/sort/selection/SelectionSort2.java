package kr.ac.korea.algorithm.sort.selection;

public class SelectionSort2 {
	private int[] num;
	
	public SelectionSort2(int[] num){
		this.num = num;
	}
	
	public void sort(){
		for(int i=0; i < num.length; i++){
			
			int minPos = i;
			
			for(int j=minPos; j < num.length; j++){
				if(num[j] < num[minPos]){
					minPos = j;
				}
			}
			
			int temp = num[minPos];
			num[minPos] = num[i];
			num[i] = temp;
		}
	}
}

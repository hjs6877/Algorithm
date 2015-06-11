package kr.ac.korea.algorithm.sort.selection;

public class SelectionSort1 {
	private int[] num;
	
	public SelectionSort1(int[] num){
		this.num = num;
	}
	
	public void sort(){
		for(int i=0; i < num.length-1; i++){
			int min = i;
			for(int j = min+1; j < num.length; j++){
				if(num[min] > num[j]){
					min = j;
				}
			}
			
			int temp = num[i];
			num[i] = num[min];
			num[min]= temp;
		}
	}
}

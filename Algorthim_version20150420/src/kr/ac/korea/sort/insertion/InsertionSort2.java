package kr.ac.korea.sort.insertion;

public class InsertionSort2 {
	private int[] num;
	
	public InsertionSort2(int[] num){
		this.num = num;
	}
	
	public void sort(){
		for(int i=0; i < num.length; i++){
			for(int j=i; j > 0 && num[j] < num[j-1]; j--){
				int temp = num[j];
				num[j] = num[j-1];
				num[j-1] = temp;
			}
		}
	}
}

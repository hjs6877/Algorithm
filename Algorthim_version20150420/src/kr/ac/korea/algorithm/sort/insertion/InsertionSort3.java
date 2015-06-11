package kr.ac.korea.algorithm.sort.insertion;

public class InsertionSort3 {
	private int[] num;
	
	public InsertionSort3(int[] num){
		this.num = num;
	}
	
	/**
	 * 0보다 큰 원소를 기준으로 역방향으로 순회하면서 n 과 n-- 비교시 작으면 서로 교환하여 정렬.
	 */
	public void sort(){
		for(int i=0; i < num.length; i++){
			for(int j=i; (j > 0) && (num[j] < num[j-1]); j--) {
				int temp = num[j];
				num[j] = num[j-1];
				num[j-1] = temp;
			}
		}
	}
}

package kr.ac.korea.search;

public class BinarySearch1 {
	private int[] A;
	private int num;
	
	public BinarySearch1(int[]A, int num){
		this.A = A;
		this.num = num;
	}
	
	public int search(){
		int findNum = 0;
		
		int left = 0;
		int right = A.length-1;
		int mid = 0;
		while(left < right){
			/**
			 * mid 값을 정확하게 구하는것이 중요함.
			 */
			mid = ((right-left+1)/2) + left;
			
			if(num == mid){
				findNum = mid;
				return findNum;
			}else if(num > mid){
				left = mid+1;
			}else if(num < mid){
				right = mid-1;
			}
		}
		
		return findNum;
	}
}

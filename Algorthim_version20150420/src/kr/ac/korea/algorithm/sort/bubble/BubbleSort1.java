package kr.ac.korea.algorithm.sort.bubble;

public class BubbleSort1 {
	private int[] num;
	
	public BubbleSort1(int[] num){
		this.num = num;
	}
	
	public void sort(){
		int BOUND = -1;
		int n = num.length-1;
		int top;
		
		do{
			// 버블 정렬은 오름차순으로 정렬이 다 될때까지 배열의 마지막 원소에서부터 다시 비교를 해야 됨.
			top = n;
			boolean isExchanged = false;
			for(int i=top-1; i > BOUND; i--){
				if(num[top] < num[i]){
					int temp = num[top];
					num[top] = num[i];
					num[i] = temp;
					
					isExchanged = true;
				}
				
				top = i;
			}
			
			/**
			 * 이미 오름차순으로 정렬이 되어있는 경우라면 O(n)의 시간 복잡도 만큼만 수행 하도록 while 문을 빠져 나오게 만든다.
			 */
			if(!isExchanged){
				top = n;
			}
			
			BOUND = top;
		}while(top < n);
	}
	
	public int[] getNum(){
		return num;
	}
}

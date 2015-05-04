package kr.ac.korea.sort.bubble;

public class BubbleSort2 {
	int[] num;
	
	public BubbleSort2(int[] num){
		this.num = num;
	}
	
	
	public int[] getNum() {
		return num;
	}


	public int[] sort(){
		int BOUND = -1;
		int n= num.length - 1;
		int top;
		
		do{
			top = n;
			boolean isExchanged = false;
			for(int i=top-1; i > BOUND; i--){
				if(num[top] < num[i]){
					int temp = num[top];
					num[top] = num[i];
					num[i] = temp;
					
					isExchanged = true;
				}
				
				// 비교해야 될 top-1이 다음번 비교때 top이 됨.
				top = i;
			}
			
			// 서로 교환이 일어나지 않았을 때, 이미 최종 정렬이 된 상태이므로 loop를 빠져 나올 조건을 만들어 준다.
			if(!isExchanged){
				top = n;
			}
			
			BOUND = top;
		}while(top < n);
		return null;
	}
}

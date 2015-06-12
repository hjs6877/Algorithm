package kr.ac.korea.topcoder.easy;

public class FallingSand {
	/**
	 * 1.  2각 row의 문자열을 문자 배열로 분리해서 2차원 배열을 만든다.
	 * 2. 마지막 row-1부터 역순으로 마지막 row까지 현재 row와 다음 row의 cell을 비교.
	 *  - top row 전까지 반복.
	 * 3. 현재 row의 cell과 이전 row의 cell을 비교.
	 *  - 현재 row의 cell이 비어 있고, 이전 row의 cell이 'ㅇ'일 경우에만 cell 데이터를 서로 교체.
	 * 4. 각 row의 cell 배열을 문자열로 합친후 board에 각각 추가.
	 * 
	 * @param board
	 * @return
	 */
	public String[] simulate(String[] board){
		
		char[][] A = new char[board.length][];
		
		/**
		 * 2차원 배열 생성.
		 */
		for(int i=0; i < A.length; i++){
			
			char[] a = board[i].toCharArray();
			A[i] = a;
		}
		
		/**
		 * bottom 바로 위의 row부터 bottom까지 비교 수행을 top까지 반복.
		 */
		for(int i=A.length-2; i > 0; i--){
			for(int j=i; j < A.length; j++){
				for(int k=0; k < A[i].length; k++){
					if((A[j][k] == '.') && (A[j-1][k] == 'o')){
						char temp = A[j][k];
						A[j][k] = A[j-1][k];
						A[j-1][k] = temp;
					}
				}
			}
		}
		
		/**
		 * 수행 된 결과 문자배열을 문자열 배열로 다시 구성하여 board 배열에 저장. 
		 */
		for(int i=0; i < A.length; i++){
			board[i] = new String(A[i]);
		}
		
		
		for(int i=0; i < board.length; i++){
			System.out.println(board[i]);
		}
		return board;
	}
}

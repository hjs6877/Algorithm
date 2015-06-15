package kr.ac.korea.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class MetrixProblem1 {
	private int[][] num;
	
	public MetrixProblem1(int[][] num) {
		this.num = num;
	}

	/**
	 * 입력으로 받은 row와 col과 같은 row이거나 col인 원소를 0으로 변경.
	 * 
	 * @param row
	 * @param col
	 */
	public void replaceAllZero() {
		boolean[] row = new boolean[num.length];
		boolean[] col = new boolean[num[0].length];
		
		for(int i=0; i < num.length; i++){
			for(int j=0; j < num[i].length; j++){
				if(num[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0; i < num.length; i++){
			for(int j=0; j < num[i].length; j++){
				if(row[i] || col[j]){
					num[i][j] = 0;
				}
			}
		}
	}

	
	public int getMetrixElement(int row, int col) {
		return num[row][col];		
	}
}

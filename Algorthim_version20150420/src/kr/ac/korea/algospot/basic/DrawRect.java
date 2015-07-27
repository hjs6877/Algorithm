package kr.ac.korea.algospot.basic;

import java.util.Scanner;

public class DrawRect {
	/**
	 * 2개의 좌표가 같다면 나머지 좌표와 같다는 원리를 이용.
	 * @param args
	 */
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for(int i=0; i < count; i++){
			int x[] = new int[3];
			int y[] = new int[3];
			   
			int resultX = 0;
			int resultY = 0;
			
			x[0] = scanner.nextInt();
			y[0] = scanner.nextInt();
		
			x[1] = scanner.nextInt();
			y[1] = scanner.nextInt();
		
			x[2] = scanner.nextInt();
			y[2] = scanner.nextInt();
		
			if(x[0]==x[1]){
				resultX = x[2];
			}else if(x[0]==x[2]){
				resultX = x[1];
			}else{
				resultX = x[0];
			}
			
			if(y[0]==y[1]){
				resultY = y[2];
			}else if(y[0]==y[2]){
				resultY = y[1];
			}else{
				resultY = y[0];
			}
			System.out.println(resultX + " " + resultY);
		}
    }
}

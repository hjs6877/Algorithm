package kr.ac.korea.algospot.lowlevel;

import java.util.Scanner;

public class HotSummer {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num-- > 0){
			int time = 9;
			int targetValue = scanner.nextInt();
			int total = 0;
			for(int i=0; i < time; i++){
				total += scanner.nextInt();
			}
			
			if(total <= targetValue){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}

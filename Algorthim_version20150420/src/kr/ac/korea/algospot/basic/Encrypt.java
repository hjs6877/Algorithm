package kr.ac.korea.algospot.basic;

import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		int count = scanner1.nextInt();
		
		for(int i=0; i < count; i++){
			Scanner scanner2 = new Scanner(System.in);
			String str = scanner2.nextLine();
			
			if(str.length() <= 100){
				StringBuffer sb = new StringBuffer();
				
				for(int j=0; j < str.length(); j++){
					if(j % 2 == 0){
						sb.append(str.charAt(j));
					}
				}
				
				for(int j=0; j < str.length(); j++){
					if(j % 2 != 0){
						sb.append(str.charAt(j));
					}
				}
				
				System.out.println();
			}
			
		}
	}
}

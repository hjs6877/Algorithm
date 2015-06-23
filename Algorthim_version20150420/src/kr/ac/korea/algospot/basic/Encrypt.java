package kr.ac.korea.algospot.basic;

import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		int count = scanner1.nextInt();
		char[] ch = new char[100];
		
		for(int i=0; i < count; i++){
			String str = scanner1.next();
			ch = str.toCharArray();
			
			for(int j=0; j < ch.length; j+=2){
				System.out.print(ch[j]);
			}
			
			for(int j=1; j < ch.length; j+=2){
				System.out.print(ch[j]);
			}
			
			System.out.println();
		}
	}
}


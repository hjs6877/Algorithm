package kr.ac.korea.algospot.lowlevel;

import java.util.Scanner;

/**
 * 주어진 입력의 숫자만큼 "Hello Algospot!"을 출력하는 문제.
 * 
 * @author 황정식
 *
 */
public class Mercy {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(int num = sc.nextInt(); num > 0; num--){
			System.out.println("Hello Algospot!");
		}
	}
}

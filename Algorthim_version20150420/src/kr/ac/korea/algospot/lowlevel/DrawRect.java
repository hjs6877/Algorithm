package kr.ac.korea.algospot.lowlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 직사각형의 임의의 3개의 꼭지점 좌표(x,y)가 입력으로 주어졌을때
 * 마지막 남은 꼭지점의 좌표(x,y)를 표시하는 알고리즘
 * 
 * @author 황정식
 *
 */
public class DrawRect {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		for(int k=0; k < count; k++){
			int[] xArr = new int[3];
			int[] yArr = new int[3];
			
			/**
			 * 공백을 기준으로 입력 된 x, y를 각각의 배열에 저장.
			 */
			for(int j=0; j < 3; j++){
				ir = new InputStreamReader(System.in);
				br = new BufferedReader(ir);
				String str = br.readLine();
				int x = Integer.parseInt(((String[])str.split(" "))[0]);
				int y = Integer.parseInt(((String[])str.split(" "))[1]);
				
				if(((x > 0) && (x <=1000)) && (y > 0) && (y <=1000)){
					xArr[j] = x;
					yArr[j] = y;
				}else{
					return;
				}
				
			}
			
			
		}
		
	}
}

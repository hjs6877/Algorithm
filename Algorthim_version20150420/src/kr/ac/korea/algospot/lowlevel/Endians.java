package kr.ac.korea.algospot.lowlevel;

import java.util.Scanner;

/**
 * 주어진 입력의 숫자를 이진수로 변환한후, 빅엔디언으로 표시된것을
 * 리틀 엔디언으로 표시해주는 문제.
 * 
 * @author 황정식
 *
 */
public class Endians {
	public static int main(String[] args){
		System.out.print("input Count: ");
		Scanner scanner = new Scanner(System.in);
		
		long count = scanner.nextInt();
		long result = 0;
		
		/**
		 * 입력된 숫자를 비트 연산중 '&' 연산을 shift 연산을
		 * 통해 바이트 단위로 값의 위치를 옮긴다.
		 */
		for(int i=0; i < count; i++){
			Scanner scannerNum = new Scanner(System.in);
			
			int num = scannerNum.nextInt();
			
			result = ((num & 255) << 24) + ((num & (255 << 8)) << 8) + ((num & (255 << 16)) >> 8) + ((num & (255 << 24)) >> 24);
			
			System.out.println(result);
		}
		
		return 0;
	}
}

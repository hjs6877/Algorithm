package kr.ac.korea.algospot.lowlevel;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lecture {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		
		for(int j=0; j < count; j++){
			
			String str  = scanner.next();
			
			int length = str.length();
			
			List<String> list = new ArrayList<String>();
			
			String unitStr = "";
			
			
			int i = 0;
			do{
				if(i == 0){
					unitStr += str.charAt(i);
					i++;
					continue;
				}
				
				if(i % 2 == 0){
					list.add(unitStr);
					unitStr = "";
					
					if(i == length){
						break;
					}else{
						unitStr += str.charAt(i);
					}
				}else{
					unitStr += str.charAt(i);
				}
				
				i++;
			}while(i <= length);
			
			Collections.sort(list);
			
			StringBuffer sb = new StringBuffer();
			for(String strr : list){
				sb.append(strr);
			}
			
			System.out.println(sb.toString());
		}
		
	}
}

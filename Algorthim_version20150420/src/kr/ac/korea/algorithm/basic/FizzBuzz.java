package kr.ac.korea.algorithm.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 3의 배수일 경우 "Fizz", 5의 배수일 경우 "Buzz" 15의 배수일 경우 "FizzBuzz"를 출력,
 * 이외의 경우에는 숫자를 출력.
 * @author hjs6877
 *
 */
public class FizzBuzz {
	
	public static List<String> getFizzBuzzList(int n) {
		List<String> list = new ArrayList<>();
		for(int i=1; i<=n; i++){
			String word = makeWord(i, 3, "Fizz") + makeWord(i, 5, "Buzz");
			if(word.isEmpty()){
				list.add(Integer.toString(i));
			}else{
				list.add(word);
			}
		}
		
		return list;
	}

	private static String makeWord(int num, int multiple, String word) {
		
		return num % multiple == 0 ? word : "";
	}

}

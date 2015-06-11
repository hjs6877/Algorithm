package kr.ac.korea.datastructure.arraylist;

import java.util.ArrayList;

public class ArrayListManager {

	public ArrayList<String> merge(String[] wordsA, String[] wordsB) {
		ArrayList<String> list = new ArrayList<String>();
		
		for(String wordA : wordsA){
			list.add(wordA);
		}
		
		for(String wordB : wordsB){
			list.add(wordB);
		}
		
		return list;
	}

}

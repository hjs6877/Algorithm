package kr.ac.korea.test.datastructure.arraylist;

import static org.junit.Assert.*;

import java.util.ArrayList;

import kr.ac.korea.datastructure.arraylist.ArrayListManager;

import org.junit.Test;

public class ArrayList1Test {

	@Test
	public void test() {
		String[] wordsA = {"atom", "adam", "avoid"};
		String[] wordsB = {"bad", "bed", "bag"};
		
		ArrayListManager aManager = new ArrayListManager();
		ArrayList<String> list = aManager.merge(wordsA, wordsB);
		
		assertEquals("atom", list.get(0));
		assertEquals("bag", list.get(5));
		assertEquals(6, list.size());
	}

}

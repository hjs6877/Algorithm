package kr.ac.korea.test.topcoder.easy;

import static org.junit.Assert.*;
import kr.ac.korea.topcoder.easy.InterestingParty;

import org.junit.Test;

public class InterestingPartyTest {

	@Test
	public void test() {
		String[] first0 = {"fishing", "gardening", "swimming", "fishing"};
		String[] second0 = {"hunting", "fishing", "fishing", "biting"};
		String[] first1 = {"variety", "diversity", "loquacity", "courtesy"};
		String[] second1 = {"talking", "speaking", "discussion", "meeting"};
		String[] first2 = {"snakes", "programming", "cobra", "monty"};
		String[] second2 = {"python", "python", "anaconda", "python"};
		String[] first3 = {"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"};
		String[] second3 = {"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"};
		
		InterestingParty obj = new InterestingParty();
		
		int actual0 = obj.bestInvitation(first0, second0);
		int actual1 = obj.bestInvitation(first1, second1);
		int actual2 = obj.bestInvitation(first2, second2);
		int actual3 = obj.bestInvitation(first3, second3);
		
		assertEquals(4, actual0);
		assertEquals(1, actual1);
		assertEquals(3, actual2);
		assertEquals(6, actual3);
	}

}

package kr.ac.korea.test.topcoder.easy;

import static org.junit.Assert.*;
import kr.ac.korea.topcoder.easy.KiwiJuiceEasy;

import org.junit.Test;

public class KiwiJuiceEasyTest {

	@Test
	public void test() {
		int[] capacities1 = {20, 20};
		int[] bottles1 = {5, 8};
		int[] fromId1 = {0};
		int[] toId1 = {1};
				
		int[] capacities2 = {10, 10};
		int[] bottles2 = {5, 8};
		int[] fromId2 = {0};
		int[] toId2 = {1};
		
		int[] capacities3 = {30, 20, 10};
		int[] bottles3 = {10, 5, 5};
		int[] fromId3 = {0, 1, 2};
		int[] toId3 = {1, 2, 0};
		
		int[] capacities4 = {14, 35, 86, 58, 25, 62};
		int[] bottles4 = {6, 34, 27, 38, 9, 60};
		int[] fromId4 = {1, 2, 4, 5, 3, 3, 1, 0};
		int[] toId4 = {0, 1, 2, 4, 2, 5, 3, 1};
		
		
		int[] expecteds1 = {0, 13};
		int[] expecteds2 = {3, 10};
		int[] expecteds3 = {10, 10, 0};
		int[] expecteds4 = {0, 14, 65, 35, 25, 35};
		
		KiwiJuiceEasy obj = new KiwiJuiceEasy();
		
		int[] actuals1 = obj.thePouring(capacities1, bottles1, fromId1, toId1);
		int[] actuals2 = obj.thePouring(capacities2, bottles2, fromId2, toId2);
		int[] actuals3 = obj.thePouring(capacities3, bottles3, fromId3, toId3);
		int[] actuals4 = obj.thePouring(capacities4, bottles4, fromId4, toId4);
		
		assertArrayEquals(expecteds1, actuals1);
		assertArrayEquals(expecteds2, actuals2);
		assertArrayEquals(expecteds3, actuals3);
		assertArrayEquals(expecteds4, actuals4);
	}
	

}

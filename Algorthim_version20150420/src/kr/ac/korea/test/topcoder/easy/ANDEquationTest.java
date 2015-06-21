package kr.ac.korea.test.topcoder.easy;

import static org.junit.Assert.*;
import kr.ac.korea.topcoder.easy.ANDEquation;

import org.junit.Test;

public class ANDEquationTest {

	@Test
	public void test() {
		int[] A1 = {1, 3, 5};
		int[] A2 = {31, 7};
		int[] A3 = {31, 7, 7};
		int[] A4 = {1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1};
		int[] A5 = {191411,256951,191411,191411,191411,256951,195507,191411,192435,191411, 191411,195511,191419,191411,256947,191415,191475,195579,191415,191411, 191483,191411,191419,191475,256947,191411,191411,191411,191419,256947, 191411,191411,191411};
		ANDEquation obj = new ANDEquation();
		
		assertEquals(1, obj.restoreY(A1));
		assertEquals(-1, obj.restoreY(A2));
		assertEquals(7, obj.restoreY(A3));
		assertEquals(0, obj.restoreY(A4));
		assertEquals(191411, obj.restoreY(A5));
	}

}

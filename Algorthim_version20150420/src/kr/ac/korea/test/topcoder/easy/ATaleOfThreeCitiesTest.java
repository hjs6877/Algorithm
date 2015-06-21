package kr.ac.korea.test.topcoder.easy;

import static org.junit.Assert.*;
import kr.ac.korea.topcoder.easy.ATaleOfThreeCities;

import org.junit.Test;

public class ATaleOfThreeCitiesTest {

	@Test
	public void test1() {
		ATaleOfThreeCities obj = new ATaleOfThreeCities();
		
		int ax[] = {0,0,0};
		int ay[] = {0,1,2};
		int bx[] = {2,3};
		int by[] = {1,1};
		int cx[] = {1,5};
		int cy[] = {3,28};
		
		double actual = obj.connect(ax, ay, bx, by, cx, cy);
		System.out.println(actual);
	}
	
	@Test
	public void test2() {
		ATaleOfThreeCities obj = new ATaleOfThreeCities();
		
		int ax[] = {-2,-1,0,1,2};
		int ay[] = {0,0,0,0,0};
		int bx[] = {-2,-1,0,1,2};
		int by[] = {1,1,1,1,1};
		int cx[] = {-2,-1,0,1,2};
		int cy[] = {2,2,2,2,2};
		
		double actual = obj.connect(ax, ay, bx, by, cx, cy);
		System.out.println(actual);
	}

	@Test
	public void test3() {
		ATaleOfThreeCities obj = new ATaleOfThreeCities();
		
		int ax[] = {4,5,11,21,8,10,3,9,5,6};
		int ay[] = {12,8,9,12,2,3,5,7,10,13};
		int bx[] = {34,35,36,41,32,39,41,37,39,50};
		int by[] = {51,33,41,45,48,22,33,51,41,40};
		int cx[] = {86,75,78,81,89,77,83,88,99,77};
		int cy[] = {10,20,30,40,50,60,70,80,90,100};
		
		double actual = obj.connect(ax, ay, bx, by, cx, cy);
		System.out.println(actual);
	}
}

package kr.ac.korea.test.topcoder.easy;

import static org.junit.Assert.*;
import kr.ac.korea.topcoder.easy.FallingSand;

import org.junit.Test;

public class FallingSandTest {

	@Test
	public void test() {
		String[] board = {"oxxxxooo", "xooooxxx", "..xx.ooo", "oooox.o.", "..x....."};
		String[] expected = {"oxxxxooo", "x.oo.xxx", "..xxo...", ".oo.x.o.", "ooxo.ooo" };
		FallingSand obj = new FallingSand();
		
		String[] actual = obj.simulate(board);
		assertArrayEquals(expected, actual);
	}

}

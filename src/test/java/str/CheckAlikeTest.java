package str;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckAlikeTest {
	CheckAlike checkAlike;

	@Before
	public void initialize() {
		checkAlike = new CheckAlike();
	}

	@Test
	public void trueTest1() {
		String str1 = "pale";
		String str2 = "ple";
		assertTrue(checkAlike.isAlike(str1, str2));
	}

	@Test
	public void trueTest2() {
		String str1 = "ple";
		String str2 = "pale";
		assertTrue(checkAlike.isAlike(str1, str2));
	}

	@Test
	public void trueTest3() {
		String str1 = "pale";
		String str2 = "bale";
		assertTrue(checkAlike.isAlike(str1, str2));
	}

	@Test
	public void falseTest() {
		String str1 = "pale";
		String str2 = "bake";
		assertFalse(checkAlike.isAlike(str1, str2));
	}
}

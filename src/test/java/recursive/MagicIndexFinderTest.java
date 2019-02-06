package recursive;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MagicIndexFinderTest {

	@Test
	public void test() {
		int[] index = {-1, 0, 1, 3, 5, 6, 7, 8 };
		int result = MagicIndexFinder.search(index);
		assertThat(result, is(3));
	}

}

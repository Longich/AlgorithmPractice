package recursive;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FindRouteTest {
	FindRoute findRoute;

	@Before
	public void setUp() throws Exception {
		findRoute = new FindRoute();
	}

	@Test
	public void test() {
		boolean[][] b = new boolean[3][3];
		for(int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = true;
			}
		}
		List<Point> route = findRoute.getPath(b);
		assertNotNull(route);
		System.out.println(route);
	}

	@Test
	public void test2() {
		boolean[][] b = new boolean[3][3];
		for(int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = true;
			}
		}
		b[1][0] = false;
		List<Point> route = findRoute.getPath(b);
		assertNotNull(route);
		System.out.println(route);
	}
}

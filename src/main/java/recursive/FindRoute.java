package recursive;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class FindRoute {

	public FindRoute() {
	}

	public List<Point> getPath(boolean[][] maze) {
		if (maze == null || maze.length == 0) return null;
		List<Point> path = new ArrayList<>();
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path)) {
			return path;
		}
		return null;

	}

	private boolean getPath(boolean[][] point, int row, int col, List<Point> path) {
		if (row < 0 || col < 0 || !point[row][col]) return false;

		boolean isAtOrigin = (row == 0) && (col == 0);

		if (isAtOrigin || getPath(point, row, col - 1, path) || getPath(point, row - 1, col, path)) {
			Point p = new Point(row, col);
			path.add(p);
			return true;
		}

		return false;
	}

}

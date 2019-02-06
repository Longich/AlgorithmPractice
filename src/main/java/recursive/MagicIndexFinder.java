package recursive;

public class MagicIndexFinder {
	public static int search(int[] a) {
		return search(a, 0, a.length - 1);
	}

	private static int search(int[] index , int start, int end) {
		if (end - start  == 1) {
			if (index[start] == start) return start;
			if (index[end]   == end)   return end  ;
			return -1;
		}
		int half = (start + end) / 2;
		if (index[half]  == half) {
			return half;
		} else if (index[half] > half) {
			return search(index, start, half);
		} else {
			return search(index, half, end);
		}
	}
}

import java.util.*;

public class ZeroSum {

	public static long findSubarray(long[] arr, int n) {
		long ret = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum == 0) {
				ret++;
			}
			if (!map.isEmpty() && map.containsKey(sum)) {
				ret += map.get(sum);
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int n = 10;
		long arr[] = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		System.out.println(findSubarray(arr, n));
	}

}

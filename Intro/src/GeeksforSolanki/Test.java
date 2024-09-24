package GeeksforSolanki;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
	    // Function to count number of ways to reach the nth stair
	    // when order does not matter.
		
	    Long countWays(int n) {
	        Long res[] = new Long[n + 1];

	        // base cases
	        res[0] = 1L;
	        res[1] = 1L;

	        // storing number of ways to reach the ith index as
	        // number of ways to reach (i-2)th index +1.
	        for (int i = 2; i <= n; i++) res[i] = (res[i - 2] + 1);

	        // returning the result.
	        return res[n];
	    }
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			// taking total number of stairs
			int n = sc.nextInt();

			Test s = new Test();
			System.out.println(s.countWays(n));
		}

	}
	
}
	
	
	
	
	

//	public Long getWays(int m, int one[], int two[], HashSet<String> hs) {
//		if (m <= 0) {
//			String s = one[0] + "1" + two[0] + "2";
//			if (hs.contains(s) == false) {
//				hs.add(s);
//				return 1l;
//			}
//			return 0l;
//		}
//		one[0]++;
//		Long first = getWays(m - 1, one, two, hs);
//		one[0]--;
//		Long second = 0l;
//		if (m >= 2) {
//			two[0]++;
//			second = getWays(m - 2, one, two, hs);
//			two[0]--;
//		}
//		return first + second;
//	}
//
//	Long countWays(int m) {
//		HashSet<String> hs = new HashSet<String>();
//		Long result = getWays(m, new int[1], new int[1], hs);
//		return result;
//	}
//}

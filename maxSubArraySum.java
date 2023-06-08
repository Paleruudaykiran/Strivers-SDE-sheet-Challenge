public class maxSubArraySum {
    public static long maxSubarraySum(int[] arr, int n) {
		long maxi = 0;
		long curMaxi = 0;
		for(int i=0;i<n;i++) {
			curMaxi += arr[i];
			if(curMaxi > maxi) {
				maxi = curMaxi;
			}
			if(curMaxi < 0) curMaxi = 0;
		}
		 return maxi;
	}
}

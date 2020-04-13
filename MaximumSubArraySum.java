/**
 * Given an integer array, return an integer representing the maximum possible
 * sum of the contiguous subarray.
 *
 * Uses Kadane’s Algorithm (Assumes that there is atleast one positive number in the array)
 */

public class MaximumSubArraySum {
    public int maxSubArray(final List<Integer> A) {
        int length = A.size();
        int max = Integer.MIN_VALUE; //The maximum sum until now
        int tempMax = 0; //current max value which is reset to 0 when the sum is negative
        for(int i = 0; i < length; i++) {
            tempMax = tempMax + A.get(i);
            if(max < tempMax) {
                max = tempMax;
            }
            if(tempMax < 0) {
                tempMax = 0;
            }
        }
        return max;
    }
}

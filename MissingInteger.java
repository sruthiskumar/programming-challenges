/**
 * Given an unsorted integer array, find the first missing positive integer.
 * Example: [3,4,-1,1] return 2,
 *          [-8, -7, -6] returns 1
 */

public class MissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        if(A.size() == 0) {
            return 1;
        }
        int[] arr = new int[A.size()];
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) > 0 && A.get(i) < A.size()+1) {
                arr[A.get(i)-1] = -1;
            }
        }
        for(int i = 0; i < A.size(); i++) {
            if(arr[i] == 0) {
                return i+1;
            }
        }
        return A.size()+1;
    }
}

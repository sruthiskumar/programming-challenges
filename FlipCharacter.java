/**
 * Given a binary array, find the maximum number ones in an array with one
 * flip of a subarray allowed. A flip operation switches all 0s to 1s and 1s to 0s.
 */
 
public class FlipCharacter {
    public ArrayList<Integer> flip(String A) {
         if(!A.contains("0")) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        int maxDiff = 0, diff = 0;
        int start = 0;
        for (int i = 0; i < A.length(); i++) {
            diff += A.charAt(i) == '0' ? 1 : -1;

            if (diff < 0) {
                diff = 0;
                start = i + 1;
                continue;
            }

            if (diff > maxDiff) {
                maxDiff = diff;
                result.clear();
                result.add(start+1);
                result.add(i+1);
            }
        }
        return result;
    }
}

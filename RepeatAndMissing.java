/**
 * Given an integer array of N integers,from 1 to n.
 *Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 */

public class RepeatAndMissing {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
          int[] input1 = new int[A.size()];
        ArrayList<Integer> out = new ArrayList<Integer>();

        int repeat = 0;
        int missing = 0;

        for(int i = 0; i < A.size(); i++) {
            if(input1[A.get(i)-1] == -1) {
                repeat = A.get(i);
            }
            input1[A.get(i)-1] = -1;
        }
        for(int i = 0; i< A.size(); i++) {
            if(input1[i] == 0) {
                missing = i +1;
            }
        }
        out.add(repeat);
        out.add(missing);
        return out;
    }
}

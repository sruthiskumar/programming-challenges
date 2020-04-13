/**
 * Given an infinite 2D grid where you can move in any of the 8 directions :(x,y) to
 *     (x+1, y), (x - 1, y), (x, y+1), (x, y-1), (x-1, y-1), (x+1,y+1), (x-1,y+1),
 *     (x+1,y-1).
 * Given a sequence of points and the order in which you need to cover the points.
 * Return the minimum number of steps in which you can achieve it. You start from the
 * first point.
 *
 * Example:
 * Input : [(0, 0), (1, 1), (1, 2)]
 * Output : 2
 * It takes 1 step to move from (0, 0) to (1, 1). It takes one more step 
 * to move from (1, 1) to (1, 2).
 */
 
 public class MinimumSteps {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
         int count = 0;
        for (int i = 0; i < A.size()-1; i++) {
            int a = A.get(i);
            int b = A.get(i+1);
            int c = B.get(i);
            int d = B.get(i+1);
            int x = Math.abs(a - b);
            int y = Math.abs(c - d);
            while (x > 0 || y > 0) {
                count++;
                x--;
                y--;
            }
        }
        return count;
    }
}

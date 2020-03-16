/**
 * Problem : Given a m * n matrix where m is the number of rows and n the number of columns,
 * return the elements of matrix in spiral order.
 *
 * Example : [ [1, 2 , 3, 4],
 *             [5, 6, 7, 8],
 *             [9, 10, 11, 12],
 *             [13, 14, 15, 16]]
 *
 * will return [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 */

import java.util.ArrayList;
import java.util.List;

public class MatrixInSpiralOrder {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int row = A.size(); // The number of rows
        int col = A.get(0).size(); // Number of columns
        int top = 0; // topmost row of untraversed array
        int bottom = row - 1; // bottom most row of untraversed array
        int left = 0; // leftmost column of untraversed array
        int right = col - 1; rightmost column of untraversed array
        int direction = 0; // There are 4 directions (left to right -> 0, top to bottom -> 1, right to left -> 2, bottom to top -> 3)
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for(int i = left; i <= right; i++) {
                    result.add(A.get(top).get(i));
                }
                direction = 1;
                top ++;
            } else if (direction == 1) {
                for(int i = top; i <= bottom; i++) {
                    result.add(A.get(i).get(right));
                }
                direction = 2;
                right --;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(A.get(bottom).get(i));
                }
                direction = 3;
                bottom --;
            } else if(direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    result.add(A.get(i).get(left));
                }
                direction = 0;
                left ++;
            }
        }
        return result;
    }
}

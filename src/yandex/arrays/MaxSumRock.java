package yandex.arrays;

import java.util.Arrays;

public class MaxSumRock {

    public static void main(String[] args) {
        int[][] board = {{1, 0, 0}, {0, 2, -5}, {3, 1, 1}};
        System.out.println(Arrays.toString(placeRock(board)));
    }

    public static int[] placeRock(int[][] board) {
        int maxRowSum = Integer.MIN_VALUE, maxColSum = Integer.MIN_VALUE;
        int[] ans = new int[2];

        for (int row = 0; row < board.length; row++) {
            int curRowSum = 0;
            for (int col = 0; col < board.length; col++) {
                curRowSum += board[row][col];
                if (curRowSum > maxRowSum) {
                    maxRowSum = curRowSum;
                    ans[0] = row;
                }
            }
        }

        for (int col = 0; col < board.length; col++) {
            int curColSum = 0;
            for (int row = 0; row < board.length; row++) {
                curColSum += board[row][col];
                if (curColSum > maxColSum) {
                    maxColSum = curColSum;
                    ans[1] = col;
                }
            }
        }
        return ans;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Max_coins_from_the_box {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for (int t = 0; t < testcase ; t++) {
            int row  = in.nextInt();
            int col = in.nextInt();
            int[][] arr = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = in.nextInt();

                }
            }
            helper(arr,row,col);
        }
    }

    private static void helper(int[][] arr, int row, int col) {
        int[][] dp = new int[row][col];
        dp[0] = Arrays.copyOf(arr[0],col);

        for (int r = 1; r < row; r++) {
            int[] prevrow = Arrays.copyOf(dp[r - 1],col);
            Arrays.sort(prevrow);
            int firstmax = prevrow[col-1];
            int secondmax = prevrow[col-2];
            for (int c = 0; c < col; c++) {
                if(dp[r-1][c] != firstmax){
                    dp[r][c] = firstmax+arr[r][c];
                }else {
                    dp[r][c] = secondmax + arr[r][c];
                }
            }

        }
        Arrays.sort(dp[row-1]);
        System.out.println(dp[row-1][col-1]);
    }
}

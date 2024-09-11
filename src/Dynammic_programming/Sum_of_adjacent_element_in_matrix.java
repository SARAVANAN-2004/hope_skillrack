package Dynammic_programming;

import java.util.Scanner;

public class Sum_of_adjacent_element_in_matrix {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[] rowdiff = {-1,-1,-1,0,0,1,1,1};
        int[] coldiff = {-1,0,1,-1,1,-1,0,1};
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                int sum = 0;
                for (int i = 0; i < 8; i++) {
                    int adjr = r+rowdiff[i];
                    int adjc = c+coldiff[i];
                    if (adjc >= 0 && adjc < col && adjr >= 0 && adjr < row){
                        sum += arr[adjr][adjc];
                    }

                }
                System.out.print(sum+" ");

            }
            System.out.println();
        }

    }
}

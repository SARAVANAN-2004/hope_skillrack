package Graph_traversal.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class Explosive_tnt {
    // same like the number of the island in the leetcode
    public static  int cnt;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int r=5,c=5;
        char[][] arr = {
                {'E','A','A','E','W'},
                {'A','E','B','E','A'},
                {'X','E','A','N','E'},
                {'C','Z','E','E','E'},
                {'E','Q','B','B','E'}
        };
        int rst = 1,cst = 1;
        cnt = 11;
        dfs(arr,r,c,rst,cst);

        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(cnt);


    }

    private static void dfs(char[][] arr, int r, int c, int rst, int cst) {
        if(rst < 0 || rst >= r ||  cst < 0 || cst>=c || arr[rst][cst] != 'E' ){
            return;
        }
        arr[rst][cst] = 'A';
        System.out.println("r"+rst+"c"+cst);
        cnt--;
        System.out.println("cnt= "+cnt);
        int[] rowdiff = {-1,-1,-1,0,0,1,1,1};
        int[] coldiff = {-1,0,1,-1,1,-1,0,1};
        for (int i = 0; i < 8; i++) {
            int adjr = rst+rowdiff[i];
            int adjc = cst+coldiff[i];
            dfs(arr,r,c,adjr,adjc);
        }
    }

}

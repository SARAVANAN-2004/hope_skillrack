package AtCoderQuestions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

class obj{
    int first;
    int second;

    public obj(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Palindromic_Shortest_Path {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[][] dp = new int[n][n];
        char[][] grid = new char[n][];
        for(int i =0 ;i<n;i++){
            grid[i] = in.next().toCharArray();
        }
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
        Queue<obj> que = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
            que.add(new obj(i,i));
        }
        for(int r = 0;r<n;r++){
            for (int c = 0; c < n; c++) {
                if(r != c &&  grid[r][c] != '-'){
                    que.add(new obj(r,c));
                }
            }
        }

        while (!que.isEmpty()){
            int x = que.peek().first;
            int y = que.peek().second;
            que.poll();
            for (int left = 0; left < n; left++) {
                for (int right = 0; right < n; right++) {
                    if (grid[left][x] == grid[y][right] && grid[left][x] != '-'){
                        if (dp[left][right] != -1){
                            
                        }
                    }
                }
            }
        }
        for(int r = 0;r<n;r++){
            for (int c = 0; c < n; c++) {
                System.out.print(dp[r][c]+" ");
            }
            System.out.println();
        }

    }
}

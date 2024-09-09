package recursion;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class House_Robber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1],arr[i] + dp[i-2]);
        }
        System.out.println(dp[n-1]);
    }

}

package Dynammic_programming;

import java.util.Arrays;

public class longest_common_subsequence {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abacus";
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i < s1.length()+1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {
                char ch1 = s1.charAt(i-1);
                char ch2 = s2.charAt(j-1);
                if(ch1 == ch2){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        // print

        for (int i = 0; i < s1.length() + 1; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}

package Kmp_agorithm;

import java.util.Arrays;
import java.util.Scanner;

public class lps_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] lps = new int[s.length()];
        int streakIdx = 0;
        lps[0] = 0;
        for (int i = 1; i < s.length(); ) {
            if(s.charAt(i) == s.charAt(streakIdx)){
                lps[i] = streakIdx + 1;
                streakIdx++;
                i++;
            }else {
                if (streakIdx == 0){
                    lps[i] = 0;
                    i++;
                }
                streakIdx = 0;
            }
        }
        System.out.println(Arrays.toString(lps));
    }
}

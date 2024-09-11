package Dynammic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_increase_order_subsequence_cnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = {-7,1,3,2,10,8,9,11,15};

        int[] lis = new int[n];
        Arrays.fill(lis,1);
        for (int idx = 0; idx < n; idx++) {
            for (int prev = 0; prev < idx; prev++) {
                if (arr[prev] < arr[idx] && lis[prev] >= lis[idx]){
                    lis[idx] = lis[prev]+1;
                }
            }
        }
        System.out.println(Arrays.toString(lis));
        

    }
}

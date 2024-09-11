package Bitwise_Operation;

import java.util.Scanner;

public class Subarray_sum_cnt {
    // leetcode 560 subarray sum equals to k
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = in.nextInt();
        }
        int sum = in.nextInt();
        int l = 0;
        int r = 0;
        int cursum = 0;
        int cnt = 0;
        while (r < n && l<= r){
            if(cursum == sum){
                cnt++;
                cursum -= arr[l];
                l++;
            } else if (cursum < sum) {
                cursum += arr[r];
                r++;
            }else {
                cursum -= arr[l];
                l++;
            }
        }
        if (cursum == sum){
            cnt++;
        }
        System.out.println(cnt);
    }
}

package Dynammic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class word_ladder_without_map {
    // Aproch 1 It has the best space complexity so prefer this
        /*
        reverse the entire arr that is 0 to n-1
        reverse form 0 to r-1
        reverse from r to n-1
         */
    // Approach 2
        /*
        store from n-r to n-1
        then store from 0 to n-r
         */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int r = in.nextInt() % n;
        reverse(arr,0,n-1);
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        System.out.println(Arrays.toString(arr));


    }
    static  void  reverse(int[] arr,int left,int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

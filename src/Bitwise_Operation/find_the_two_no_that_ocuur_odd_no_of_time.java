package Bitwise_Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class find_the_two_no_that_ocuur_odd_no_of_time {
    // here the two no are occured odd no of the time other are occured in the single time
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int currval;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            currval = in.nextInt();
            arr[i] = currval;
            result ^= currval;
        }
        int ans1 = 0;
        int ans2 = 0;
        int shift = 0;
        while ((result & (1 << shift)) == 0){
            // we need to find in the which shift num the rescult is zero
            shift++;
        }
        for (int i = 0; i < n; i++) {
            if(((arr[i] & (1 << shift)) == 1)){
                ans1 ^= arr[i];
            }else{
                ans2 ^= arr[i];
            }
        }
        System.out.println(ans1+" "+ ans2);
    }
}

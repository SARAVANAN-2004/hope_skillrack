package Bitwise_Operation;

import java.util.Scanner;

public class Min_number_toggle_to_convert_n_to_m {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int diff = (n^m);
        int cnt = 0;
        // use Brian Kernighan's Algorithm
        while (diff != 0) {
            diff = diff & (diff - 1);  // Clears the lowest set bit in 'diff'
            cnt++;                     // Increments the count of set bits
        }
        // or
        int cnt2 = 0;
        while (diff!= 0){
            if((diff&1) == 1){
                cnt2++;
            }
            diff = diff >> 1;  // or we can use the diff = diif/2 both are same
        }

        System.out.println(cnt);

    }
}

package Bitwise_Operation;

import java.util.Scanner;

public class find_the_no_which_occur_odd_no_of_time {
    // in this question the all the number are occur even no of the time eecept a no is odd
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int currval;
        for (int i = 0; i < n; i++) {
            currval = in.nextInt();
//            System.out.println("currval = "+ currval+" result = " +result);
//            System.out.println("binary format");
//            System.out.println(Integer.toBinaryString(currval));
//            System.out.println(Integer.toBinaryString(result));
            result ^= currval;
//            System.out.println("After xor result");
//            System.out.println(Integer.toBinaryString(result));
        }
        System.out.println(result);
    }
}

package Bitwise_Operation;

import java.util.Scanner;

public class Combination_with_Bitwise_operator {
    /*
    given ip = abcd
    we have print all the combination
    op
        using this formula 2^4  there are 16 comnination can be
        the printed
        Combinations:
            Here are all possible combinations (subsets) of the string "abcd":

            Size 0 (Empty set): ""
            Size 1 (Single characters): "a", "b", "c", "d"
            Size 2 (Two characters): "ab", "ac", "ad", "bc", "bd", "cd"
            Size 3 (Three characters): "abc", "abd", "acd", "bcd"
            Size 4 (Full string): "abcd"
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int len = str.length();
//        for (int ctr = 1;ctr <(1<<n);ctr++){
//
//            for (int shift = 0; shift < n; shift++) {
//                if((ctr & (1<<shift)) != 0){
//                    System.out.print(s.charAt(shift)+" ");
//                }
//                System.out.println();
//            }
//        }
        for(int ctr=1;ctr<(1<<len);ctr++){
            for(int shift=0;shift<len;shift++){
                if((ctr&(1<<shift))!=0){
                    System.out.print(str.charAt(shift));
                }
            }
            System.out.println();
 }

    }
}

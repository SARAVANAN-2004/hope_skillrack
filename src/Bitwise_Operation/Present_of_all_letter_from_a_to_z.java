package Bitwise_Operation;

import java.util.Scanner;

public class Present_of_all_letter_from_a_to_z {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = 0;
        for (int idx = 0; idx < s.length() ; idx++) {
            char ch = s.charAt(idx);
            result = result | (1 << ch - 'a');
        }
        System.out.println(result == ((1<<26) -1) ? "yes":"no");
        for (int shift = 0; shift <= 31; shift++) {

            if ( (result & (1<< shift)) != 0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
    }
}

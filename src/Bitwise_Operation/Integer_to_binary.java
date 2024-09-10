package Bitwise_Operation;

import java.util.Scanner;

public class Integer_to_binary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        for (int shift = 0; shift <= 30; shift++) {

            if ( (n & (1<< shift)) != 0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
    }
}

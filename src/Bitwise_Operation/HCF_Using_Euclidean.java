package Bitwise_Operation;

import java.util.Scanner;

public class HCF_Using_Euclidean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(HCF(a,b));
    }
    static int HCF(int a,int b){
        // In the euclidean algorithm
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        return  HCF(b%a,a%b);
    }
}

package recursion;

import java.util.Scanner;

public class ToBinary {
    static String ans = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        toBinary(n);
    }

    private static void toBinary(int n) {
        if(n <=1){
            System.out.print(ans);
            if(n != 0){
                System.out.println(n);
            }
            return;
        }
        ans  += (n%2);
        toBinary(n/2);
    }
}

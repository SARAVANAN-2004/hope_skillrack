package recursion;

import java.util.Scanner;

public class one_to_N {
    // we use the head recursion here
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printValues(n);
    }
    public static void printValues(int n){
        if(n == 0){
            return;
        }
        printValues(n-1);
        System.out.println(n);

    }
}

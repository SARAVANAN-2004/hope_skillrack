package Bitwise_Operation;

import java.util.Scanner;
import java.util.Stack;

public class Remove_the_adjacent_Elements {
    /*
    if i/p is 10 20 30 40 40 50 50 30 20 500
    o/p is 10 500
    1st removal 40 40
    arr became 10 20 30  50 50 30 20 500
    2nd removal 40 40
    arr became 10 20 30  30 20 500
    3rd removal 40 40
    arr became 10 20 20 500
    4th removal 40 40
    arr became 10 500
    op is 10 500
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> st  = new Stack<>();
        int currval;
        for (int i = 0; i < n; i++) {
            currval = in.nextInt();
            if (st.empty() || st.peek() != currval){
                st.push(currval);
            }else{
                st.pop();
            }
        }
        print(st);
    }
    public static void print(Stack<Integer> stack){
        if (stack.empty()){
            return;
        }
        int temp = stack.pop();
        print(stack);
        System.out.print(temp+" ");
    }
}

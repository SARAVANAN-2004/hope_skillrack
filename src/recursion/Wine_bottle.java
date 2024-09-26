package recursion;

import java.util.Scanner;

public class Wine_bottle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        int[][] max = new int[n][n];
        System.out.println(maxRevemue(prices,max,0,n-1,1));

    }

    private static int maxRevemue(int[] prices, int[][] max, int left, int right, int year) {
        if (max[left][right] != 0){
            return max[left][right];
        }
        if (left == right){
            return (prices[left] * year);
        }
        int leftrevenue= (prices[left]*year) + maxRevemue(prices, max, left+1, right, year+1);
        int rightrevenue = (prices[right]*year) + maxRevemue(prices, max, left, right-1, year+1);
        max[left][right] = Math.max(leftrevenue,rightrevenue);
        return max[left][right];
    }
}

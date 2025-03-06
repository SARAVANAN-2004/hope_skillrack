package kadane_algorithm;

import java.util.Scanner;

public class Maximum_subarray_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = arr[0];
        int maxi = sum;
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum+arr[i],arr[i]);
            maxi = Math.max(maxi,sum);
        }
        System.out.println("maximum sum is "+maxi);

    }
}

package kadane_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cnt_the_subarray_sum_eqaul_to_target {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        System.out.println(solve(arr,n,sum));
    }

    private static int solve(int[] nums, int n, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;

        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(sum == k) cnt++;

            if(map.containsKey(sum-k)){
                cnt += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return cnt;
    }
}

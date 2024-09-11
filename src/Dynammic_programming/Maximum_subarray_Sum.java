package Dynammic_programming;

public class Maximum_subarray_Sum {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {50,-100,20,30,-100,50,60,100,-200,-10};
        int cursum = arr[0] < 0 ? 0 : arr[0];
        int maxsum = Math.max(0,arr[0]);
        for (int i = 1; i < n; i++) {
            cursum += arr[i];
            if(cursum <0){
                cursum = 0;
            }
            maxsum = Math.max(cursum,maxsum);

        }
        System.out.println(maxsum);
    }
}

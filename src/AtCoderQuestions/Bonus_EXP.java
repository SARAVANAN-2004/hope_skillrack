package AtCoderQuestions;

import java.util.Scanner;

class  Obj{
    long data;
    boolean isEven;

    public Obj(long data, boolean isEven) {
        this.data = data;
        this.isEven = isEven;
    }
}

// https://atcoder.jp/contests/abc369/tasks/abc369_d
public class Bonus_EXP {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr= new long[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextLong();
        }
        long[] odd=new long[n+1];
        long[] even=new long[n+1];

        odd[1]=arr[1];
        even[1]=0;
        for(int i=2;i<=n;i++){
            odd[i]=Math.max(even[i-1]+arr[i],odd[i-1]);
            even[i]=Math.max(odd[i-1]+2*arr[i],even[i-1]);
        }

        System.out.print(Math.max(odd[n],even[n]));
    }
}

/*
Input
5
1 5 3 2 7
Sample Output 1
Copy
28
 */


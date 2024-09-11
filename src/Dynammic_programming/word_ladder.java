package Dynammic_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class word_ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Character,String> map = new HashMap<>();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
            map.put(arr[i].charAt(0),arr[i]);

        }
        int st = in.nextInt()-1;
        char ch = arr[st].charAt(0);
        while (map.containsKey(ch)){
            String temp = map.get(ch);
            System.out.println(temp);
            ch = temp.charAt(temp.length()-1);
        }
    }

}

package Bitwise_Operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longest_string_consist_of_equal_no_1_and_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int maxLen = 0;
        String s = in.next();
        map.put(0,0);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1'){
                cnt++;
            }else {
                cnt--;
            }
            if (!map.containsKey(cnt)){
                map.put(cnt,i);
            }else{
                maxLen = Math.max(maxLen,i - map.get(cnt));
            }

        }
        System.out.println(maxLen);
    }
}

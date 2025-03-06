package AtCoderQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LOWER {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] arr =in.next().toCharArray();
        n = in.nextInt();
        boolean  changed = false;
        boolean is_capitalize = false;
        Map<Integer,Character> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            int x =in.nextInt();
            char c = in.next().charAt(0);
            if(t == 1){
                arr[x-1] = c;
                map.put(x-1,c);
            } else if (t == 2) {
                map.clear();
                changed = true;
                is_capitalize = false;
            }else{
                map.clear();
                changed = true;
                is_capitalize = true;
            }
        }

        String s = String.valueOf(arr);
        if(changed && is_capitalize){
            s = s.toUpperCase();
        }else if (changed){
            s = s.toLowerCase();
        }

        char[] res = s.toCharArray();
        for (int i = 0; i < res.length; i++) {
            if(map.containsKey(i)){
                res[i] = map.get(i);
            }
        }
        System.out.println(String.valueOf(res));
    }
}

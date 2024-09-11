package Bitwise_Operation;

public class print_in_rotation {
    public static void main(String[] args) {
        String s = "pencil";
        int n = 100;
        int len = s.length();
        for (int i = 0; i < n/len ; i++) {
            System.out.print(s);
        }
        for (int i = 0; i < n % len; i++) {
            System.out.print(s.charAt(i));
        }
    }
}

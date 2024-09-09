package recursion;

import java.util.Scanner;
// leetcode no : 97. Interleaving String
// https://leetcode.com/problems/interleaving-string/description/
public class Interleaving_String {
    /*
    question
    NOSE
    NECK
    output
    NO N SE ECK - VALID
    NO EN (invalid) SECK - INVALID
    NE OS (invalid) ENCK - INVALID
    N NOSE ECK - VALID
    NOS NECK E - VALID
     */
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        String mix = in.next();
        int len1 = str1.length();
        int len2 =str2.length();
        int mixlen = mix.length();
        if(mixlen != len1+len2){
            System.out.println("invalid");
            return;
        }
        boolean valid = isValidMix(str1, str2, mix,len1,len2,mixlen, 0, 0, 0);
        System.out.println(valid?"valid":"invalid");


    }

    private static boolean isValidMix(String str1, String str2, String mix, int len1, int len2, int mixlen, int idx1,   int idx2, int mixIndex) {
        if(mixIndex == mixlen ){
            return true;
        }
        if (idx1 < len1 && idx2 < len2 && mix.charAt(mixIndex) == str1.charAt(idx1) && mix.charAt(mixIndex) == str2.charAt(idx2) ){
            // check for the both first check wth the st1 and then with the str2
            boolean valid  =  isValidMix(str1,str2,mix,len1,len2,mixlen,idx1+1,idx2,mixIndex+1);
            if(valid){
                return true;
            }else {
                return isValidMix(str1,str2,mix,len1,len2,mixlen,idx1,idx2+1,mixIndex+1);
            }
        } else if (idx1 < len1 && mix.charAt(mixIndex) == str1.charAt(idx1)) {
            // icreacse idx1 and mixlen
            return isValidMix(str1,str2,mix,len1,len2,mixlen,idx1+1,idx2,mixIndex+1);
        } else if (idx2 < len2 && mix.charAt(mixIndex) == str2.charAt(idx2)) {
            // icreacse idx1 and mixlen
            return isValidMix(str1,str2,mix,len1,len2,mixlen,idx1,idx2+1,mixIndex+1);
        }else {
            return false;
        }
    }
}

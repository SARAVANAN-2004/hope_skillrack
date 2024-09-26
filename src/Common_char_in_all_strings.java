public class Common_char_in_all_strings {
    public static void main(String[] args) {
        int[] charr = new int[26];
        String[] arr = {"girafe","fishery","orangeisland","magnetism","engine"};

        for(String s:arr){
            boolean[] valid = new boolean[26];
            for (char ch:s.toCharArray()){
                if(!valid[ch-'a'] ) {
                    charr[ch - 'a']++;
                    valid[ch - 'a'] = true;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (charr[i] >= arr.length-1){
                System.out.println((char)('a'+i));
            }
        }
    }
}     

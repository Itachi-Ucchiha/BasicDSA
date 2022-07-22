public class LongeestSubstring {
    static int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int res = 0;
        for(int i = 0;i<n;i++){
            for(int j = i; j<n; j++){
                if(check(s, i , j)){
                    res= Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    static boolean check(String s , int start , int end){ // to check if charachter is repeating 
        int chars[] = new int[128];         // working with alphabets ..ASCII must less than 128 for alphabets
        for(int i = start; i<=end;i++){
            char c = s.charAt(i);
            chars[c]++;
            if(chars[c]>1){ 
                return false;
            }
        }
        return true;
    }



    // Approach from the sliding window -----------------

    static int lengthOfLongestSubstring(String s) {
        int chars[] = new int[128];
        int left = 0;
        int right = 0;
        int res = 0;
        while(right<s.length()){
            char r = s.charAt(right);
            chars[r]++;
            while(chars[r]>1){
                char x = s.charAt(left);
                chars[x]--;
                left++;
            }     
            res = Math.max(res, right-left+1);
            right++;
        }
        return res;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        // System.out.println(lengthOfLongestSubstring1(s));
        System.out.println(lengthOfLongestSubstring(s));
    }
}

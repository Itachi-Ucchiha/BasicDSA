public class rough {


    static  int strStr2(String haystack, String needle){
        for(int i =0; i<haystack.length();i++){
        int count =0;
        for(int j = 0;j<needle.length() && i+j<haystack.length();j++){
          if(haystack.charAt(i+j)==needle.charAt(j)){
            count++;
          }
          else{
            break;
          }
        }
        if(count==needle.length()){
          return i;
        }
        count = 0;
      }
    return -1;
    }
   

    public static void main(String[] args) {
        String haystack  = "mississippi";
        String needle = "issip";
        System.out.println(strStr1(haystack,needle));
        
        System.out.println(strStr2(haystack,needle));

    }
}

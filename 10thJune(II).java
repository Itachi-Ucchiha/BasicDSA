public class KMP_Pattern_matching {
 


    public static void main(String[] args) {
        String str = "batmanandrobinarebat";
        String pattern = "bat";
        int n = str.length();
        int p = pattern.length();
        int []lps = new int[n];
        int i = 0;
        int j = 0;
        while(i<n){
            if(pattern.charAt(j)==str.charAt(i)){
                i++;
                j++;
            }
            if(j==p){
                System.out.println("Pattern Found at: "+(i-j));
                j = lps[j-1];
                // j = 0;
            }
            else if(i<n && pattern.charAt(j)!=str.charAt(i)){
                if(j==0){
                    i++;
                }
                else{
                    j = lps[j-1];
                    // j = 0;
                }
            }

        }
    }
}

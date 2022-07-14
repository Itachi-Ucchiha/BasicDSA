public class RobinKrap_Pattern {
    

    public static void main(String[] args) {
        /*Rabin karp

        formula = T(at i+1) = (T(at i)-txt[i]*d^(p-1))*d - txt[i+p]
            where , p = pattern length
                    T = hash code of string 



        1. Slide the pattern one by one.
        2. Do the hash
        3. If hash are same then compare the character.
        4. repeat step 1 if again still string exhauxst

        // TC = O(n+m) --> avg+best
        // TC = O(mn) --> worst
        
        */
        // String str = "AXAYABCDAXABZZAWABAD";
        // String pattern = "AB";
        String str = "batmanandrobinarebat";
        String pattern = "bat";
        int n = str.length();
        int p = pattern.length();
        int d = p;      // d is pattern length... can be any number... (our choice)
        int q = 13;         // any prime number ... (our choice)
        int x = 1;
        int stringHash = 0;
        int patternHash = 0;

        for(int i =0; i<p-1; i++){
            x=(x*d)%q;          // for finding d^(m-1)
        }


        for(int i = 0; i<p;i++){
            patternHash = (patternHash * d + (pattern.charAt(i)))%q;
            stringHash = (stringHash * d + (str.charAt(i)))%q;
        }


        // now sliding window logic
        for(int i =0; i<=n-p; i++){
            if(stringHash==patternHash){    // for checking spurius hit
                int j;
                for(j=0; j<p;j++){
                    if(pattern.charAt(j)!=str.charAt(i+j)){
                        break;
                    }
                }
                if(j==p){   
                    System.out.println("Pattern match: "+i);
                }
            }

            // recompute str
            // updation of window ... by deleting former and adding latter
            if(i<n-p){
                // // removing old string hash of slide
                // stringHash=stringHash-(str.charAt(i)*x);
                // // add new char hash of the slide
                // stringHash=(stringHash*d+str.charAt(i+p))%q;
                stringHash=((stringHash-(str.charAt(i)*x))*d+str.charAt(i+p))%q;
                // T(at i+1) = ((T(at i)-txt[i]*d^(p-1))*d + txt[i+p])%q

                //base case if ..string Hash will become less than 0
                if(stringHash<0){
                    stringHash=stringHash+q;
                }
            }
        }




    }
}

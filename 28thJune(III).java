public class LCSmemoization {
    static int lcs(String first, String second, int m, int n, int[][] cache){
        //base case
        if(m==0 || n==0){
            return 0;
        }
        //memoization
        if(cache[m-1][n-1]!=0){
            return cache[m-1][n-1];
        }
        if(first.charAt(m-1)==second.charAt(n-1)){
            cache[m-1][n-1]=1+lcs(first, second, m-1, n-1, cache);
            return cache[m-1][n-1];
        }
        else{
            cache[m-1][n-1]=Math.max(lcs(first,second,m,n-1,cache), lcs(first,second,m-1,n,cache));
        }
        return cache[m-1][n-1];
         
    }   


    public static void main(String[] args) {
        System.out.println(lcs("AGGTAB","GXTXAYB",6,7,new int[7][8]));
    }
}



//Op = 4

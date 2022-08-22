

public class Fibonacci {
    static int fib(int n, int[] cache){
      // TC with dp = O(n) ...... TC without DP and simple recursion = O(2^n)
        // top down - memoization
        if(n==0 || n==1){
            return n;
        }
        //important line of DP
        // if n is already calculated then return it ... no further calculations
        if(cache[n]!=0){
            return cache[n];
        }
        int first = fib(n-1, cache);
        int second = fib(n-2, cache);
        int sum = first + second;
        //saving the solution
        cache[n] = sum;
        return cache[n];
    }

    // using tabulation
    // same we did in pascal trainagle
    static int fibtabulation(int n , int cache[]){
        cache[0]=0;
        cache[1]=1;
        for(int i = 2; i<=n;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] cache = new int[n+1];
        System.out.println(fib(n, cache));
    }
}

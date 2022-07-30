public class Fibonacci {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }


    static int x=0,y=1,z=0;
    static void fibo(int n){
        if(n>0){
            z=x+y;
            x=y;
            y=z;
            System.out.print(z+",");
            fibo(n-1);
        }
    }
    public static void main(String[] args) {
        // System.out.println(fib(5));
        fibo(5);
        System.out.println();
        for(int i =0 ; i<5; i++){
            System.out.print(fib(i)+",");
        }
    }
}

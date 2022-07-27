public class SumofDigit {
    
    static int sumOfDigit(int n,int sum){
        if(n==0){
            return sum;
        }
        sum+=n%10;
        n/=10;
        return sumOfDigit(n, sum);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(123, 0));
    }
}

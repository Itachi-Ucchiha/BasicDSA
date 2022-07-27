public class CountNumbrOfDigit {
    
    static int countOfDigit(int n, int c){
        if(n==0){
            return c;
        }
        c+=1;
        n/=10;
        return countOfDigit(n, c);
    } 
    public static void main(String[] args) {     
        System.out.println(countOfDigit(1200567, 0));
    }
}

public class CountNumberOfZeroes {

    static int countZero(int n, int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c++;
        }
        return countZero(n/10, c);
    }

    public static void main(String[] args) {
        System.out.println(countZero(102304, 0));
    }
}

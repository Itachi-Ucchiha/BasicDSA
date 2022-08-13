public class Joshephus_problem {
    static int js(int n, int k){
        if(n==1){
            return 1;
        }
        else{
            return (js(n-1,k)+k-1)%n+1;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int k =2;
        System.out.println(js(n, k));
    }
}


// OP = 5

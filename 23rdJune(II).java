public class towerOfHanoi {
    static void tower(int n, char a, char b, char c){
        if(n==1){
            System.out.println(a + " to " + c);
            return;
        }
        tower(n-1,a,c,b);
        System.out.println(a+" to "+c);
        tower(n-1,b,a,c);
    }
    public static void main(String[] args) {
        int n =3 ;
        tower(n,'A','B','C');
    }
}




// OP = 
// A to C
// A to B
// C to B
// A to C
// B to A
// B to C
// A to C

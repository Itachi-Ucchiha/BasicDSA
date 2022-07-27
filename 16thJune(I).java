class recursion{

// tail recursion - when the processing logic is above the small problem
    static void print(int n){
        if(n==0){       // termination case
            return;
        }
        System.out.println(n);  // processing logic
        print(n-1);     // small problem
    }


// head recursion - when the processing logic is below the small problem
    static void print2(int n){
        if(n==0){       // termination case
            return;
        }
        print2(n-1);     // small problem
        System.out.println(n);  // processing logic
    }



// linear recursion 
    static void print3(int n){
        if(n==0){       // termination case
            return;
        }
        System.out.println(n);  // processing logic
        print3(n-1);     // small problem
        System.out.println(n);  // processing logic
    }

    public static void main(String[] args) {
        // print(4);
        System.out.println("=======================");
        print2(4);
    }
}

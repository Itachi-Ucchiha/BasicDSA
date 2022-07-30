public class Pattern1 {

    // printing the stars
    static void printStar(int numberOfStar){
        if(numberOfStar==0){
            return;
        }
        System.out.print("* ");
        numberOfStar-=1;
        printStar(numberOfStar);
    }

    // printing the whitespaces
    static void printSpace(int numberOfSpace){
        if(numberOfSpace==0){
            return;
        }
        System.out.print(" ");
        numberOfSpace-=1;
        printSpace(numberOfSpace);
    }

//----------------------------------------------------------------------------------------


    // pattern 1
    static void printPattern1(int row, int currentRow){
        if(row == 0){
            return;
        }
        printStar(currentRow);
        System.out.println();
        printPattern1(row-1, currentRow+1);
    }


    // pattern 2
    static void printPattern2(int row, int currentRow){
        if(row == 0){
            return;
        }
        printStar(row);
        System.out.println();
        printPattern2(row-1, currentRow+1);
    }

    //pattern 3
    static void printPattern3(int row, int currentRow){
        if(row==0){
            return;
        }
        printSpace(row-1);
        printStar(currentRow);
        System.out.println();
        printPattern3(row-1, currentRow+1);        
    }

    public static void main(String[] args) {
        printPattern1(5,1);
        System.out.println();
        printPattern2(5,1);
        System.out.println();
        printPattern3(5, 1);
    }
}



// OP === 
// *
// * *
// * * *
// * * * *
// * * * * *

// * * * * *
// * * * *
// * * *
// * *
// *

//     *
//    * *
//   * * *
//  * * * *



public class pattern2 {
 
    static void printChar(int noOfChar, int charAscii){
        if(noOfChar == 0){
            return;
        }
        System.out.print((char)(64+charAscii)+" ");
        noOfChar -=1;
        printChar(noOfChar, charAscii);
    }
    static void printPattern4(int row, int currentRow){
        if(row ==0 ){
            return;
        }
        printChar(currentRow, currentRow);
        System.out.println();
        printPattern4(row-1, currentRow+1);
    }


    public static void main(String[] args) {
        printPattern4(5, 1);
    }
}

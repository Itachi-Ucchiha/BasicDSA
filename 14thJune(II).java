public class RotateMatrix {
    static void rotate(int[][] a){
        int [][] arr = new int[a[0].length][a.length];
        for(int i =0; i<a.length; i++){         // transpose logic
            for(int j = 0; j<a[0].length; j++){
                arr[j][i]=a[i][j];
            }
        }
        for(int[] c : arr){
            for( int b : c){
                System.out.print(b+",");
            }System.out.println();
        }
        // now swapping logic 
        for(int[] b : arr){
            for(int i = 0 , j = a[0].length-1; i<a.length/2 ; i++ ,j-- ){
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp; 
                
            }
            for(int c : b){
                System.out.print(c+",");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
    }
}

public class TransposeMatrix {
    
    static int[][] transpose(int[][] matrix) {
        int [][] arr = new int[matrix[0].length][matrix.length];
        for(int i =0; i<matrix.length; i++){
            for(int j =0;j<matrix[0].length;j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1,2,3},{5,6,7}};
        int[][] res = transpose(matrix);


        
        for(int i=0;i<res.length; i++){
            for(int j =0; j<res[i].length; j++){
                System.out.print(res[i][j]+",");
            }
            System.out.println();
        }
    }
}

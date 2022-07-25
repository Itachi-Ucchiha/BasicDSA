public class MatrixDiagonalSum {
    
    static int diagonalSum(int[][] mat){
        int sum = 0;
        if(mat.length == 1){
            return mat[0][0];
        }
        for(int i=0; i<mat.length; i++){
            sum+=mat[i][i];
        }
        int pointer = mat[0].length-1;
        int odd = mat.length/2;
        for(int i=0;i<mat.length;i++){
            if(mat.length%2!=0 && (i==odd && pointer == odd)){
                pointer--;
                continue;
            }
            sum+=mat[i][pointer];
            pointer--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [][] mat  = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}

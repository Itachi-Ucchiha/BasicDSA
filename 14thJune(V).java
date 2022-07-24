public class SetMatrixZero {
    
    static void setZeroes(int[][] matrix){
        int count = 0;
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    count+=1;
                }
            }
        }

        int[][] index = new int[count][2];
        int row = 0;
        int col = 0;
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    index[row][col]=i;
                    index[row][col+1]=j;
                    row++;
                    col=0;
                }
            }
        }
        row = 0;
        col = 0;

        for(int i = 0; i<index.length; i++){
            int changeRow = index[row][col];
            int changecol = index[row][col+1];
            //for rows
            for(int j =0; j<matrix[0].length; j++){
                matrix[changeRow][j] = 0;
            }
            //for cols
            for(int j = 0; j<matrix.length;j++){
                matrix[j][changecol]=0;
            }
            row++;
            col = 0;
        }



        // for(int[] a:index){
        //     System.out.print("{");
        //     for(int b: a){
        //         System.out.print(b+",");
        //     }
        //     System.out.print("}");
        // }


        // for(int i = 0; i<index.length; i++){
        //     int changeRow = index[row][col];
        //     int changecol = index[row][col+1];
        //     System.out.print(changeRow+","+changecol);
        //     System.out.println();
        //     row++;
        //     col = 0;
        // }



        for(int[] a:matrix){
            System.out.print("{");
            for(int b: a){
                System.out.print(b+",");
            }
            System.out.print("}");
        }

    }
    public static void main(String[] args) {
        // int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        
    }
}

public class ToeplitzMatrix {
    
    static boolean istoeplitz(int[][] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr[i].length-1; j++){   // dont go till arr.lenght.... try arr.length-1 otherwise array out of bound 
                if(arr[i][j]!=arr[i+1][j+1]){       
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(istoeplitz(arr));
    }
}

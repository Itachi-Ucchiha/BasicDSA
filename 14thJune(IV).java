import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr[0].length;  // no.of rows
        int n = arr.length;  // no. of colos
        int k = 0;      //starting row index    
        int l = 0;      // starting coloumn index
        /// run loop till k<m;
        int i;
        while(k<m &&l<n){
            // print first row
            for(i = l; i<n ; i++){
                System.out.print(arr[k][i]+",");
            }
            k++;
            // print last col
            for(i = k; i<m;i++){
                System.out.print(arr[i][n-1]+",");
            }
            n--;
            // print last row
            for(i=n-1; i>=l;i--){
                System.out.print(arr[m-1][i]+",");
            }
            m--;
            // print first coloumn reverse
            for(i = m-1; i>=k;i--){
                System.out.print(arr[i][l]+",");
            }
            l++;




        }




    }
}

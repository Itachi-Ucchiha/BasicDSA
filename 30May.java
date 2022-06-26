public class BarChart {


    static int maxEle(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,0,7,5};
        int max = maxEle(arr);
        for(int i=max; i>=1; i-- ) {
            for(int j = 0; j<arr.length; j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
  



//--------------- Output -----------------------------

//                         *
//                         *
//                         *       *
//                         *       *
// *                       *       *
// *                       *       *
// *       *               *       *

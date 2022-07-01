public class prefix {
    

    public static void main(String[] args) {
        int [] arr = {4,7,3,9,2,8};
        int n = arr.length;
        



        ///====================== prefix sum =====================

        int[] psum = new int[arr.length];
        int min = arr[0];
        psum[0] = min;
        for(int i =1; i<arr.length; i++){
            psum[i] = min + arr[i];
            min = psum[i];
        }
        for(int i : psum){
            System.out.print(i+",");
        }
        System.out.println();





        // ================ prefix max ===========================

        int[] pmax = new int[arr.length];
        pmax[0] = arr[0];
        for(int i = 1; i<arr.length;i++ ){
            pmax[i] = Math.max(arr[i], pmax[i-1]);
        }

        for(int i : pmax){
            System.out.print(i+",");
        }
        System.out.println();




        //================ prefix min =============================

        int[] pmin = new int[arr.length];
        pmin[0] = arr[0];
        for(int i = 1; i<arr.length;i++ ){
            pmin[i] = Math.min(arr[i], pmin[i-1]);
        }

 
        for(int i : pmin){
            System.out.print(i+",");
        }
        System.out.println();





      // ============================ Suffix max===================

        int [] suffixMax = new int[n];
        suffixMax[n - 1] = arr[n-1];
        for(int i = n-1; i>0; i--){
            suffixMax[i-1] = Math.max(suffixMax[i], arr[i-1]);
        }

        for(int i : suffixMax){
            System.out.print(i+",");
        }

   }
}



//======================= output ==================================
// 4,11,14,23,25,33,
// 4,7,7,9,9,9,
// 4,4,3,3,2,2,
// 9,9,9,9,8,8,

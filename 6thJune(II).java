public class SubarraySum {
    

    // naive Approach ------------
    static void approach1(int arr[], int k , int n){
        for(int i =0; i<=n-k; i++){
            int sum = 0;
            for(int j = i; j<i+k;j++){
                sum+=arr[j];
            }
            System.out.print(sum+",");
        }
        
    }



    // approach 2 ---
    // window sliding method 
    static void approach2(int[] arr, int k , int n){
        int slideSum =0;
        for(int i =0; i<k;i++){         // this is to get sum of the first k values 
            slideSum=slideSum+arr[i];
        }
        System.out.print(slideSum+",");
        // now the sliding window 
        for(int i =k; i<n;i++){
            slideSum=slideSum+arr[i]-arr[i-k];
            System.out.print(slideSum+",");
        }

    }


    public static void main(String[] args) {
          int [] arr = {1, 2, 3, 4, 5, 6};
          int k = 3;
          int n = arr.length;
          approach1(arr, k, n);
          System.out.println();
          approach2(arr, k, n);

    }
}





// O/P ==============
// 6,9,12,15,
// 6,9,12,15,

class MaxSumSubArray{
static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        long slideSum =0;
        long maxSum = 0;
        // sum of first k elements 
        for(int i =0; i<k;i++){         
            slideSum=slideSum+arr.get(i);
        }
        maxSum = slideSum;
        // now the sliding window
        for(int i =k; i<n;i++){
            slideSum=slideSum+arr.get(i)-arr.get(i-k);
            if(maxSum<slideSum){
                maxSum = slideSum;
            }
        }
        return maxSum;
    }
  
   public static void main(String[] args){
     
     
   }
}

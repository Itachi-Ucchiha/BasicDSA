public class PeakElement {
    


    static void findPeakElement(int[] nums){
        int n = nums.length;
        int peak = 0;
        if(n==1){
            return 0;
        }
        for(int i = 0 ; i<n;i++){
            if(i==0){
                if(nums[i+1]>nums[i]){      /// checking for the 1st element basically it's not a checking 
                                            // here we don't have 1st element's neighbhour  
                    peak = i+1;
                }
            }
            else if(i==n-1){
                if(nums[i-1]<nums[i]){
                    peak = i;
                }
            }
            else{
                if(nums[i-1]<nums[i] && nums[i+1]<nums[i]){ // main logic 
                    peak = i ;
                }
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] arr = {11,2,1,3,5,6,4};
        findPeakElement(arr);
    }
}

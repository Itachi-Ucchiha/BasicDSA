import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    
// Array must be sorted

    static int removeDuplicates(int[] nums, int n){
        int j = 0 ;
        for(int i=1; i<n;i++){
            if(nums[i]!=nums[j]){       // it will skip the indexes if the numbers are same
                j++;                // increment j if numbers are not equal... 
                nums[j]=nums[i];        // then next to the first index add the next number
            }
        }
        return j+1;       
    }
        


    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,2,3,3,3,4,4,4,5};
        int n = nums.length;
        int k = removeDuplicates(nums,n);
        for(int i =0 ; i<n;i++){
            System.out.print(nums[i]+",");
        }
    }
}

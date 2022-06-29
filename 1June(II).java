

public class MissingNumber {
    

// Approach 1 - using simple mathematics
// TC = O(n) and SC = O(1)
// Accepted on leetcode
    static int missingNumber(int[] nums) {       // 1 problem - what if there are large input of data in the array?
//                                                  that will surpass the int range and this will show errors 
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n;i++){
            sum+=nums[i];
        }
        int total = n*(n+1)/2;          // because numbers starting from zero
        int result = total - sum;
        return result; 
    }



// Approach 2 -     Accepted on leetcode
    // XOR approach - XOR works on binary
    // fin the min and max of the array and subtract the range from the original array
    static int approach2(int[] nums){
        int n = nums.length;
        // now the XOR logic 
        int x = 0;  // for the given array
        int y = 0;  // for the missing term also
        for(int i=0; i<n; i++){
            x = x ^ nums[i];     // do XOR for every element in array thus , arr[i] 
        }
        for ( int i = 0; i<=n; i++){    // less than equal to max beacuse we have to menti0n that max too
            y=y^i;          // we are not working with array here so,, do operation with i
        }
        int missing =  x^y;
        return missing;

    }


    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(approach2(arr));
    }
}

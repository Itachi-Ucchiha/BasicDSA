public class OddElement {
    
    // approach 1 - Hashing without making a hashMap
    static void approach1(int[] arr, int n){
        int[] hash = new int[10];       // empty array.... this is like counter how many elements are appearing in original array
                                        // hash[]'s index are no. of times the 
        for(int i = 0; i<n; i++){
            hash[arr[i]] = ++hash[arr[i]];          // main logic - it's more like leniar sort logic
        }
        for(int i = 0; i<hash.length; i++){
            if(hash[i]==1){
                System.out.println("the value is : "+i);
            }
        }
    }


    // approach 2 - XOR approach (Optimized)
    static int XORapproach(int[] nums){
        int ans = 0;
        for(int i =0 ; i<nums.length;i++){
            ans = ans ^ nums[i];        // XOR of the same numbers are 0 ... but XOR of different numbers!=0    .. 
                                        // and XOR of 0 and number is = number 
        }
        return ans;
    } 
    
    

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,6,7,7};
        int n = arr.length;
        approach1(arr, n);       
    }
}





// ------------------- Output --------------------------
// the value is : 6
 

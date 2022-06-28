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



    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,6,7,7};
        int n = arr.length;
        approach1(arr, n);       
    }
}





// ------------------- Output --------------------------
// the value is : 6

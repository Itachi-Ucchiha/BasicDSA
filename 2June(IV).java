public class MajorityElement {
    


    // brute froece appraoach -- compare the current element with the other elements of the array 
    // TC = O(n^2) .... time limit exceeding method...
    static int approach1(int[] nums){
        int n = nums.length;
        int majorityCount = n/2;    // the element should have apperaed more than n/2 times in array
        for(int num : nums){
            int count = 0;
            for(int elem : nums){
                if(elem == num){
                    count+=1;
                }
            }
            if(count>majorityCount){
                return num;
            }
        }
        return 0;
    }




    // approach 2 - hashmap 
    static void approach2(int[] nums){

    }





    // appraoch 3 - Boyer moore Algorithm (basically vote algorithm- used in string questions)
    // if the same element come increment count ... if other element apper decrement the count  
    // TC = O(n) and SC = O(1)
    
    // Algo -  
    /* 
    1 - We maintain a count 
    2 - count is  incremented whenever we see an instance of our array current element is equal to majority element 
    3- else we decrement the count 
    
    */
    
    
    static int appraoch3(int[] nums){
        int n = nums.length;
        int count =0;
        int majorityElement = 0;
        for(int i =0;i<n;i++){
            
            // whenever count == 0 we make a new majority element 
            
            if(count==0){       // counter reset you can say
                majorityElement = nums[i];
                count++;
            }
            else if(majorityElement==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        // now to we have to check what's the last element inside the majorityElement ...
        // and verify if it's lenght is greater than n/2
//         count = 0;
//         for(int i = 0 ; i<n ; i++){
//             if(majorityElement==nums[i]){
//                 count++;
//             }
//         }                                                                            
                                                                          // if will run without the commented code
                                                                        // because we assume that the majority element always exists in the array.
//         int ans = count>n/2?majorityElement:0;
//         return ans;
      return majorityElement;

    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(approach1(arr));

    }
}


// output :
// 3 

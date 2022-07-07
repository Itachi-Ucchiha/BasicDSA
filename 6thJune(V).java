public class ProOfarrayExceftitself {
    

    // naive -- bad approach TC = O(n^2) and SC = O(n)
    // error time limit exceeded for array which have large input 
    static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int [] newarr = new int[n];
        for(int i =0; i<n;i++){
            int product = 1;
            for(int j = 0; j<n; j++){
                if(j!=i){
                    product*=nums[j];
                }
            }
            newarr[i] = product;

        }
        return newarr;
    }





    // simple approach TC = O(n)... SC = O(n)
    // algo - 
    // 1- find the product of all numbers inside the array
    // 2- later divide that product with array element and store it in new array
    // but single 0 and more than two zeres would create some problem... handled in below code
    static int[] productExceptSelf2(int[] nums){
        int productfornum = 1;
        int productforzero = 1;
        int n = nums.length;
        int[] res = new int[n];

        // counting if zeroes are more than 1.... if there are more than 1 zeroes in array the result will be 0
        int zeroCount = 0;
        for(int i =0; i<n; i++){
            if(nums[i]==0){
            zeroCount+=1;
            }
        }
        if(zeroCount>1){
            return res;
        }

        // for nums
        for(int i =0; i<n; i++){
            productfornum*=nums[i];
        } 
        
        // if single 0 of the array encountered
        for(int i =0; i<n; i++){
            if(nums[i]==0){
                continue;
            }
            else{
                productforzero*=nums[i];
            }
        }

        // now dividing the product with the array elements
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                res[i]=productforzero;
            }
            else{
             res[i]=productfornum/nums[i];
            }
        }
        return res;
    }




    // leetcode discussion --- still didn't got this wtf he done ===============================

    static int[] productExceptSelf3(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }


  
 
  

    public static void main(String[] args) {
        int[] arr = {0,0};
        // int[] res = productExceptSelf(arr);
        int[] res = productExceptSelf2(arr);
        for(int x : res){
            System.out.print(x+",");
        }
    }
}

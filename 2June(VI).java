public class NumbersSmallerThanCurrent {
    
  
  
  
  
  
    static int[] approach1(int[] nums){
        int n = nums.length;
        // int i = 0;
        // int j = n-1;
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;

    }

  
  
  


    static int[] approach2(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];    
        int i =0;
        int j = 0;
        int count = 0;
        while(j<n){
            if(nums[i]<nums[j]){
                count+=1;
            }
            if(i==n-1){
                arr[j]=count;
                j++;
                i=0;
                count = 0;
                continue;
            }
            i++;
        }
        return arr;
    }




    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        // O/P = {4,0,1,1,3}
        int[] result  = approach2(arr);
        for(int i : result){
            System.out.print(i+",");
        }
    }
}

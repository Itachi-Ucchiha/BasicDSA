public class TrappingWater {
    




    // we have to find the max height from left i.e - Prefix max 
    // and max height from right i.r - suffixMax
    // the height which will be will be the deciding height 
    // subtract the height of deciding height and current pillar you will get the height of water stored in gap.


    
    static int approach1(int[] height){
        int n = height.length;
        if(n==0){           // if the array will be empty
            return 0;
        }
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = height[0];
        suffixMax[n-1]= height[n-1];


// given array {0,1,0,2,1,0,1,3,2,1,2,1};
        for(int i =1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
        }
        for(int i = n-1; i>0; i--){
            suffixMax[i-1] = Math.max(suffixMax[i], height[i-1]);
        }
     
        // main algorithm starts from here 

        int amountOfWater = 0;
        for(int i = 0; i<n; i++){
           // int currentPillar = height[i];  
            int h1 = prefixMax[i];      // the max height from left till here 
            int h2 = suffixMax[i];      // the max height from right till here 
            int decidingHeight = Math.min(h1, h2);
         //   if(decidingHeight>currentPillar){
                amountOfWater+=decidingHeight-height[i];  //currentPillar;
          //  }

        }
        return amountOfWater;

    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(approach1(arr));

    }
}



// Output ---------------------------
//  6

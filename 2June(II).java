
public class BestTimeToSellBuyStock {


    // brute force approach - not optimized ... returning time exceeding error for large input
    // TC = O(n) and SC = O(1)
    static int approach1(int [] prices){
        int n = prices.length;
        int max = Integer.MIN_VALUE;        // best practice for taking minimum integer value
        for(int i = 0 ; i<n;i++){
            for(int j = i+1; j<n; j++){
                if(max < prices[j]-prices[i]){      // j - i because we have to find the values in increasing day order
                    max =  prices[j]-prices[i];
                }
            }
        }
    
        if(max<0){
            return 0;
        }
        else{
            return max;
        }
    }




    // prefix approach 
    // 1 drawback of prefix approach is auxillary space
    static int approach2(int[] prices){     // {7,1,5,3,6,4}
        int n = prices.length;
        int profit = 0;
        int finalProfit = 0;    // profit at every evaluation
        int[] prefixMin = new int[n];
        prefixMin[0] = prices[0];
        for(int i = 1; i<n;i++){
            prefixMin[i] = Math.min(prefixMin[i-1], prices[i]); // comparing the original array's index value with one less index of prefixMin array
            // store the minimum value in prefix array after comparing both the values
            // {7,1,5,3,6,4} will become in prefixMin = {7,1,1,1,1,1}
        }
        for(int i = 1;i<n;i++){
            finalProfit = prices[i]-prefixMin[i];       // profit at the every instance
            profit = Math.max(profit, finalProfit);
        }
        return profit;
        }





        // highly optimised -
        // TC = O(n)    SC = O(1)
        static int approach3(int[] prices){
            int min = prices[0];
            int finalProfit = 0;
            int profit = 0;
            for(int i= 1; i<prices.length; i++){
                finalProfit = prices[i]-min;
                profit= Math.max(profit, finalProfit);
                min = Math.min(min, prices[i]);
            }
            return profit;

        }


  
  
  
  
    public static void main(String[] args) {
        
        int[] arr = {7,1,5,3,6,4};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach3(arr));
        
}
}



// OP = 5

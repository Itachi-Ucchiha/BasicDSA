import java.util.ArrayList;

public class DiceGameDP {
  
  
  // noramal recursion

    static int countWaysNoDP(int currentValue, int endValue){

        // prositive base case
        if(currentValue==endValue){
            return 1;
        }

        // negative base case
        if(currentValue>endValue){
            return 0;           // this will not store anything ... will not run anything
        }
        int count = 0;
        for(int dice =1; dice<=6; dice++){
            int newValue = currentValue + dice;
            count+=countWaysNoDP(newValue, endValue);
            
        }

        return count;
    } 
  
  
  
  
  // memoization =========================

    static int countWaysDP(int currentValue, int endValue, int[] cache){

        // prositive base case
        if(currentValue==endValue){
            return 1;
        }

        // negative base case
        if(currentValue>endValue){
            return 0;           // this will not store anything ... will not run anything
        }
        if(cache[currentValue]!=0){
            return cache[currentValue];
        }
        int count = 0;
        for(int dice =1; dice<=6; dice++){
            int newValue = currentValue + dice;
            count+=countWaysDP(newValue, endValue, cache);
        }
        cache[currentValue] = count;

        return cache[currentValue];
    } 

    static int tabulation(int start , int end){
        int cache [] = new int[end+1];
        cache[end]=1;
        for(int i = end-1;i>=0;i--){
            int count = 0;
            for(int dice = 1; dice<=6 && dice+i<cache.length; dice++){
                count+=cache[dice+i];
            }
            cache[i]=count;
        }
        return cache[start];

    }
  
  
  
  
  // tabulation

    public static void main(String[] args) {
        int n = 10;
        long startTime = System.currentTimeMillis();
        System.out.println(countWaysNoDP(0, n));
        long endTime = System.currentTimeMillis();
        System.out.println("total time to run normal recursion: "+(endTime-startTime)+"ms");

        startTime = System.currentTimeMillis();
        System.out.println(countWaysDP(0, n, new int[n+1]));
        endTime = System.currentTimeMillis();
        System.out.println("total time to run memoization: "+(endTime-startTime)+"ms");


        startTime = System.currentTimeMillis();
        System.out.println(tabulation(0, n));
        endTime = System.currentTimeMillis();
        System.out.println("total time to run tabulation: "+(endTime-startTime)+"ms");
    }
}



// OP = 
// for input n = 30
// 437513522
// total time to run normal recursion: 4542ms
// 437513522
// total time to run memoization: 0ms
// 437513522
// total time to run tabulation: 0ms

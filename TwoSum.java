import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    // problem - from Leetcode 

    // Example 1:
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


    // Example 2:
    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]


    // Example 3:
    // Input: nums = [3,3], target = 6
    // Output: [0,1]



    // My approach 
    // TC = O(n^2)
    static int[] Approach1(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }



    // using Hashing ..... Hashmaps/ HashTable
    // this uses extra space
    // TC = O(n) and SC = O(n)
    static void Approach2(int[] arr,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr){
            if(map.get(element)==null){
                map.put(target - element , element);
            }
            else{
                System.out.println("Pair sum found : "+map.get(element)+","+element);
                return;
            }
        }
    }



    // optimised approach
    // two pointer approach , first sort the array
    // TC = O(n) and SC  = O(1)
    static void approach3(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        Arrays.sort(arr);       // important - sort the array
        while(i<j){
            if(arr[i]+arr[j]==0){
                System.out.println("The pair is : "+arr[i]+","+arr[j]);
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {20,7,11,45,23,7,78,2,15};
        // int [] result = Approach1(arr, 9);
        // for(int i : result){
        //     System.out.print(i+",");
        // }
        Approach2(arr,9);
    }
}



// ---------------- output -----------------------------------
// Pair sum found : 7,2

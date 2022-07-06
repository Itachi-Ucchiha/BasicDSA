import java.lang.Thread.State;

public class SubarrayGivenSum {
    
    // naive approach 
    static void approach_1(int[] arr , int sum){
        for(int i =0; i<arr.length; i++){
            int total = 0;
            for(int j = i+1; j<arr.length; j++){
                total+=arr[j];
                if(total == sum){
                    System.out.println("sum found");
                    return;
                }
            }
        }
        System.out.println("not found");
    }




    //approach 2 : window sliding 
    static void approach2(int [] arr, int sum){
        int startIndex = 0;
        int slideSum = arr[0];
        for(int i =1; i<arr.length; i++){


            // slide sum algo is inside this while loop
            while(slideSum>sum && startIndex<i-1){  // if the slideSum became greater than result sum
                slideSum=slideSum-arr[startIndex];  // then subtract the beginning index element 
                startIndex++;                       // and increment the starting index ...so the next index will become starting index 
            }
            if(slideSum==sum){
                System.out.println("fond number ");     // if sum found then return 
                return;
            }   
            if(i<arr.length){
                slideSum+=arr[i];       // add the elements to slide sum
            }
        }
        if(slideSum==sum){          // this condition will run if slide sum obtained after adding the last element
            System.out.println("found the number");
            return;
        }
        System.out.println("no such sum found ");

    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,90,290};
        int sum = 160;
        // approach_1(arr,sum);
        approach2(arr,sum);
    }
}

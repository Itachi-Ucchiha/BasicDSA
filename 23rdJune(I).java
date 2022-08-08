import java.util.ArrayList;
import java.util.List;

public class rough{
    static List<String> summaryRanges(int[] nums){
        List<String> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums.length){
            while(j!=nums.length-1){
                if(nums[j+1]==nums[j]+1){
                    j+=1;
                }
                else{
                    break;
                }
            }
            if(i==j){
                res.add(""+nums[j]);
            }
            else{
                res.add(nums[i]+"->"+nums[j]);
            }
            i=j+1;
            j=i;
        }
        return res;
    }
        
    


    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));

        // Output: ["0->2","4->5","7"]
        // Explanation: The ranges are:
        // [0,2] --> "0->2"
        // [4,5] --> "4->5"
        // [7,7] --> "7"     
    }
}

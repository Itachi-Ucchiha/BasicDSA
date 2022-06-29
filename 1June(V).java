public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int sum=0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            nums[i] = sum;
        }
        for(int i: nums){
            System.out.print(i+",");
        }
    }
}


// --------------------------------------output--------------------------
// 1,3,6,10,15,

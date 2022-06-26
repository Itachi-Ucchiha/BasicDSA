// span of the array - Difference b/w the max and min element of an array.
// span of the array - Difference b/w the max and min element of an array.
// span of the array - Difference b/w the max and min element of an array.



static int max(int[] arr){
        int maxNum = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    static int min(int[] arr){
        int minNum = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }
    static void print(int[] arr){
        for(int i =0 ; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }

   public static void main(String[] args) {
    int[] arr = {19,64,32,45,22,80};
    print(arr);
    System.out.println();
    System.out.print("the difference is : ");
    System.out.println(max(arr)-min(arr));
     
     
     
     // Output-----------------
//      19,64,32,45,22,80,
//      the difference is : 61

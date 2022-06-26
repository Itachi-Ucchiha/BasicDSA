public class CheckSort {
    

    static void myApproach(int[] arr)
         { 
        // my bullshit approach
        boolean flag = true;
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("my appraoch - Array is sorted");
            }
            else{
            System.out.println("my appraoch - array is not sorted");

            }
        }



    // BAd approach TC = O(n^2)
    //comparing the number with every number ahead of it's index on each iteration
    static void isSorted1(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    System.out.println("from appraoch 1 - Array is not sorted");
                    return;
                }
            }
        }
        System.out.println("from appraoch 1 - Array is sorted");
    }




    // approach 2 - optimised way with TC = O(n)
    static void isSorted2(int[] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                System.out.println("from appraoch 2 - array is not sorted");
                return;
            }
        }
        System.out.println("from appraoch 2 - Array is sorted");
    }


    public static void main(String[] args) {
        int[] arr = {6,8,11,16,41};
       


        myApproach(arr);
        isSorted1(arr);
        isSorted2(arr);


    }
}




//----------------------------------- Output -------------------------------------------------

// my appraoch - Array is sorted
// from appraoch 1 - Array is sorted
// from appraoch 2 - Array is sorted

public class RotateArray {
    
    static void rotateOnce1(int[] arr, int n){
        // store last element in a variable and shift the array to forward....
        // thus the array is rotated to right once
        int var = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=var;
        for(int i : arr){
            System.out.print(i+",");
        }
    }





    // approach 2 for Rotate array once 
    static void rotateOnce2(int[] arr, int n){
        // two pointer approach 
        // but increment i , not j......
        int i =0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        for(int x: arr){
            System.out.print(x+",");
        }
    }

    

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        int length = arr.length;
        rotateOnce1(arr, length);
        System.out.println();
        rotateOnce2(arr, length);
    }
}




// -------------------------------- Output ---------------------------------
//   9,2,4,6,8,

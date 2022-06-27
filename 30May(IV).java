

public class RotateArrayByK {
    
    static void rotateArrayK(int[] arr, int n, int k){
        // store last element in a variable and shift the array to forward....
        // thus the array is rotated to right once
        // bad approach ... time limit exceeded for large input array
        // TC = O(n^2)...  SC = O(1)
        for(int j = 1; j<=k;j++)
        {int var = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=var;
    }
        for(int x : arr){
            System.out.print(x+",");
        }
    }




    // Approach 2 
    // TC = O(n) ... SC = O(n)
    static void rotateArray2(int[] arr, int n , int k){
        int temp[] = new int[n];  //{0,0,0,0,0,0,0}
            for(int i = 0; i<n; i++){
                temp[(i+k)%n] = arr[i];         // important formula for rotation to right ... 
                //temp[(index + no.of step)% length of array] = array[index]

            }
            for(int x : temp){
                System.out.print(x+",");
            }
    }



    // approach 3----
    // make a reverse function and reverse the values from starting index to k-1 index,
    // then reverse elements from index k to last index,
    // at last reverse the whole array
    // SC = O(1), TC=O(n)
    static int[] reverse(int[] arr, int index1, int index2){
        int i=index1;
        int j = index2;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    static void approach3(int[] nums,int n, int k){
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);          
        reverse(nums,0,n-1);
        for(int x : nums){
            System.out.print(x+",");
        }
    }

  
  

    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int k = 2;
        int n = arr.length;
        System.out.println("array len: "+n);
        rotateArrayK(arr, n, k);
        System.out.println();
        System.out.println("using approach 2: ");
        rotateArray2(arr, n, k);
        System.out.println();
        System.out.println("Using Approach 3 : ");
        approach3(arr, n, k);
    }
}




// ------------------------------ Output from all the approaches --------------------------
// 3,99,-1,-100,
// 3,99,-1,-100,
// 3,99,-1,-100,

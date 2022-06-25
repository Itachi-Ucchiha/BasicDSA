 public class SecondLargest {

    // TC = O(n)  =------- because of the parallel loops O(2n)
    static void Secondlarge_approach_1(int[] arr, int n){
        int max = arr[0];       // find the maxed number
        for(int i=1; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int secondMax = arr[0];     
        for(int i=1; i<n;i++)
        {                       // ignore the max number
            if(arr[i]!=max){    // nested if's
                if(arr[i]>secondMax){       // same logic 
                    secondMax=arr[i];
                }
            }
        }
        System.out.println("The second largest number is : "+secondMax);
    }



// ---------------------Optimised way ----------------------------------
   // TC = O(n)

    static void Secondlarge_approach_2(int[] arr, int n){
        int max = arr[0];       // find the maxed number
        int secondMax = arr[0];     
        for(int i=0; i<n;i++){
            if(arr[i]>max){             
                secondMax = max;
                max = arr[i];
            }
            if(arr[i]!=max){    // nested if's
                if(arr[i]>secondMax){       // same logic 
                    secondMax=arr[i];
                }
            }
        
        }
        System.out.println("The second largest number is : "+secondMax);

    }






    public static void main(String[] args) {
        int[] arr = {34,22,75,42,88,24,55,92,32};
        int n = arr.length;
        Secondlarge_approach_1(arr, n);        
        Secondlarge_approach_2(arr, n);        
    }
}




// ----------------------output-----------------
// The second largest number is : 88
// The second largest number is : 88

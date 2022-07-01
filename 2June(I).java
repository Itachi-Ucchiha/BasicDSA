public class LeaderElements {



// Brute force techniqe - 
// TC = O(n^2)
    static void leadingElement(int arr[], int n)  
    {
        for(int i = 0 ; i<n;i++){
            int j;      // declare j outside the array because we need it later
            for(j =i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){       // if nested loop didn't break we came to conclusion that arr[i] traversed till end of array
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }



    

    // Aprroach 2 - take last element as  max element and compare with rest from the last and run a reverse for loop 
    // TC = O(n)
    static void approach2(int [] arr,int n){
        int max = 0;
        for(int i =n-1;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+",");
                max = arr[i];       // update the max if the greater value found 
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {10,12,34,30,23,6,14,10};      //10,14,23,30,34,
        int n = arr.length;
        leadingElement(arr, n);
        approach2(arr, n);

    }
}

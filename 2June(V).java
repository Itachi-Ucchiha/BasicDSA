public class ArrangePositiveandNegative {

  // with constant extra space so, order is not important here 
// Approach from gfg
    static void arrange1(int [] arr, int n){
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]<0 && arr[j]<0){
                i++;                
            }
            else if(arr[i]>0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if (arr[i]>0 && arr[j]>0){
                j--;
            }
            else{
                i++;
                j--;
            }


        }
        for(int x : arr){
            System.out.print(x+",");
        }
        System.out.println();
    
    }




    // my approach -- take two pointers(i,j) from the beginning and move only one (i) pointer ahead 
    // if a[i]<09 and a[j]>0 then swap
    // if only arr[j] is negative increment the pointer by 1
    // i will increment in every iteration
        static void arrange2(int[] arr , int n){
        int i = 0;
        int j = 0;
        while(i<n){
           
            if(arr[i]<0 && arr[j]>0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            if(arr[j]<0){
                j++;
            }

            i++;
        }
        for(int x : arr){
            System.out.print(x+",");
        }
        System.out.println();

    }






    public static void main(String[] args) {
        int[] arr = {10,21,-11,-20,15,19,-30};
        int[] arr1 = {-11,-12,-1,-6,-2,-2};
        int n = arr.length;
        int n1 = arr1.length;
        arrange1(arr, n);
        arrange2(arr, n);
        arrange1(arr1, n1);
        arrange2(arr1, n1);
    }
    
}

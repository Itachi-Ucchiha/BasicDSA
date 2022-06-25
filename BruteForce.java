public class arrayExamples {

    static void approach_1(int [] arr, int n){   // nave approach (Brute force approach)
        boolean isMax;
        for(int i =0; i<arr.length; i++){
            isMax=true;             // this flag value will be initialize everytime to true hwen the first loop will run again
            for(int j = 0; j<n;j++){        // this 2nd loop will compare all the values with the 1st loop's index value
                if(arr[j]>arr[i]){
                    isMax = false;
                    break;
                }
            }
            if(isMax){      //at the end of the 2nd for loop this if will check the flag value 
                System.out.println("The greatest number is : "+arr[i]);
                return;
            }
        }
    }
 

    public static void main(String[] args) {

    int [] arr = {95,12,41,56,44,231,1};
    int n = arr.length;
    approach_1(arr, n);       
            
            
    }   
}




// Another approach by thking the 1st number as max
 static void approach_2(int[] arr, int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is : "+max);
    }






// Output 
// The greatest number is : 231

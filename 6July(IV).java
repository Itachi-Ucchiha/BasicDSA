public class FrequencyOfXinWindow {

    static void approach1(int[] arr, int k , int x){
        int frequency = 0;
        for(int i = 0; i<k; i++){   // checking for the first window if there is x
            if(arr[i]==x){
                frequency+=1;
            }
        }
        System.out.println("the freq is : "+frequency);

        // now for rest of the array
        for(int i = k; i<arr.length;i++){
            int kickOutElement = arr[i-k];
            if(kickOutElement==x){
                frequency--;
            }
            int newElement = arr[i];
            if(newElement==x){
                frequency++;
            }
            System.out.println("the freq is : "+frequency);
        }


    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,2,3,1};
        int k  = 3; // size of the window 
        int x = 2;      // find frequency of 2
        approach1(arr, k, x);
        // O/P = 1,2,1,2,1,1
    }
    
}

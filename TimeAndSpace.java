public class Timecomplexity {

    static void approach1(int arr[]){
    // reverse the array
        // approach 1 - 
        // take an empty array and start storing the elments from the last (we are making a new memory)
        //  TC = O(n), SC = O(n)
        int aux[] = new int[arr.length];      //auxillary space = extra space
        for(int i= arr.length-1,j=0; i>=0;i--,j++){
            aux[j]=arr[i];
        }
        arr=aux;
        for(int i : arr){
            System.out.print(i+", ");
        }
        System.out.println();
    }


    static void approach2(int arr[]){
        // TC = O(n), SC = O(1)
        // technique name = 2 pointer approach
        // without any extra space (memory) - as we aren't making any new array here
        int i =  0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];  // now arr[i] is empty because now it's value is in temp variable
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x : arr){
            System.out.print(x+", ");
        }
    }



    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,5,6};
        approach1(arr);
        approach2(arr);
        
    }
}





//  Output -
// 6, 5, 4, 3, 2, 1,
// 6, 5, 4, 3, 2, 1,

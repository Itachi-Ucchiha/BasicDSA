public class SortColors {
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

public static void main(String[] args) {
    
    
    int[] arr = {2,0,2,1,1,0};
    int n = arr.length;


    // OLD APPROACh ---- not optimised 
    //  although TC = O(n) and SC=  O(1) but the code is very long
    // int count0 = 0;
    // int count1 = 0;
    // int count2 = 0;
    // for(int i : arr){
    //     if(i==0){
    //         count0+=1;
    //     }
    //     else if(i==1){
    //         count1+=1;
    //     }
    // }
    // for(int i =0; i<count0; i++){
    //     arr[i]=0;
    // }
    // for(int i =count0; i<count1+count0; i++){
    //     arr[i]=1;
    // }
    // for(int i =count1+count0; i<n; i++){
    //     arr[i]=2;
    // }

    // for(int i : arr){
    //     System.out.print(i+",");
    // }



// ------------------------------------------------------------------
    // optimised approach 
    // 3 pointer approach 
    // TC = O(n) and SC = (1)
    
    int low =0, mid = 0, high = n-1;
    while(mid<=high){
        switch (arr[mid]) {
            case 0:
                swap(arr, low, mid);
                low++;
                mid++;
                break;
            case 1:
                mid++;
            case 2:
                swap(arr, mid, high);
                high--;
            default:
                break;
        }
    }
    for(int x : arr){
        System.out.print(x+",");
    }
    

}
}


// -------------------------------- Output ----------------------------------
// 0,0,1,1,2,2,

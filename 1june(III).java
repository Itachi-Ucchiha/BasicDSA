public class Sort0and1 {
    


    public static void main(String[] args) {
        // TC = O(n) and SC = O(1)
        //  algo - 
        // count the number of zeroes and run a for loop till total number of zeroes
        // then fill the indices with zero and rest for 1 we have to run a for loop 
        // from count to length of the array.

        int[] arr = {0,1,0,0,1,1,1,0,0,0,1,0};
        int n = arr.length;
        int count = 0;
        for(int x : arr){
            if(x==0){
                count+=1;
            }
        }
        for(int i =0; i<count; i++){
            arr[i]=0;
        }
        for(int i = count; i<n;i++){
            arr[i]=1;
        }
        for(int x: arr){
            System.out.print(x+",");
        }

    }
}

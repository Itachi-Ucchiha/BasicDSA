public class NextGreaterElement3 {
    
    static int NextGreaterElement(int n){
        String str = String.valueOf(n);     // typecast to string 
        char[] arr = str.toCharArray();     // make a character array

        // store 2nd last digit ...
        int i = arr.length-2;
        // store last digit
        int k = arr.length-1;


        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1){
            return -1;
        }

        while(arr[i]>=arr[k]){
            k--;
        }


        // swap
        char temp = arr[i];
        arr[i]= arr[k];
        arr[k]=temp;


        // concatination of string from the array
        String res = "";
        for(int j =0; j<=i;j++){
            res+=arr[j];
        }
        for(int j =arr.length-1;j>i; j--){
            res+=arr[j];
        }


        // type conversion

        long output = Long.parseLong(res);
        int output_1;
        if(output>Integer.MAX_VALUE){
            return -1;
        }
        else{
            output_1 = (int)output;
        }

        return output_1;



    }

    public static void main(String[] args) {
        int num = 21;
        int res  = NextGreaterElement(num);
        System.out.println(res);
        
    }
}

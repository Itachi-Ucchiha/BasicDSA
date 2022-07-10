public class reverseWordsinString {
    
    static String reverse(String s){
        s = s.trim().replaceAll(" +", " ");
        String[] arr = s.split(" ");
        int i =0;
        int j =arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String res = "";
        for(int x = 0; x<arr.length-1; x++){
            res+=arr[x]+" ";
        }
        return res+arr[arr.length-1];





        // for(String x : arr){
        //     System.out.print(x+" ");
        // }

    }


    public static void main(String[] args) {
        String s = "           hello       world  ";
        System.out.println(reverse(s));
    }
}
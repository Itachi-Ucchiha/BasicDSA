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




    static String reverse2(String s){
        String wordarr[] = s.split(" ");
        String sentence = "";
        int n = wordarr.length;
        for(int i = n-1; i>=0; i--){
            if(wordarr[i].equals("")){
                continue;
            }
            sentence += wordarr[i];
        }
        sentence = sentence.trim();
        return sentence;

    }
    
    
    
    
    
    
    
    // by collections 
// list is the parent of the collection
    static String appraoch3(String s){
        s=s.trim();
        List<String> wordsList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordsList);
        return String.join(" ", wordsList);

    }
    
    
    


    public static void main(String[] args) {
        String s = "           hello       world  ";
        System.out.println(reverse(s));
    }
}

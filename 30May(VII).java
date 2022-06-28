public class SubtractionOfArray {
    
//  work for first number > second number

    public static void main(String[] args) {
        int[] first = {6,4,2,1};
        int[] second = {5,2,5,8};
        int n1  = first.length;
        int n2 = second.length;
        // int n3 = n1>n2?n1:n2;
        int[] third = new int[n1]; 
        int i = n1-1;
        int j = n2-1;
        int borrow=0;
        int result = 0;
        // int k = n3-1;
        while(i>=0){
            if(i>=0 && j>=0){
                
                if(first[i]<=second[j] && borrow==-1){
                    result = first[i]-second[j]+borrow+10; 
                    System.out.println(result+" : if block");
                }
                else if(first[i]<second[j]){     
                    result = first[i]-second[j]+borrow+10; 
                    System.out.println(result+" : else if block");
                    borrow--;
                }
                else{
                    result = first[i]-second[j]+borrow; 
                    System.out.println(result+" : else block");
                    borrow=0;
                }
            }
            else if(i>=0 && j<0){
                result = first[i]+borrow;
                borrow=0;
            }
            third[i] = result;
            i--;
            j--;  
        }

        // output = 
        // 1163


        for(int x: third){
            System.out.print(x);
        }
    }
}

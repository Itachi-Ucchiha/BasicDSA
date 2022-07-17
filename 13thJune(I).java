public class string_compression {
    static int compress(char[] chars) {
        String s = "";
        int count = 1;
        int i = 1;
        if(chars.length==1){
            return 1;
        }
        while(i<chars.length){
            if(i==chars.length-1){
                if(chars[i]==chars[i-1]){
                    s+=String.valueOf(chars[i-1]);
                    s+=String.valueOf(count+1);
                    i++;
                }
                else{
                    s+=String.valueOf(chars[i-1]);
                    if(count>1){
                        s+=String.valueOf(count);
                    }
                    s+=String.valueOf(chars[i]);
                    i++;
                }
            }
            else if(chars[i-1]==chars[i]){
                count++;
                i++;
            }
            else{
                if(count!=1){
                    s+=String.valueOf(chars[i-1]);
                    s+=String.valueOf(count);
                    count=1;
                    i++;
                }
                else if(count == 1){             
                    s+=String.valueOf(chars[i-1]); 
                    i++;
                }
            }
        }
        char[] res = s.toCharArray();
        for(int x =0; x<res.length;x++){
            chars[x]=res[x];
        }
        return res.length;
        
    
    }
    // for(char x: res){
    //     System.out.print(x+",");
    // }
    // System.out.println();
    // for(char x : chars){
    //     System.out.print(x+",");
    // }
    // System.out.println();

    public static void main(String[] args) {
        // char[] chars = {'a','a','b','b','c','c','c'};
        // char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        // char[] chars = {'a','b','c'};
        char[] chars = {'a','a','a','a','a','b'};
        System.out.println(compress(chars));
    }
}

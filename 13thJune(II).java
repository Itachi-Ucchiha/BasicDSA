// import java.lang.Character;
public class stringToInteger_aoti {
    static int aoti(String s){
        int sign = 1;   //  1 for positive and -1 for negative
        int result = 0; // store result
        int index = 0;  // checking cases for whitespaces
        int n = s.length();

        //check white spaces and trim them 
        while(index<n && s.charAt(index)==' '){
            index++;        // index is reaching to starting digit or character 
        }


        // checking for signs
        if(index<n && s.charAt(index)=='-'){
            sign = -1;
            index++;     
        }
        else if(index<n && s.charAt(index)=='+'){
            sign = 1;
            index++;
        }

        //main logic
        while(index<n && Character.isDigit(s.charAt(index))){       // will only traverse if it is a digit 
            int digit =  s.charAt(index)-'0';       // '4'-'0'=4.....AscII

            // to check overflow and underflow
            if((result>Integer.MAX_VALUE/10) || result==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10){    
                // we are dividing by 10 because in next iteraion we are appending a number after multiplying it by 10 
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            result = 10*result+digit;   // to make a number
            index++;
        }

        // last task is to append the sign to the result
        return result*sign;




    }


    public static void main(String[] args) {
        String s= "   +42";
        System.out.println(aoti(s));
    }
}


// OP = 42

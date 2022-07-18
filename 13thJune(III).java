public class IntegerToRoman {

    public static String intToRoman(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  // array of digits
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};     // array of symbols
        StringBuilder sb = new StringBuilder();     // we are using this string builder because it have a method called append(ezz)
        for(int i =0 ;i<values.length && num >0; i++){
            while(values[i]<=num){
                num-=values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();   // don't return a string builder ...it's different than String
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(intToRoman(num));
    }
}

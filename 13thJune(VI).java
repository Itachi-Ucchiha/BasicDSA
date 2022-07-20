import java.util.HashMap;

public class rough {

    static int romanToInt(String s){
    // store the keys in hashmap -- hardcoded
    // in reverse order ... M ,D, C, L... I
    //use a loop ... extract current symbol find it's current value using the hashmap 
    // compare the value with next character
    // if (i<i+1) then sum-=current value : else  = sum+=current value
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('M',1000);
        hm.put('D',500);
        hm.put('C',100);
        hm.put('L',50);
        hm.put('X',10);
        hm.put('V',5);
        hm.put('I', 1);
        char[] chars = s.toCharArray();
        // int sum = hm.get(chars[0]);
        int sum = 0;
        
        for(int i = 1; i<chars.length;i++){
            if(hm.get(chars[i-1])<hm.get(chars[i])){
                sum-=hm.get(chars[i-1]);
            }
            else{
                sum+=hm.get(chars[i-1]);
            }
        }
        return sum+hm.get(chars[s.length()-1]);
            // System.out.println(hm);
    }

    public static void main(String[] args) {
        // String s = "LVIII";
        String s = "V";
        System.out.println(romanToInt(s));
        // romanToInt(s);
    }
}

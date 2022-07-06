import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    
  
  
  // naive ------------
    static void approach1(int[] arr, int n){
        for(int i =0; i<n; i++){
            int j;
            for(j = i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+",");
                    break;
                }
            }
            if(j==n){       // if it reached the end of the array
                System.out.print(-1+",");
            }

        }
    }

  
  
  
  
    // this question is also done by stack
    static void approach2(int[] arr, int n){
        Stack<Integer> st = new Stack<>();          // Java's predefined stack   // peek returns the top element
        int output[] = new int[n];
        for(int i =n-1 ;i>=0;i--){              // run the loop in reverse
            while(!st.isEmpty() && st.peek()<=arr[i]){      // if stack is not empty and top element is less than current iterating element
                st.pop();                                   // then pop the top element
            }
            output[i]=st.empty()?-1:st.peek();       // if stack is empty and then append -1 to result array ... if stack is not empty then append top element of stack
            st.push(arr[i]);                    // after appending ...push the current element to stack 
        }


        //-------------printing ----------------
        for(int i : output){
            System.out.print(i+",");
        }
    }





    public static void main(String[] args) {
        int[] arr = {5,10,15,8,9,12,6};
        int n = arr.length;
        approach1(arr, n);
        System.out.println();
        approach2(arr, n);
    }
}





// ====================== Output ====================
// 10,15,-1,9,12,-1,-1,
// 10,15,-1,9,12,-1,-1,

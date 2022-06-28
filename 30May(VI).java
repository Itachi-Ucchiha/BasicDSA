public class AdditionOfArray {
    // addition of numbers with carry

    public static void main(String[] args) {
        int[] first = {9,1,8,9,2};
        int[] second = {9,1,2,7};
        int n1 = first.length;
        int n2 = second.length;
        int n3 = n1>n2?n1:n2;       
        int third[] = new int[n3];      // the output lenght will be the greatest length among two addition numbers
        // we will handle the condition when the output length will be 1 more than both the numbers
        int i = n1-1;
        int j = n2-1;
        int k = n3-1;
        int carry = 0;
        int sum = 0;
        while(k>=0){        // all things depends on k
            if(i>=0 && j>=0){               //// if both numbers are present while sum
                sum = first[i]+second[j]+carry; 
            }
            else if(i>=0 && j<0){       // when j is not given while sum
                sum = first[i]+carry;
            }
            else if(i<0 && j>=0){       // when i will not be there 
                sum = second[j]+carry;
            }
            carry = sum/10;     // the carry which will added to the next iteration
            sum = sum%10;       // the sum which will be the index of the array third[]
            third[k] = sum;     
            i--;
            j--;
            k--;
        }
        // printing the array
        if(carry!=0){       // if carry will remain at the end .... we initialized the length will be greatest(first && second) number
            System.out.print(carry);    // prinit it directly at the starting of the output
        }
        for(int x: third){      // print the array now
            System.out.print(x);
        }
        System.out.println();


    }
}


// ---------------------------  output ---------------------------------
// 101019

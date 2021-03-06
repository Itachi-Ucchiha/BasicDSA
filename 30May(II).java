public class reverseArray {

    // two pointer approach --------------
    // with swapping logic...
    // 1st pointer at array[0]. 2nd pointer at array[array.length]
    // TC = O(n)
    static void approach1(int[] arr){
        int i = 0;         // pointer 1
        int j = arr.length-1;      // pointer 2
        int temp;
        while (i<j){
            temp = arr[i];      // swapping the last element with first
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;  
        }
        System.out.println("The reversed array is : ");
        System.out.print("{");
        for(int x : arr){
            System.out.print(x+",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The initial array was: ");
        System.out.print("{");
        for(int i : arr){
            System.out.print(i+",");
        }System.out.println("}");
        approach1(arr);

    }
}





// ----------------------- Output -----------------------------

// The initial array was:
// {1,2,3,4,5,6,7,8,9,10,}
// The reversed array is :
// {10,9,8,7,6,5,4,3,2,1,}

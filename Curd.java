import java.util.Scanner;

public class arrayExamples {
    
    
    
    enum ArrayOperations{
        INSERT,DELETE,SEARCH,UPDATE,PRINT,EXIT      // index start from 0
    }
    
    // CURD operations - insert/delete/Search/update/Print

    int currentSize;
    int arr[];
    arrayExamples(int capacity){
        this.arr = new int[capacity];
        this.currentSize = 0;
    }

    void insert(int index, int value){          // at which index what you want to insert
        if(index>currentSize){
            throw new RuntimeException("Index cannot be greater than current size");
        }
        if(currentSize==arr.length){
            System.out.println("arrray is full cant add elements");
            return;
        }
        // now shifting 
        for(int i = currentSize-1; i>=index; i--){
            arr[i+1]=arr[i];
        }       
        arr[index]=value;
        currentSize++;
        print();
        System.out.println();
    }
    void delete(int index){
        if(currentSize==0){
            System.out.println("Array is Empty..,");
            return;
        }
        // Shifting
        for(int i = index; i<currentSize-1; i++){
            arr[i]=arr[i+1];
        }  
        arr[currentSize-1]=0;       // to put 0 at the last index
        currentSize--;
        print();
        System.out.println();

    }


    // leniar search
    int search (int value){
        int index = -1;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]==value){
                index = i;
            }
        }
        return index;
    }
    void update(int valueToSearch, int valueToUpdate){
        int index = search(valueToSearch);
        if(index==-1){
            return;
        }
        else{
            arr[index] = valueToUpdate;
            print();
            System.out.println("Value updated");
        }
    }
    void print(){
        for(int i : arr){
            System.out.print(i+",");
        }    
    }


    public static void main(String[] args) {

        // 4 types of array declarations - 

        // int declararion1[] = {14,2,4};
        // int[]declararion2 = {12,2,4};
        // int declararion3[] = new int[]{1,2,3,4};
        // int declararion4[] = new int[4];
        // for(int i: declararion1){
        //     System.out.print(i);
        // }


        // CURD operations - insert/delete/Search/update/Print
        // arrayExamples obj = new arrayExamples(5);
        // obj.insert(0, 10);
        // obj.insert(1, 20);
        // obj.insert(2, 30);
        // obj.insert(3, 40);     
        // obj.insert(4, 50);     
        // obj.delete(1);
        // obj.insert(2, 33);
        // obj.update(40, 11   );
        
        
        
        // Output -----
        // 10,0,0,0,0,
        // 10,20,0,0,0,
        // 10,20,30,0,0,
        // 10,20,30,40,0,
        // 10,20,30,40,50,
        // 10,30,40,50,0,
        // 10,30,33,40,50,
        // 10,30,33,11,50,Value updated
        
        arrayExamples obj = new arrayExamples(10);
        Scanner sc = new Scanner(System.in);
        int choice;
        int index;
        int value;
        int value2;
        while(true){
            System.out.println("Array CRUD Operation: ");
            System.out.println("1. Insert Operations");
            System.out.println("2. Remove Operations");
            System.out.println("3. Search Operations");
            System.out.println("4. Update Operations");
            System.out.println("5. Print Operations");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            ArrayOperations enumChoice = ArrayOperations.values()[choice-1];
            switch (enumChoice) {
                case INSERT:
                    System.out.println("Enter the Index: ");
                    index = sc.nextInt();
                    System.out.println("Enter the value: ");
                    value = sc.nextInt();
                    obj.insert(index,value);
                    break;
                case DELETE:
                    System.out.println("Enter the index: ");
                    index = sc.nextInt();
                    obj.delete(index);
                    break;
                case SEARCH:
                    System.out.println("Enter the value to search: ");
                    value = sc.nextInt();
                    if(obj.search(value)==-1){
                        System.out.println("Not found");
                    }
                    else{
                        System.out.println("The index is :"+obj.search(value));
                    }
                    
                    break;
                case UPDATE:
                    System.out.println("Enter the value to repalce: ");
                    value = sc.nextInt();
                    System.out.println("Enter the value to update: ");
                    value2 = sc.nextInt();
                    obj.update(value, value2);
                    break;
                case PRINT:
                    obj.print();
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }   
    }
}

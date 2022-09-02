// import java.util.Stack;


public class StackandQueue {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    static class Stack{
        public static Node head;

        public static boolean isempty(){
            return head==null;
        }



        // push functiom
        public static void push(int data){
            Node newNode = new Node(data);
            // if head is empty
            if(isempty()){
                head = newNode;
                return;
            }
            // if head is not empty
            newNode.next = head;
            head = newNode;
        }



        // pop function 
        public static int pop(){
            if(isempty()){
                return -1;
            }

            // if head is not empty
            int top = head.data;
            head = head.next;
            return top;
        }



        //peek funvtion 
        public static int peek(){
            if (isempty()){
                return -1;
            }
            return head.data;
        } 
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

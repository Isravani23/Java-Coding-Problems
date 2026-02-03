package Design;

//Using Array
/*List<Integer> arr = new ArrayList<>();
    public void push(int value){
       arr.add(value);
    }
    public int pop(){
        int popped =0;
        if(arr.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
             popped = arr.remove(arr.size() - 1);
        }
        return popped;
    }
    public List<Integer> getAllElements() {
        return arr; // return all elements
    }*/
// using LL

public class Stack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }
    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int pop(){
        if(top==null){
            return -1;
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }
    public int peek(){
        if(top==null){
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(14);
        st.push(24);
        st.push(34);
        System.out.println("POP " + st.pop());
        st.printStack();
    }
}

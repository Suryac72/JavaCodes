public class Stack{
    public static void main(String args[]) {
        MyStack<Integer> ss = new MyStack<>();
        ss.push(11);
        ss.push(12);
        ss.push(13);
        ss.push(14);
        ss.pop();
        ss.printStack();
    }
}
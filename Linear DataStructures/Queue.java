public class Queue {
    public static void main(String args[]) {
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println();
        q.print();
        System.out.println();
        q.dequeue();
        q.print();
    }
}

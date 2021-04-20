public class MyQueue<E>{
    int front = 0;
    int rear = -1;
    MyLinkedList<E> ll = new MyLinkedList<>();
    public void enqueue(E data){
        ll.add(data);
        rear++;
    }
    public void dequeue(){
        if(front==0 && rear==-1){
            System.out.println("QUEUE IS EMPTY !!");
        }
        ll.deleteBeginning();
        front++;
    }
    public void print(){
        if(front==0 && rear==-1){
            System.out.println("QUEUE IS EMPTY !!");
        }
        ll.printList();
    }

}

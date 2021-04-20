public class MyStack<E>{
    int top  = -1;
    MyLinkedList<E> ll = new MyLinkedList<>();
    void push(E data){
        ll.addBegining(data);
        top++;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        ll.deleteBeginning();
        top--;
    }
    void printStack(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        ll.printList();
    }

}

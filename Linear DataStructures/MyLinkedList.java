public class MyLinkedList<E>{
    Node<E> head;
    // Insertion at end
     // **********************************************************************************************
    void add(E data){
        Node<E> toAdd = new Node<>(data);
        
        if(isEmpty()){
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    boolean isEmpty(){
        return head==null;
    }
    //Insertion at specific position
     // **********************************************************************************************
    void addSpecific(E data,int position){
        Node<E> toAdd = new Node<>(data);
        Node<E> temp = head;
        if(isEmpty()){
            head = toAdd;
        }
        if(position<0){
            System.out.println("Invalid Position");
        }
        int n = countNode();
        if(position>n){
            System.out.println("Invalid Position");
        }
        else{
           int i=1;
            while(i<position){
                temp = temp.next;
                i++;
            }
            toAdd.next = temp.next;
            temp.next = toAdd;
            
        }
        
        
    }
    
    //Insertion at Beginning
     // **********************************************************************************************
    void addBegining(E data){
        Node<E> toAdd = new Node<>(data);
        
        if(isEmpty()){
            head = toAdd;
            return;
        }
        toAdd.next = head;
        head = toAdd;
    }
    //Deletion from end
     // **********************************************************************************************
    void deleteEnd(){
        if(isEmpty()){
           System.out.println("List is Empty!!");
            return;
        }
        Node<E> temp = head;
        Node<E> ptr = null;
        
        while(temp.next!=null){
            ptr = temp;
            temp = temp.next;
        }
        ptr.next = null;
    }
    //Deletion from Beginning
     // **********************************************************************************************
    void deleteBeginning(){
        if(isEmpty()){
            System.out.println("List is Empty!!");
             return;
         }
         Node<E> temp = head;
         temp = temp.next;
         head = temp;
    }
    //Deletion at Specific Position
    // **********************************************************************************************
    void deleteSpecific(int position){
        if(isEmpty()){
           System.out.println("List is Empty!!");
        }
        if(position<0){
            System.out.println("Invalid Position");
        }
        int n = countNode();
        if(position>n){
            System.out.println("Invalid Position");
        }
        else{
           int i=1;
           Node<E> ptr = null;
           Node<E> temp = head;
            while(i<=position){
                ptr = temp;
                temp = temp.next;
                i++;
            }
            ptr.next = temp.next;
            temp.next = null;
            
        }
    }
    //Counting no. of nodes
 // **********************************************************************************************
    int countNode(){
        Node<E> temp = head;
        int count = 0;
        while(temp.next!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    void printList(){
        Node<E> temp = head;
        while(temp!= null){
            System.out.print(temp.data + "---------->");
            temp = temp.next;
        }
    }

    static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}


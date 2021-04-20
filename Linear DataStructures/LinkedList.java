public class LinkedList {
    public static void main(String args[]) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.addSpecific(4,2);
        ll.addBegining(5);
        ll.printList();
        System.out.println();
        ll.printList();
        ll.deleteSpecific(3);
        System.out.println();
        ll.printList();
    

        
       
    }
}

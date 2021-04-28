import java.util.*;
public class List {
    public static void main(String args[]){

    // Arraylist Interface implements List Interface and Extends Collection Interface

        ArrayList<Integer> ll = new ArrayList<>();
         ll.add(1);
         ll.add(0,5);  //Insert 5 at index 0
         ll.add(3);
         ll.add(4);
         System.out.println(ll);
         ArrayList<Integer> ar = new ArrayList<>();
         ar.add(6);
         ar.addAll(ll); //Adds ll at end or we say last position.
         ar.addAll(0,ll); // Adds list ll at position 0
         ar.clear();
         ll.get(2);
         System.out.println(ar.isEmpty()); 

         //Iterator
         Iterator<Integer> it = ll.iterator();
         while(it.hasNext()){
             int i = it.next();
             System.out.println(i);
         }

         
         System.out.println(ll.lastIndexOf(3)); //It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.

         ar.indexOf(5);
       


    }
}

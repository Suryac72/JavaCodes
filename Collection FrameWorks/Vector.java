import java.util.*;
public class Vectors{
    public static void main(String args[]){
       
    /*Vector class is an Implementation of the  List Interface that allows us
    to create resizable arrays similar to arrayList Class*/

    // Vectors are thread safe and also less efficient because it applies lock in each data item

    Vector vc = new Vector();
    vc.add("A");
    vc.add("B");
    vc.add("C");
    Vector vv = new Vector();
    vv.add("F");
    vv.add("G");
    vv.add("H");
    vv.addElement("Surya");
    System.out.println("Size of vector vv is :" + vv.capacity());
    String arr[] = vv.toArray();
    vv.sort();
    String str = vc.toString();
 
    }
}
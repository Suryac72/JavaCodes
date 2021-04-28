import java.util.Map.Entry;
import java.util.*;

public class HashMAp {
    public static void main(String args[]) {
        Map<String , Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        

        numbers.putIfAbsent("one", 10);
        System.out.println(numbers);
       
       
        System.out.println(numbers.containsKey("one"));
        System.out.println(numbers.containsValue(20));
        System.out.println(numbers.replace("one",22));
        System.out.println(numbers.remove("one",10));
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());


        
        for(Entry<String, Integer> entry: numbers.entrySet()){
            entry.setValue(entry.getValue() * 100);
        }
        System.out.println(numbers);
    }
}

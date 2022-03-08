/*
 * Write a Java program to associate the specified value with the specified key in a HashMap.
 */
package exercise1hashmap;
import java.util.*;
/**
 *
 * @author sunil
 */
public class Exercise1Hashmap {

    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(1, "Red");
        mp.put(2, "Green");
        mp.put(3, "Black");
        mp.put(4, "White");
        mp.put(5, "Blue");
        
         for(Map.Entry m:mp.entrySet()){ 
       System.out.println(m.getKey()+" "+m.getValue()); 
      } 
    }
    
}

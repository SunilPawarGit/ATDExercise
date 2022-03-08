/*
 * Write a Java program to get the value of a specified key in a map. Get value of key 3 in above map in exercise 1.
 */
package exercise2getkeyinmap;
import java.util.*;
/**
 *
 * @author sunil
 */
public class Exercise2GetKeyinMap {

    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(1, "Red");
        mp.put(2, "Green");
        mp.put(3, "Black");
        mp.put(4, "White");
        mp.put(5, "Blue");
        
        
       System.out.println("value of key 3 => "+mp.get(3)); 
      
    }
    
}

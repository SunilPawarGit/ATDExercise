/*
 * Write a Java program to get the first (lowest) key and the last (highest) key currently in a tree map. Create a tree map with TreeMap<String><String>
 */
package exercise4lowhighkey;

import java.util.*;

public class Exercise4LowHighKey {

    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<String,String>();
        mp.put("C2", "Red");
        mp.put("C1", "Green");
        mp.put("C4", "Black");
        mp.put("C3", "White");
        
       System.out.println("Orginal TreeMap content => "+mp); 
       System.out.println("Greatest Key in Map=> "+Collections.min(mp.keySet())); 
       System.out.println("Least Key in Map=> "+Collections.max(mp.keySet())); 
    }
    
}

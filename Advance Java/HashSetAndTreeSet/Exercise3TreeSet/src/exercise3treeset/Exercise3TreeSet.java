/*
 * Write a Java program to get the first and last elements in a tree set.
 */
package exercise3treeset;
import java.util.*;
/**
 *
 * @author sunil
 */
public class Exercise3TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet();
        set.add("Black");
        set.add("Green");
        set.add("Orange");
        set.add("Red");
        set.add("White");
        
        System.out.println("First Element is: "+set.first());
        System.out.println("Last Element is: "+set.last());
        
    }
    
}

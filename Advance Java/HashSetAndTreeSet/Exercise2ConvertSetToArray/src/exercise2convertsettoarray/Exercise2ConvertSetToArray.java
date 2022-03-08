/*
 * Write a Java program to convert a hash set to a List/ArrayList.
 */
package exercise2convertsettoarray;

import java.util.*;


/**
 *
 * @author sunil
 */
public class Exercise2ConvertSetToArray {

    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet();
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("Print All Element in Hashset :\n"+set);
        List<Integer> arr=new ArrayList(set);
        System.out.println("Print All Element in Array :\n"+arr);
    }
    
}

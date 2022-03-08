/*
 * Write a Java program to get an element in a tree set which is strictly greater than the
 */
package exercise4strictgr;

import java.util.*;

/**
 *
 * @author sunil
 */
public class Exercise4StrictGR {
   
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet();
        set.add(10);
        set.add(22);
        set.add(36);
        set.add(25);
        set.add(16);
        set.add(70);
        set.add(82);
        set.add(89);
        set.add(14);
        Scanner sc = new Scanner(System.in );
        int sq =sc.nextInt();
        
        int sqt =set.higher(sq);
       System.out.println("Strictly greater than "+sq+" : "+sqt);
       
    }
    
}

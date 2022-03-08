/*
 * Write a Java program to print all the elements of a ArrayList using the position of the elements. 
 */
package exercise3;

import java.util.ArrayList;
import java.util.List;


public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<String> arr=  new ArrayList<String>(5);
        arr.add("Rushi");
        arr.add("Mayur");
        arr.add("Rahul");
        arr.add("Swapnil");
        arr.add("Sunil");
        System.out.println("1: The Name In List using position of the elements :\n");
        for (int index=0;index < arr.size();index++) {
            System.out.println(arr.get(index));
        }
    }
    
}

/*
 *  Write a Java program to insert elements into the linked list at the first and last position. Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4.
 */
package exercise5addfirstlast;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author sunil
 */
public class Exercise5AddFirstLast {

    public static void main(String[] args) {
         LinkedList<String> arr=new LinkedList<String>();
        arr.add("Red");
        arr.add("Green");
        arr.add("White");
        arr.add("Black");
        arr.add("Yellow");
        System.out.println("Print All Element in likedlist :\n"+arr);
        arr.addFirst("Pink");
        System.out.println("After Adding element at first Element in likedlist :\n"+arr);
        arr.addLast("Blue");
        System.out.println("After Adding element at Last Element in likedlist :\n"+arr);
        
    }
    
}

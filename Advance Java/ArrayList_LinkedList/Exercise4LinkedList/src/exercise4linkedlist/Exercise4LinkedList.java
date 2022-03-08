/*
 * Write a Java program to iterate through all elements in a linked list starting at the specified position.Position no 1. sample list is of colors with element
 */
package exercise4linkedlist;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author sunil
 */
public class Exercise4LinkedList {

    public static void main(String[] args) {
        LinkedList<String> arr=new LinkedList<String>();
        arr.add("Red");
        arr.add("Green");
        arr.add("White");
        arr.add("Black");
        arr.add("Yellow");
        ListIterator<String> itr=arr.listIterator(1);
        while(itr.hasNext()){ 
       System.out.println(itr.next()); 
      } 
        
        
    }
    
}

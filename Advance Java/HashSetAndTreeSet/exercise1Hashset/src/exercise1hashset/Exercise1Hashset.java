/*
 * Write a program to remove elements from a SET of integers that are the perfect square.
 */
package exercise1hashset;
import java.util.*;

/**
 *
 * @author sunil
 */
public class Exercise1Hashset {
    
    private static int isPerfectSquare(int num){
        
        int sq=1;
        
        while((sq*sq) <= num){
            if ((sq*sq)==num) {
                return sq;
            }
            sq++;
        }
        return -1;
            
        }
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println("Print All Element in Hashset :\n"+set);
        Iterator<Integer> i=set.iterator();

        while(i.hasNext()){
            if (isPerfectSquare(i.next()) != -1) {
                i.remove();
            }
        }
        
        System.out.println("After removeAll(perfectSquares) in Hashset :\n"+set);
    }
    
}

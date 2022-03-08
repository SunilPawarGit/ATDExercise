
package exercise2_copy_array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sunil
 */
public class Exercise2_Copy_Array {

    public static void main(String[] args) {
        List<String> arr=  new ArrayList<String>(5);
        arr.add("Rushi");
        arr.add("Mayur");
        arr.add("Rahul");
        arr.add("Swapnil");
        arr.add("Sunil");
        System.out.println("1: The Name In List :\n");
        for (String name:arr) {
            System.out.println(name);
        }
        
        //Second Array list
        List<String> arr1=  new ArrayList<String>(5);
        arr1.add("Manoj");
        arr1.add("Sangram");
        arr1.add("Ganesh");
        arr1.add("Vicky");
        arr1.add("Ramu");
        System.out.println("2: The Name In List :\n");
        for (String name:arr1) {
            System.out.println(name);
        }
        
        Collections.copy(arr1, arr);
        
        System.out.println("\n After Copying the element in list : \n");
        for (String name:arr1) {
            System.out.println(name);
        }
    }
    
}

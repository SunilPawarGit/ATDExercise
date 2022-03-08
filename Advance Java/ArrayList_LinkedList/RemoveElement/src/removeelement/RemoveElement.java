
package removeelement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunil
 */
public class RemoveElement {


    public static void main(String[] args) {
        List<String> arr=  new ArrayList<String>(5);
        arr.add("Rushi");
        arr.add("Mayur");
        arr.add("Rahul");
        arr.add("Swapnil");
        arr.add("Sunil");
        System.out.println("The Name In List :\n"+arr);

        arr.remove(2);
        System.out.println("\n After Removing the element in list : \n"+arr);

    }

}

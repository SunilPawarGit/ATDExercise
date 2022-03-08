
package exercise1_employee;

import java.util.*;

/**
 *
 * @author sunil
 */
public class DeptNameComparator implements Comparator<Department>{

    @Override
    public int compare(Department e1, Department e2) {
        return e1.DeptName.compareTo(e2.DeptName); //To change body of generated methods, choose Tools | Templates.
    }
    
}

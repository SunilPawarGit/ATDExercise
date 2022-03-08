
package exercise1_employee;

/**
 *
 * @author sunil
 */
public class Department extends Employee{
    int DeptID;
    String DeptName;

    public Department(int Id, String name,int DeptID,String DeptName) {
        super(Id, name);
        this.DeptID=DeptID;
        this.DeptName=DeptName;
    }
    
}

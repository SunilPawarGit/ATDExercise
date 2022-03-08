/*
 *  Create a employee class with name and employeeId . Print the sorted list of employees by name .
 */
package exercise1_employee;
import java.util.*;
/**
 *
 * @author sunil
 */

public class Exercise1_Employee {

    public static void main(String[] args) {
       List<Address> dt=new ArrayList<Address>();

        dt.add(new Address(1,"Sunil",101,"CS","India","Maharashtra","Nashik"));
       
        dt.add(new Address(2,"Rushi",102,"Art","India","Maharashtra","Pune"));
        
        dt.add(new Address(3,"Mayur",103,"Physics","India","Maharashtra","Satara"));
        System.out.println("Sorting by Department name : \n");
        Collections.sort(dt,new DeptNameComparator());
       
        for(Address em: dt){
            System.out.println(em.Id+" "+em.name+" "+em.DeptID+" "+em.DeptName+" From "+em.CountryName+", "+em.StateName+", "+em.City+".");
        }
         
    }

}

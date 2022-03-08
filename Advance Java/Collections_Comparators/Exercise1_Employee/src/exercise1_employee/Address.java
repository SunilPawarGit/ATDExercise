/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_employee;

/**
 *
 * @author sunil
 */
public class Address extends Department{
    String CountryName,StateName,City;
    public Address(int Id, String name, int DeptID, String DeptName,String CountryName,String StateName,String City) {
        super(Id, name, DeptID, DeptName);
        this.CountryName=CountryName;
        this.StateName=StateName;
        this.City=City;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author sunil
 */
public class Students {
    int id;
    String name;
    String dob;
    String doj;
    Students(int id,String name,String dob,String doj ){
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.doj=doj;
    }

    Students() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

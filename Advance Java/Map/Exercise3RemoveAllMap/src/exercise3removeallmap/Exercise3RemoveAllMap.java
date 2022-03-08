/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3removeallmap;

import java.util.*;


/**
 *
 * @author sunil
 */
public class Exercise3RemoveAllMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(1, "Red");
        mp.put(2, "Green");
        mp.put(3, "Black");
        mp.put(4, "White");
        mp.put(5, "Blue");
        
        mp.clear();
       System.out.println("Removed All Mappings => "+mp); 
      
    }
    
}

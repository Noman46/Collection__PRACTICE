/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.TreeSet.comparator;

import java.util.TreeSet;

/**
 *
 * @author Noman Ibrahim
 */
public class TestComaparator_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeSet t = new TreeSet( new myComparator2());
        t.add(10);
        t.add(20);
        t.add(5);
        t.add(2);
        t.add(30);
        t.add(16);
        t.add(34);
        t.add(12);
        t.add(23);
        t.add(23); // Will not print. Set does not allow Duplicate value
        System.out.println(t);
    }
    
}

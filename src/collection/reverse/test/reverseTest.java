/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.reverse.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public class reverseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List l = new ArrayList();
        l.add("A");
        l.add("T");
        l.add("I");
        l.add("M");
        l.add("E");
        l.add("N");
        l.add("O");
        l.add("P");
        l.add("W");
        l.add("Z");
        l.add("H");
        l.add("B");
        l.add("D");
        l.add("F");
        l.add("L");
        l.add("R");
        l.add("U");
        l.add("X");
        System.out.println("Befor sorting: " + l);
        Collections.reverse(l);
        System.out.println("Reverse Before sorting: " + l);
        Collections.sort(l);
        System.out.println("After sorting: " + l);
        Collections.reverse(l);
        System.out.println("Reverse sorting: " + l);
        
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.cllass.method.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public class sortMeth_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List l= new ArrayList();
        l.add(10);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(5);
        l.add(8);
        l.add(1);
        l.add(4);
        l.add(9);
        System.out.println(l);
        Collections.sort(l, new myComparator());
        System.out.println(l);
       
        
        
        

    }

}

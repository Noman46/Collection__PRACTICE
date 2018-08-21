/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.TreeSet.comparator;

import java.util.Comparator;

/**
 *
 * @author Noman Ibrahim
 */
public class myComparator2 implements Comparator<Object> {

    @Override
    public int compare(Object t, Object t1) {

        Integer i1 = (Integer) t;
        Integer i2 = (Integer) t1;
        //return i1.compareTo(i2);  // Give asscending number
        //return -i1.compareTo(i2); //Desscending Order

        //return i2.compareTo(i1); //Desscending Order
        //return -i2.compareTo(i1); //asscending number
        //   return +1; // Mow treeSet will allaow Duplicate Value and Insertion Order is Kept
        // We Just MAke The TreeSet Like Lst
        return 0; // only first object will print

    }
}

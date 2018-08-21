/*
 * TrreSet uses comparable Interface.
 * Comparable 9intarface has only one method
 * The method is public int comparetTo();
 * It return integer value
 
 
 */
package collection.TreeSet.comparator;

import java.util.*;

public class TestComparator_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(10);
        t.add(20);
        t.add(5);
        t.add(2);
        t.add(30);
        t.add(16);
        t.add(34);
        t.add(12);
        t.add(23);
        System.out.println(t); // OutPut--> [2, 5, 10, 12, 16, 20, 23, 30, 34]
        // The output will be in accending order.
        // TreeSet by deault uses comaprable interface for shorting
        // Defult sorting is accending order.
        

    }

}


/*
*Collection class have a binary search method
* To search through any List it must be sorted first
* The List must have homogenous data
* No duplicate is allowed
* Null should not be there
* Successfull search retarns Index number
* Unsuccessfull search returns Where the Object cnabe Injected
*/

package collection.search.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public class search_1 {

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
        Collections.sort(l);
        System.out.println("After sorting: " + l);
        System.out.println(Collections.binarySearch(l, "C"));
        l.add(2, "C");
        Collections.sort(l);
        System.out.println("After sorting: " + l);
        System.out.println(Collections.binarySearch(l, "C"));

}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.objects.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public class ObjectsSortTest {

    public static void main(String[] args) {

        CreateStudent cr = new CreateStudent();
        List<Student> l = new ArrayList();
        Student st1 = cr.createStudent("Noman", 101);
        l.add(st1);
        Student st2 = cr.createStudent("Abul", 106);
        l.add(st2);
        Student st3 = cr.createStudent("Murad", 103);
        l.add(st3);
        Student st4 = cr.createStudent("Omar", 102);
        l.add(st4);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        

    }

}

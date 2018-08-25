/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.objects.sort;


/**
 *
 * @author Noman Ibrahim
 */
public class CreateStudent {
    
    public Student createStudent(String name, Integer roll){
        Student student = new Student();
        student.setName(name);
        student.setRoll(roll);

        return student;
    
    }
    
}

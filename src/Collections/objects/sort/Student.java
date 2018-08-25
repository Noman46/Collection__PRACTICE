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
public class Student implements Comparable{
    
    private String name;
    private Integer roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + '}';
    }

    @Override
    public int compareTo(Object t) {
    
      return this.getName().compareTo(((Student) t).getName());
    }
    
}

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
public class myComparator implements Comparator<Object>{

    @Override
    public int compare(Object t, Object t1) {
    
      Integer i1=(Integer)t;
      Integer i2 = (Integer)t1;
      if(i1<i2){
      
      
      return +1;
      }
      else if(i1>i2){
       return -1;
      }
      else 
          return 0;
    
    }
}

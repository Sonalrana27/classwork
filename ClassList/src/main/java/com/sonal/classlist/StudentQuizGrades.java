/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.classlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sonal Rana
 */
public class StudentQuizGrades {
    public static void main(String[] args) {
        float s;
        Map<String,Integer>StudentDetail=new HashMap<>();
        StudentDetail.put("Sonal", 100);
        StudentDetail.put("Sam", 99);
        StudentDetail.put("Steve", 98);
        StudentDetail.put("Joe", 85);
        StudentDetail.put("Josh", 90);
        StudentDetail.remove("Steve");
        Set<String> keys=StudentDetail.keySet();
        for(String k:keys)
        {
            System.out.println(k);
        }
        Collection<Integer>Gradeaverage=StudentDetail.values();
        
            for(Integer g:Gradeaverage)
            {
                System.out.println(g);
            }
           
            
          
        
    }
}

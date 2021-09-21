/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.classlist;

import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class TestingUserIO {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      userIO uIO = new UserIOImpl();
      int min;
      uIO.readInt("eneter smaller no.");
      min=sc.nextInt();
     
      
      int max;
      uIO.readInt("enter bigger no");
max=sc.nextInt();
     
     int a=uIO.readInt("Now give me one in between! : ", min, max);
     uIO.readInt("i like the number"+a);
     
              
    }
             
              
    }


 

  
   
    
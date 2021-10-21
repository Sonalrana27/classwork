/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.milestone1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class DogGenetics {
    public static void main(String[] args) {
        System.out.println("What is your dog name");
        Scanner sc=new Scanner(System.in);
        
        
        String a=sc.nextLine();
        System.out.println(a);
        System.out.println("Well then,i have this highly reliable report on"+a+"esquire's prestigious background right here");
        System.out.println(a+"Esquire is");
        Random rm=new Random();
        String dogname1="St.bernard";
        String dogname2="chihuahua";
        String dogname3="husky";
        String dogname4="libra";
        String dogname5="sheepdog";
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;
        int psum=0;
        do
        {
            p1=rm.nextInt(100);
            p2=rm.nextInt(100);
            p3=rm.nextInt(100);
            p4=rm.nextInt(100);
            p5=rm.nextInt(100);
            psum=p1+p2+p3+p4+p5;
        }while(psum!=100);
        System.out.println(a+"is :\n");
        
        System.out.println((p1)+"%"+dogname1);
         System.out.println((p2)+"%"+dogname2);
          System.out.println((p3)+"%"+dogname3);
         System.out.println((p4)+"%"+dogname4);
         System.out.println((p5)+"%"+dogname5);
         System.out.println("total % for current dog"+psum);
        
    }}
        
       /* int number=rm.nextInt(5+1);
       
        
        
          switch(number)
            {
                case 1:
                {
                    System.out.println("80% st.bernard");
                    System.out.println("20% chihuahua");
                    
            }
            case 2:
            {
            System.out.println("60% St. Bernard");
            System.out.println("14% chihuahua");
            System.out.println("16% Common Sur");
        }
        case 3:
        {
        System.out.println("29% dramatic RedNosed Asian Pug");
        System.out.println("40 chihuahua");
        System.out.println("21% Common Cur");
        System.out.println("10% King Doberman");
        }
        case 4 :
        {
        System.out.println("61% common Cur");
        System.out.println("2% chihuahua");
        System.out.println("29% St Bernard");
        System.out.println("1% King Doberman");
        System.out.println("7% Dharamatic RedNosed Asian Pug");
        }
        case 5:
        {
        System.out.println("87% King Doberman");
        System.out.println("2% chihuahua");
        System.out.println("11% Common Cur");
        }
    }
            System.out.println("WoW,that's QUITE the dog");    
}}*/
        

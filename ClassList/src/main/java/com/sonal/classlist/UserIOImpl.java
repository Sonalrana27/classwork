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
public class UserIOImpl implements userIO{
Scanner sc=new Scanner(System.in);
    @Override
    public void print(String message) {
         System.out.println("enter your message");
    }

    @Override
    public String readString(String prompt) {
        
        String a=sc.nextLine();
        System.out.println(a);
return(a);        
        
     }

    @Override
    public String readInt(String prompt) {
        System.out.println(prompt);
        String b=sc.nextLine();
        return (b);
         }

    @Override
    public int readInt(String prompt, int min, int max) {
        int value=max+1;
        while((value<min)||(value>max))
        {
            value=readInt(prompt,min,max);
        }
        return value;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double b=sc.nextDouble();
        return (b);
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double value=max+1;
        while((value<min)||(value>max))
        {
            value=readDouble(prompt,min,max);
        }
        return value;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float b=sc.nextFloat();
        return (b);
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float value=max+1;
        while((value<min)||(value>max))
        {
            value=readFloat(prompt,min,max);
        }
        return value;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long b=sc.nextLong();
        return (b);
    }

    @Override
    public long readlong(String prompt, long min, long max) {
        long value=max+1;
        while((value<min)||(value>max))
        {
            value=readlong(prompt,min,max);
        }
        return value;
        
    }
     
        
        
    
    
}

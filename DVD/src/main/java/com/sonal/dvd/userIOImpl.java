/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvd;

import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class userIOImpl implements USerIO{
Scanner sc=new Scanner(System.in);
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String value=sc.nextLine();
        return value;
        
    }

    @Override
    public String readInt(String prompt) {
        System.out.println(prompt);
        String value=sc.nextLine();
        return value;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        String result;
    int a = 0;
        do {
            result=sc.nextLine();
            a=Integer.parseInt(result);
        } while (a < min || a > max);

        return a;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double value=sc.nextDouble();
        return value;
        
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
         String result;
    double a = 0;
        do {
            result=sc.nextLine();
            a=Double.parseDouble(result);
        } while (a < min || a > max);

        return a;
    }

    @Override
    public float readFloat(String prompt) {
         System.out.println(prompt);
        float value=sc.nextFloat();
        return value;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
         String result;
    float a = 0;
        do {
            result=sc.nextLine();
            a=Float.parseFloat(result);
        } while (a < min || a > max);

        return a;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long value=sc.nextLong();
        return value;
    }

    @Override
    public long readlong(String prompt, long min, long max) {
        String result;
    long a = 0;
        do {
            result=sc.nextLine();
            a=Long.parseLong(result);
        } while (a < min || a > max);

        return a;
    }
    
    
}

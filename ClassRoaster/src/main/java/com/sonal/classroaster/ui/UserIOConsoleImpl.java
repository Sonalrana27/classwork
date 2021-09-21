/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.classroaster.ui;

import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public abstract class UserIOConsoleImpl implements UserIO
{
    Scanner sc=new Scanner(System.in);
    @Override
    public void print(String msg) {
        System.out.println(msg);    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
double value=sc.nextDouble();
sc.nextLine();
return value;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double result;
        do {
            result = readDouble(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
float value=sc.nextFloat();
sc.nextLine();
return value;    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            result = readFloat(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
int value=sc.nextInt();
sc.nextLine();
return value;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            result = readInt(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
long value=sc.nextLong();
sc.nextLine();
return value;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }
    
}

  

    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.milestone1;

import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your age");
        int age=sc.nextInt();
        double maxheartrate=220-age;
        double minrate=50*maxheartrate/100;
        double maxrate=85*maxheartrate/100;
        
        System.out.println("Your maximum heart rate should be"+maxheartrate+"beats per minute");
        System.out.println("your target HR zone is"+Math.round(minrate)+"-"+Math.round(maxrate)+"beats per minute");
    }
    
}

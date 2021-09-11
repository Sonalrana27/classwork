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
public class StateCapitals {
    public static void main(String[] args) {
        Map<String,String> sc=new HashMap<>();
        sc.put("Alabama", "Montgomery");
        sc.put("Alaska", "Janeau");
        sc.put("Arizona", "Phoenix");
        sc.put("Arkansas", "Little Rock");
        System.out.println("States :");
        Set<String> S = sc.keySet();
        for(String state : S)
            
        {
            
            
            System.out.println(state);
            System.out.println("\n");
        }
        System.out.println("Capitals :");
        Collection <String> C=sc.values();
        for(String capital:C)
        {
            System.out.println(capital);
            System.out.println("\n");
            
        }
        System.out.println("State Capital Pairs :");
        Set<String> K = sc.keySet();
       
        for(String statecapital : K)
        {
          String currentcapital=sc.get(statecapital);
            System.out.println(statecapital+"-"+currentcapital);
        }
            
        {
            
            
            
        }
    }}
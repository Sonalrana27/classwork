/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvdlibrary.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class DVDLibraryDaoException {
    public class Exception extends Throwable
    {
        public DVDLibraryDaoException(String message)
        {
            super(message);
        }
        public DVDLibraryDaoException(String message,Throwable cause)
        {
            super(message,cause);
        }
    }
        
    
    /*PrintWriter out=new PrintWriter(new FileWriter("outFile.txt"));
         out.println("everthing saved in file");
         out.flush();
         out.close();
        Scanner sc=new Scanner(new BufferedReader(new FileReader("outFile.txt")));
        while(sc.hasNextLine())
        {
            String currentline=sc.nextLine();
        
         System.out.println(currentline);
        }
}}

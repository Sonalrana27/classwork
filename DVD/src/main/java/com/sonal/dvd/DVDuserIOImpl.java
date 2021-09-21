/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public abstract   class DVDuserIOImpl implements DVDIO
{
    Scanner sc=new Scanner(System.in);
private Map<String, DVDDto> d = new HashMap<>();
    @Override
    public DVDDto addDVD(String title, DVDDto dvd) {
        DVDDto olddvd = d.put(title, dvd);
    return olddvd;
    }

    @Override
    public List<DVDDto> getallDVDDto() {
        return new ArrayList<DVDDto>(d.values());
    }

    @Override
    public DVDDto getDVD(String title) {
        DVDDto viewdvd = d.get(title);
    return viewdvd;
     
        
    }

    @Override
    public DVDDto removeDVD(String title) {
        DVDDto removeddvd = d.remove(title);
    return removeddvd;
    }
    @Override
    public DVDDto editDVD(String title)
    {
        DVDDto editdvd=d.get(title);
        return editdvd;
    }
    

    

}   
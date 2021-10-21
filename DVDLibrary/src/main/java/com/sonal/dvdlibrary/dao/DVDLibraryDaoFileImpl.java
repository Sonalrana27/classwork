/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvdlibrary.dao;

import com.sonal.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao{
    Scanner sc=new Scanner(System.in);
private Map<String, DVD> d = new HashMap<>();
    @Override
    public DVD addDVD(String title, DVD dvd) {
        DVD  olddvd = d.put(title, dvd);
    return olddvd;
    }

    @Override
    public List<DVD> getallDVD() {
        return new ArrayList<DVD>(d.values());
    }

    @Override
    public DVD getDVD(String title) {
        DVD viewdvd = d.get(title);
    return viewdvd;
     
        
    }

    @Override
    public DVD removeDVD(String title) {
        DVD removeddvd = d.remove(title);
    return removeddvd;
    }
    @Override
    public DVD editDVD(String title)
    {
        DVD editdvd=d.get(title);
        return editdvd;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvd;

import java.util.List;

/**
 *
 * @author Sonal Rana
 */
public interface DVDIO {
    
    DVDDto addDVD(String title, DVDDto dvd);
    
     List<DVDDto> getallDVDDto();
    DVDDto getDVD(String title);
     DVDDto removeDVD(String title);
     DVDDto editDVD(String title);

    

       
}

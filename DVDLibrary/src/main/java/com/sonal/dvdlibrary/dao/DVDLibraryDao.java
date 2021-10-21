/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvdlibrary.dao;

import com.sonal.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author Sonal Rana
 */
public interface DVDLibraryDao {
    DVD addDVD(String title, DVD dvd);
    
     List<DVD> getallDVD();
    DVD getDVD(String title);
     DVD removeDVD(String title);
     DVD editDVD(String title);
}

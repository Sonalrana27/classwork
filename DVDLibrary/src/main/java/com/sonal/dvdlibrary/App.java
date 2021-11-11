/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvdlibrary;

import com.sonal.dvdlibrary.controller.DVDLibraryController;

import com.sonal.dvdlibrary.dao.DVDLibraryDaoFileImpl;


/**
 *
 * 
 * @author Sonal Rana
 */
public class App {
    
    public static void main(String[] args) {
         UserIO myIO=new UserIOConsoleImpl();
        DVDLibraryView myView= DVDLibraryView(myIO);
         DVDLibraryDao myDao=new DVDLibrarydaoFileImpl();
         
                 DVDLibraryController controller= new DVDLibraryController(myDao,myView);
        controller.run();
    }
    
}

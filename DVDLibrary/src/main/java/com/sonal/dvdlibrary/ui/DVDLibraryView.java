/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvdlibrary.ui;

import com.sonal.dvdlibrary.dto.DVD;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class DVDLibraryView {
    Scanner sc=new Scanner(System.in);
    
    private UserIO io;
    public DVDLibraryView(UserIO io)
    {
        this.io=io;
    }
    

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVD");
        io.print("2. Create New DVD");
        io.print("3. View a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    public DVD getNewDVDInfo() {
    String title= io.readString("Please enter title");
    String releaseDate = io.readString("Please enter release date");
    String MPAARating = io.readString("Please enter MPAA Entery");
    String DirectorName = io.readString("Please enter Direcror Name");
    String studio=io.readString("Please enter studioinfo");
    String userrating=io.readString("enter rating");
    DVD currentDVD = new DVD();
    currentDVD.setTitle(title);
    currentDVD.setReleaseDate( releaseDate);
    currentDVD.setMPAARating(MPAARating);
    currentDVD.setDirectorName(DirectorName) ;
    currentDVD.setStudio(studio) ;
    currentDVD.setUserrating( userrating) ;
    return currentDVD;
}
    public void displayCreateDVDBanner() {
    io.print("=== Create NEW DVD");
}
    public void displayCreateSuccessBanner() {
    io.readString(
            "New DVD info successfully created.  Please hit enter to continue");
}
    public void displayDVDList(List<DVD> DVDList) {
    for (DVD currentDVD : DVDList) {
        String DVDinfo= currentDVD.getTitle();
        io.print(DVDinfo);
    }
        
      
        
    }
    public void displayDisplayAllBanner() {
    io.print("=== Display All DVD record ===");
}
    public void displayDisplayDVDBanner () {
    io.print("=== Display DVD record ===");
}

public String getDVDChoice() {
    return io.readString("Please enter the DVD title.");
}

public void displayDVD(DVD dv) {
    if (dv != null) {
        io.print(dv.getTitle());
        io.print(dv.getReleaseDate());
        io.print(dv.getMPAARating());
   io.print(dv.getDirectorName());
           io.print(dv.getStudio());
        io.print(dv.getUserrating());
    } else {
        io.print("No such DVD information");
    }
    io.readString("Please hit enter to continue.");
}
public void displayRemoveDVDBanner () {
    io.print("=== Remove DVD Record===");
}

public void displayRemoveDVD(DVD dvdrecord) {
    if(dvdrecord != null){
      io.print("DVD successfully removed.");
    }else{
      io.print("No such student.");
    }
    io.readString("Please hit enter to continue.");
}
public void displayeditDVD() {
    io.print("=== Edit DVD Record===");
}

public void displayEditDVD(DVD editrecord) {
    if(editrecord != null){
        String newtitle=null;
        io.print("edit dvd");
        editrecord.setTitle(newtitle);
        io.print(editrecord.getTitle());
      io.print("DVD successfully edited");
    }else{
      io.print("No such student.");
    }
    io.readString("Please hit enter to continue.");
}
    public void displayExit() {
    io.print("Good Bye!!!");
}

public void displayUnknownCommand() {
    io.print("Unknown Command!!!");
}
    
}

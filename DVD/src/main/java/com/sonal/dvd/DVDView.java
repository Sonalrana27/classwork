/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.dvd;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sonal Rana
 */
public class DVDView {
    Scanner sc=new Scanner(System.in);
    
    private USerIO io = new userIOImpl();
    

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    public DVDDto getNewDVDInfo() {
    String title= io.readString("Please enter title");
    String releaseDate = io.readString("Please enter release date");
    String MPAARating = io.readString("Please enter MPAA Entery");
    String DirectorName = io.readString("Please enter Direcror Name");
    String studio=io.readString("Please enter studioinfo");
    String userrating=io.readString("enter rating");
    DVDDto currentDVD = new DVDDto();
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
    public void displayDVDList(List<DVDDto> DVDList) {
    for (DVDDto currentDVD : DVDList) {
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

public void displayDVD(DVDDto dv) {
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

public void displayRemoveDVD(DVDDto dvdrecord) {
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

public void displayEditDVD(DVDDto editrecord) {
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
    

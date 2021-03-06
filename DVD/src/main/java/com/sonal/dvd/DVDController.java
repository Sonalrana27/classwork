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
public class DVDController {
   private DVDView view=new DVDView();
   private DVDIO dao=new DVDuserIOImpl() {};
 private USerIO io =  new userIOImpl();
 private void createDVD() {
    view.displayCreateDVDBanner();
    DVDDto newDVD = view.getNewDVDInfo();
    dao.addDVD(newDVD.getTitle(), newDVD);
    view.displayCreateSuccessBanner();
}
 private void listDVD() {
    view.displayDisplayAllBanner();
    List<DVDDto> DVDList = dao.getallDVDDto();
    view.displayDVDList(DVDList);
}
 private void viewDVD()
 {
     view.displayDisplayDVDBanner ();
     String title=view.getDVDChoice();
   DVDDto vd=dao.getDVD(title);
    view.displayDVD(vd);
 
 
 }
 private void removeDVD() {
    view.displayRemoveDVDBanner();
    String title= view.getDVDChoice();
    DVDDto removeddvd= dao.removeDVD(title);
    view.displayRemoveDVD(removeddvd);
}
 private void editDVD() {
    view.displayeditDVD();
    String title= view.getDVDChoice();
    DVDDto editeddvd= dao.editDVD(title);
    view.displayEditDVD(editeddvd);
            }
 private void unknownCommand() {
    view.displayUnknownCommand();
}

private void exitMessage() {
    view.displayExit();
}

    public void run() {
        boolean keepGoing = true;
        int menuSelection ;
        while (keepGoing) {
            io.print("Main Menu");
            io.print("1. List  DVD");
            io.print("2. Create New DVD");
            io.print("3. View a DVD");
           io.print("4. Remove a DVD");
           io.print("5. Edit a DVD");
            io.print("6. Exit");

            menuSelection = io.readInt("Please select from the"
                    + " above choices.", 1, 6);
     
            switch (menuSelection) {
                case 1:
                    listDVD();
                    break;
                case 2:
        createDVD();
        break;
                case 3:
                    viewDVD();
                    break;
                case 4:
                    removeDVD();
                    break;
                    case 5:
                    editDVD();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        exitMessage();
    }}

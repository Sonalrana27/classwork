/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.classroaster.controller;


/**
 *
 * @author Sonal Rana
 */
public class  ClassRoasterController {
    private ClassRosterView view = new ClassRosterView();
    private UserIO io = new UserIOConsoleImpl() {

    public void run() {
        boolean keepGoing = true;
        int menuSelection ;
        while (keepGoing) {
            io.print("Main Menu");
            io.print("1. List Student IDs");
            io.print("2. Create New Student");
            io.print("3. View a Student");
            io.print("4. Remove a Student");
            io.print("5. Exit");

            menuSelection = io.readInt("Please select from the"
                    + " above choices.", 1, 5);

            switch (menuSelection) {
                case 1:
                    io.print("LIST STUDENTS");
                    break;
                case 2:
                    io.print("CREATE STUDENT");
                    break;
                case 3:
                    io.print("VIEW STUDENT");
                    break;
                case 4:
                    io.print("REMOVE STUDENT");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }
            private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
}

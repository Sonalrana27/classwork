/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonal.milestone1;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Sonal Rana
 */
public class RockPaperScissor {
    public static void main(String[] args)
{
    int userwins=0;
int computerwins=0;
String playagain;
    Scanner sc=new Scanner(System.in);
Random rm=new Random();



    System.out.println("How many turns u want to put from 1to 10");
int turn=sc.nextInt();
System.out.println("number of turns are"+turn);
    
            
           if(turn<1||turn>10)
           {
               System.out.println("pls enter number of turns from 1 to 10");
               System.exit(turn);
           }
           
           
            
for(int rounds=1;rounds<=turn;rounds++)
{
    System.out.println("do you want to move  press enter");
    

    
    System.out.println("print 1 for Rock ,Print 2 for paper and 3 for Scissors");


int userchoice=sc.nextInt(3+1);
int computerchoice=rm.nextInt(3+1);

    System.out.println(userchoice);
    System.out.println(computerchoice);
if(userchoice==1)
{
System.out.println("user is Rock");
}
else if(userchoice==2)
{
System.out.println("user is paper");
}
else
{
System.out.println("user is scissors");
}
if(userchoice==computerchoice)
{
        System.out.println("it is a tie");
  int tie=0;
tie++;
    System.out.println(tie);

}
else if(userchoice==1&&computerchoice==2)
{
        System.out.println("computer wins");

computerwins++;
    System.out.println(computerwins);
}
else if(userchoice==2&&computerchoice==1)
{
    System.out.println("user wins");
    
    userwins++;
    System.out.println(userwins);
    
}
else if (userchoice==3&&computerchoice==1)
{
    System.out.println("user wins");
  
    userwins++;
    System.out.println(userwins);
    
}

else if(userchoice==3&&computerchoice==2)
{
    System.out.println("user wins");
    
   
    userwins++;
    System.out.println(userwins);
}
else if(userchoice==1&&computerchoice==3)
{
    System.out.println("computer wins");

computerwins++;
    System.out.println(computerwins);}

else if(userchoice==2&&computerchoice==3)
        {
        System.out.println("computer wins");
computerwins++;
            System.out.println(computerwins);
        } }

for(int overallwinner=0;overallwinner<=userwins;overallwinner++)
    
{
if(userwins>computerwins)
    
{
    System.out.println("Overall winer is user ");
}
else

    System.out.println("Overall winner is computer");



    System.out.println("Do you want to play again");
    playagain=sc.nextLine();    
    
    if(sc.nextLine().equalsIgnoreCase("Y"))
        continue;
    else
        
    {
        System.out.println("thanks fot playing");
   break;
    }
    
}  
}
}
   

package com.sonal.practiceprogramming.flowcontrol;
import java.util.Scanner;
public class knockknock
{
public static void main(String[] args)
{
Scanner inputReader=new Scanner(System.in);
System.out.println("Knock!KNock!..Guess who!!");
String nameGuess=inputReader.nextLine();
if(nameGuess.equals("Marty mcmurfy"))
{
System.out.println("yes,you are right i am here");
System.out.println("...sorry from future");
}
else
{
System.out.println("Dude..i look like" + nameGuess);
}
}
}
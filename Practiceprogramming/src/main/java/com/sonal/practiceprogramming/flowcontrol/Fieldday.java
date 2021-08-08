package com.sonal.practiceprogramming.flowcontrol;
import java.util.Scanner;
public class Fieldday
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("What's your last Name");
String lastname=sc.nextLine();


if (lastname.equals("A")||lastname.equals("B"))
{
System.out.println("Your are in team Red Dragon");
System.out.println("Good luck in the games");
}
if (lastname.equals("C")||lastname.equals("D"))
{
System.out.println("Your are in team Dark Wizards");
System.out.println("Good luck in the games");
}
if (lastname.equals("E")||lastname.equals("I"))
{
System.out.println("Your are in team Moving Castles");
System.out.println("Good luck in the games");
}
if (lastname.equals("H")||lastname.equals("L"))
{
System.out.println("Your are in team Golden Snitches");
System.out.println("Good luck in the games");
}
if (lastname.equals("P")||lastname.equals("U"))
{
System.out.println("Your are in team Night Guards");
System.out.println("Good luck in the games");
}
if (lastname.equals("V")||lastname.equals("Z"))
{
System.out.println("Your are in team Black Holes");
System.out.println("Good luck in the games");
}
}
}
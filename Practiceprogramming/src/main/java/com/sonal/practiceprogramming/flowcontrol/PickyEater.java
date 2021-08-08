package com.sonal.practiceprogramming.flowcontrol;
import java.util.Scanner;
public class PickyEater
{
public static void main(String[] args)
{
Scanner userinput=new Scanner(System.in);
System.out.println("How many times it been fried");
int timesfried=Integer.parseInt(userinput.nextLine());
System.out.println("Does it has some spinach in it");
String hasspinach=userinput.nextLine();
System.out.println("Does it covered with cheese? (Y/N)");
String cheesecovered=userinput.nextLine();
System.out.println("How many pats of butter on it");
int butterpats=Integer.parseInt(userinput.nextLine());
System.out.println("is it covered in chocolate (Y/N)");
String coveredchoco=userinput.nextLine();
System.out.println("Does it has funny name Y/N");
String funnyname=userinput.nextLine();
System.out.println("is it Brocoli");
String isbrocoli=userinput.nextLine();
if(hasspinach.equals("Y")||funnyname.equals("Y"))
{
System.out.println("There is no way he'll eat that");
}
}
}
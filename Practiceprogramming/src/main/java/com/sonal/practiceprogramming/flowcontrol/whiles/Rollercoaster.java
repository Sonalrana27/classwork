package com.sonal.practiceprogramming.flowcontrol.whiles;
import java.util.Scanner;
public class Rollercoaster
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("we are going to start roller coaster");
System.out.println("let me know when yo want to stop");
String keepriding="y";
int looplooped=0;
while(keepriding.equals("y"))
{
System.out.println("wants to keep going");
keepriding=sc.nextLine();
looplooped++;
}
System.out.println("wow,that was fun");
System.out.println("we loop that looped"+looplooped+"times");
}

}
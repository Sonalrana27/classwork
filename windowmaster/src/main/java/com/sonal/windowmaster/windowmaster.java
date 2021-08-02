package com.sonal.windowmaster;
import java.util.Scanner;
public class windowmaster
{
public static void main(String[] args)
{
Float height;
Float width;
String stringheight;
String stringwidth;
Float areaofwindow;
Float cost;
Float perimeterofwindow;
Scanner myscanner=new Scanner(System.in);
System.out.println("please enter window height");
stringheight=myscanner.nextLine();
System.out.println("please enter window width");
stringwidth=myscanner.nextLine();
height = Float.parseFloat(stringheight);
width = Float.parseFloat(stringwidth);
areaofwindow=height*width;
perimeterofwindow=2*(height+width);

cost=((3.52f * areaofwindow)+(2.25f * perimeterofwindow));

System.out.println("window height " +stringheight);
System.out.println("window width " +stringwidth);
System.out.println("window area = "+areaofwindow);
System.out.println("Perimeter of Window =" +perimeterofwindow);
System.out.println("total cost ="+cost);
}}


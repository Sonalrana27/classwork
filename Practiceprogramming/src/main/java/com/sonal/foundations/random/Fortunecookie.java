package com.sonal.foundations.random;
import java.util.Random;
public class Fortunecookie
{
public static void main(String[] args)
{

Random rm=new Random();
int x=rm.nextInt(10);
System.out.println("this is your greek"+x);
switch(x)
{
case 0:
System.out.println("never go against sicilian when death is there");
break;
case 1:
System.out.println("Goonies never say die");
break;
case 2:
System.out.println("with great power,there must also come great resposibilties");
break;
case 3:
System.out.println("never argue the data");
break;
case 4:
System.out.println("Try not,do or do not.There is no try");
break;
case 5:
System.out.println("Your are the leaf in the wind ,watch out how you soar");
break;
case 6:
System.out.println("Do absolutely nothing,this is everything what you are doing");
break;
case 7:
System.out.println("knee before Zod");
break;
case 8:
System.out.println("Make it so");
break;
default :
System.out.println("Those arn't the deroids you are looking for");

}
}
}
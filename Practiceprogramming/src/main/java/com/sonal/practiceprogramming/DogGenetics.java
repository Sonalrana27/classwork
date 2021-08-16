package com.sonal.practiceprogramming;
import java.util.Random;
public class DogGenetics
{
public static void main(String[] args)
{
System.out.println("what type of information you want press number ");
Random rm=new Random();
int dognumber=rm.nextInt(5);

System.out.println("well,i have this highly reliable report on "+dognumber+ "prestigious background right there");

switch(dognumber)
{
case 1:
{

System.out.println("first dog \n 98% of bernard \n");
System.out.println("2%if pug");
break;
}
case 2:
{
System.out.println("second dog \n 85% of chihuahua \n");
System.out.println("15% of laibra");
break;
}
case 3:
{
System.out.println("80% of Doberman \n");
System.out.println("20% of bernard");
break;
}
case 4:
{
System.out.println("75% of laibra \n");
System.out.println("25% of Doberman");
break;
}
case 5:
{
System.out.println("90% of chihuahua \n");
System.out.println("10% of pug");
break;
}
default:
{
System.out.println("wow that's quite the dog");
}
}
}
}
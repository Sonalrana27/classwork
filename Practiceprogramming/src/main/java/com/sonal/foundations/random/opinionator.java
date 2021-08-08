//random give different result everytime when i run my program
package com.sonal.foundations.random;
import java.util.Random;
public class opinionator
{
public static void main(String[] args)
{
Random rm=new Random();
System.out.println("i cannot choose which is my favorite animal");
System.out.println("I'm sure Random can help me for that");
int x=rm.nextInt(5);
System.out.println("The number we choose are"+ x);
switch(x)
{
case 0:
System.out.println("Llamas are the best");
break;
case 1:
System.out.println("dodos are the best");
break;
case 2:
System.out.println("wooly mommoths are best");
break;
case 3:
System.out.println("sharks are the greatest");
break;
case 4:
System.out.println("Cocktoos are just awesome");
break;
case 5:
System.out.println("Mole-rat are the great");
break;

default:
System.out.println("Thank you random,maybe you are the best");
}
}
}
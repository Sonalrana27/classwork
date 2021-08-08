package com.sonal.foundations.random;
import java.util.Random;
public class HighRoller
{
public static void main(String[] args)
{
Random rm=new Random();
int rollresult=rm.nextInt(6)+1;
System.out.println("time to roll the dice");
System.out.println("i rolled a"+rollresult);
if(rollresult==1)
{
System.out.println("you rolled a critical failure");
}
else
{
System.out.println("you rolled a critical nice");
}
}
}
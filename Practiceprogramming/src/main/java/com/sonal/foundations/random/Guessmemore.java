package com.sonal.foundations.random;
import java.util.Random;
public class Guessmemore
{
public static void main(String[] args)
{
Random rm=new Random();
int guessnm=rm.nextInt(100)+1;
System.out.println("time to guess");
System.out.println("i rolled a"+guessnm);
if(guessnm<=47)
{
System.out.println("your guess is too low");
}
else
{
System.out.println("nice guess");
}
}
}
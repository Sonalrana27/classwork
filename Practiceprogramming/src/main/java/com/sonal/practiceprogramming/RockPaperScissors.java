package com.sonal.practiceprogramming;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors
{
public static void main(String[] args)
{
int computerdice=0;
int userdice=0;
Scanner sc=new Scanner(System.in);
int turn;
int totalturns=10;

int computerscore=0;
int userscore=0;
Random rm=new Random();
int user=rm.nextInt(3);
System.out.println(+user);
if(user==1)
{
System.out.println("user is Rock");
}
else if(user==2)
{
System.out.println("user is paper");
}
else
{
System.out.println("user is scissors");
}
System.out.println();
System.out.println();

for (turn=1;turn<=totalturns;turn++)
    computerdice=rm.nextInt(6);
  userdice=rm.nextInt(6);
System.out.println(+computerdice);
System.out.println(+userdice);
if(computerdice>userdice)
{
computerscore+=1;
System.out.println("computer won"+turn);
}
else if(userdice>computerdice)
{
userdice+=1;
System.out.println("user won"+turn);
}
else
{
System.out.println("its a tie"+turn);
}
System.out.println();
if(computerdice>userdice)
{
System.out.println("computer is grandwinner"+computerscore+"out of"+totalturns);
}
else if(userdice>computerdice)
{
System.out.println("user is grand winner"+userscore+"out of"+totalturns);
}
else if(computerdice==userdice)
{
System.out.println("its a tie of"+computerscore+"and"+userscore+"out of"+totalturns);
}
String playmore=sc.nextLine();
System.out.println("play more y/n"+playmore);
if(playmore=="y")
{
System.out.println(+turn);

}
else
{
System.out.println("moving out");
}
}
}
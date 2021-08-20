package com.sonal.classmodeling;
import java.util.Scanner;
import java.util.Random;
public class classLuckySeven
{
public void lucky()
{
System.out.println("How many dollar do you have");
Scanner sc=new Scanner(System.in);
double dollor=sc.nextDouble();
System.out.println(+dollor);

System.out.println("you can roll dice");
Random rm=new Random();
int rolls=rm.nextInt(10);
System.out.println(""+rolls);
for(int i=1;i<rolls;i++)
{
int dice=rm.nextInt(6);
for(int j=0;j<=dice;j++)
{
int sum=dice+j;
System.out.println("sum of dies"+sum);

if(sum==7)
{
System.out.println("you win $4");
}
else
{
System.out.println("you lose $1");
}}
}
}

}

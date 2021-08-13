package com.sonal.practiceprogramming;
import java.util.Scanner;
public class Factorizer
{
public static void main(String[] args)
{
System.out.println("What number would you like to Factor?");
Scanner sc=new Scanner(System.in);
int input=sc.nextInt();
System.out.println("Factors of "+input+" are");
int count=0;
for(int i=1;i<=input;i++)


if(input%i==0)
{
System.out.print(" "+i);

count++;
}
System.out.println("\n");
System.out.println(+input+" is a perfect number \n");
System.out.println(+input+" has "+count+" Factors");
if(count==2)
{
System.out.println(+input+" is  a Prime no.");
}
else
{
System.out.println(+input+" is a not a Prime no. ");
}
}}
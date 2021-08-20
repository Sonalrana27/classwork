package com.sonal.classmodeling;
import java.util.Scanner;
public class classcalculateinterest
{
public void interest()
{

int interestrate=10;
Scanner sc=new Scanner(System.in);
int totalyears=sc.nextInt();
double amount=sc.nextDouble();
System.out.println("How much you want to invest?" +amount);
System.out.println("How many years are you investing" +totalyears);
System.out.println("what is the annual interst rate" +interestrate);

double newamount=amount;

for(int i=1;i<=totalyears;i++)

for(int j=1;j<=i;j++)
{

System.out.println("Calculating year" +j);



double c =(newamount*interestrate*j)/100;


System.out.println("earned " +c);

double ended=c+newamount;
System.out.println("ended with "+ended);
}
}
}

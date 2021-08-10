package com.sonal.practiceprogramming.flowcontrol.whiles;
import java.util.Scanner;
public class staypositive
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("what no. you wanna start");
int n=Integer.parseInt(sc.nextLine());

int i=n;
while(i>=1)
{
int j=i;
while(j<=5)

{
System.out.print(j);
j++;
}
System.out.print("\n");
System.out.print(i);
i--;

}
System.out.println("blast off");
}
}
package com.sonal.practiceprogramming;
import java.util.Scanner;
public class HealthyHearts
{
public static void main(String[] args)
{
System.out.println("what is your age ");
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
System.out.println(+age);
if((age<=10)||(age<=20))
{
System.out.println("your maximum heart rate should be 110 beats per minute \n");
System.out.println("you target HR zone is 65-125 beats per minute");
}
 else if((age<=21)||(age<=40))
{
System.out.println("your maximum heart rate should be 130 beats per minute \n");
System.out.println("you target HR zone is 75-135 beats per minute");
}
else if((age<=41)||(age<=50))
{
System.out.println("your maximum heart rate should be 150 beats per minute \n");
System.out.println("you target HR zone is 85-145 beats per minute");
}
else if((age<=51)||(age<=65))
{
System.out.println("your maximum heart rate should be 170 beats per minute \n");
System.out.println("you target HR zone is 90-150 beats per minute");
}
else
{
System.out.println("your maximum heart rate should be 180beats per minute \n");
System.out.println("you target HR zone is 90-155 beats per minute");
}
}
}
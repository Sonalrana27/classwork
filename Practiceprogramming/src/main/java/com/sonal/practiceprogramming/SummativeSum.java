package com.sonal.practiceprogramming;
public class SummativeSum
{
public static void main(String[] args)
{
int a[]={45,21,18,9,34};
int b[]={1,90,-55,-33,67,-16,28,-55,15};
int c[]={999,-60,-77,14,160,301};
int d[]={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,-99};
System.out.println("sum of numbers"+add(a));
System.out.println("sum of numbers"+add(b));
System.out.println("sum of numbers"+add(c));
System.out.println("sum of numbers"+add(d));
}
public static int add(int[] x)
{
int sum=x[0];
for(int count=0;count<x.length;count++)
sum+=x[count];



return sum;
}
}
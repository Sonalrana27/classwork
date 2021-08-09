package com.sonal.practiceprogramming.flowcontrol.whiles;
public class waitAwhile
{
public static void main(String[] args)
{
int timenow=5;
int bedtime=10;
while(timenow<bedtime)
{
System.out.println("its only"+timenow+"o'clock");
System.out.println("i stayed up little longer");
timenow++;
}
System.out.println("oh its"+timenow+"o'clock");
System.out.println("time to go to bed");
}
}
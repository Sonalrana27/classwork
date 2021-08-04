package com.sonal.practiceprogramming;
public class ifstatement
{
public static void main(String[] args)
{
int day=4;
String dayname="";
if (day ==1)
{
dayname="Monaday";
}
else if (day==2)
{
dayname="Tueday";
}
else if (day==3)
{
dayname="Wednesday";
}
else if(day==4)
{
dayname="Thursday";
}
else if (day==5)
{
dayname="Friday";
}
else if (day==6)
{
dayname="saturday";
}
else if (day==7)
{
dayname="sunday";
}
else
{
dayname="invalid name";
}
System.out.println(dayname);
}
}

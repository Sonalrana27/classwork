package com.sonal.practiceprogramming;
import java.util.Scanner;
public class birthstone
{
public static void main(String[] args)
{
float n;
String stringn;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your month");
stringn=sc.nextLine();
n=Float.parseFloat(stringn);
System.out.println("entered month is " +n);
if(n==1)
{
System.out.println("January birthstone is Granut");
}
else if(n==2)
{
System.out.println("February birthstone is Amenthyst");
}
else if(n==3)
{
System.out.println("March birthstone is Ayuamarine");
}
else if(n==4)
{
System.out.println("April birthstone is Diamond");
}
else if(n==5)
{
System.out.println("May birthstone is Emerald");
}
else if(n==6)
{
System.out.println("June birthstone is Pearl");
}
else if (n==7)
{
System.out.println("July birthstone is Ruby");
}
else if (n==8)
{
System.out.println("August birthstone is Peridot");
}
else if (n==9)
{
System.out.println("September birthstone is Sappire");
}
else if (n==10)
{
System.out.println("October birthstone is Opal");
}
else if (n==11)
{
System.out.println("November birthstone is Topaz");
}
else if (n==12)
{
System.out.println("December birthstone is Turquoise");
}
else
{
System.out.println("Entered number does not corresponds to month value");
}
}
}
package com.sonal.practiceprogramming;
public class switchstatement
{
public static void main(String[] args)
{
int day=4;
String dayname="";
switch(day)
{
case 1:
dayname="monday";
break;
case 2:
dayname="tuesday";
break;
case 3:
dayname="Wednesday";
break;
case 4:
dayname="Thursaday";
break;
case 5:
dayname="Friday";
break;
case 6:
dayname="saturday";
break;
case 7:
dayname="Sunday";
break;
default:
dayname="invalid day";
}
System.out.println(dayname);
}
}
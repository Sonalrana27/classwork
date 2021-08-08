package com.sonal.practiceprogramming.flowcontrol;
public class SpaceRustlers
{
public static void main(String[] args)
{
int spaceships=10;
int aliens=25;
int cows=100;
if (aliens> spaceships)
{
System.out.println("lets,get going");
}
else
{
System.out.println("there aren't enouugh green guys to run the ships");
}
if (cows==spaceships)
{
System.out.println("wow,way to plan ahead,w'll have more humburgers");
}
else if(cows>spaceships)
{
System.out.println("dangits,i don't know how to fit cows here");
}
else
{
System.out.println("too many cows to fit in there");
}
}

}
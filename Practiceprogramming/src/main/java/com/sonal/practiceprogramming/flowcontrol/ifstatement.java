package com.sonal.practiceprogramming.flowcontrol;
public class ifstatement
{
public static void main(String[] args)
{
int llamas=20;
int whales=15;
int dodos=0;
if (dodos>0)
{
System.out.println("Egads,i think dodos are instinct");
}
if (dodos<0)
{
System.out.println("how can dodos be negative");
}
if(llamas>whales)
{
System.out.println("whales must be bigger but llamas are better");
}
if(llamas <= whales)
{
System.out.println("llamas beats whales");
}
System.out.println("There has been huge increase in dodos population by clonin");
dodos +=100;
if( (llamas+whales)<dodos)
{
System.out.println("i do not know one day dodos will run the earth");
}
if(llamas>whales && llamas>dodos)
{
System.out.println("i don't know how llamas have comes out ahead");
}
}
}
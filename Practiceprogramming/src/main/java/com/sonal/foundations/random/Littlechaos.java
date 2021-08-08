package com.sonal.foundations.random;
import java.util.Random;
public class Littlechaos
{
public static void main(String[] args)
{
Random rm=new Random();
System.out.println("random can make integer"+rm.nextInt());
System.out.println("or a Double"+rm.nextDouble());
System.out.println("or even a boolean"+rm.nextBoolean());
int num=rm.nextInt(100);
System.out.println("you can store randomized result"+num);
System.out.println("and you use them over and over again" +  num +","  +num);
System.out.println("here are some bunch of random number 0-100");
System.out.println(rm.nextInt(101)+",");
System.out.println(rm.nextInt(101)+",");
System.out.println(rm.nextInt(101)+",");
System.out.println(rm.nextInt(101));
}

}
















































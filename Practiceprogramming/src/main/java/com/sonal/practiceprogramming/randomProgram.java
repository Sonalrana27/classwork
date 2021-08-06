package com.sonal.practiceprogramming;
import java.util.Random;
public class randomProgram
{
public static void main(String[] args)
{
Random rng=new Random();
double min=-7.5;
double max=13.2;
double range=max-min;
double zerotoone=rng.nextDouble();
double stepone=zerotoone*range;
double steptwo=stepone+min;



}
}
package com.dover.dayonetwo;
import java.util.*;
public class ArrayAccess {
	public static void main(String[] arg)
	{
		
	int[] arr = new int[5];
	for(int i=0;i<5;i++)
	{
		arr[i]=i+1;
	}
	Scanner s= new Scanner(System.in);
	boolean b=false;
	int i;
	while(!b)
	{
		System.out.print("Enter index b/w (0-4): ");
		try 
		{
	i=s.nextInt();
	if(i<0 || i>4)
	{
		throw new ArrayIndexOutOfBoundsException("Indext out of bound");
	}
	System.out.println("value at index i: "+arr[i]);
	b=true;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error: "+ e.getMessage());
		}
	}
	s.close();
}
}

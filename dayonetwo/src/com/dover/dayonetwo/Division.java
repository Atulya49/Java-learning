package com.dover.dayonetwo;
import java.util.*;
public class Division {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		try {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			s.close();
		}
	}
}

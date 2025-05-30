package com.dover.dayonetwo;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		int x=0;
		boolean valid=false;
		while(!valid)
		{
			System.out.print("Enter quantity");
			try {
				 x=a.nextInt();
				 if(x<1 || x>10) {
					 throw new  InvalidQuntityException("Quantity must be b/w 1 and 10");
				 }
				 valid=true;
			}
			catch( InvalidQuntityException e){
				System.out.println("Enter quantity within the range");
				
			}
		}
		
		System.out.println("Quantity: "+ x);
		a.close();
		
	}
}

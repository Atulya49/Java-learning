package com.dover.dayonetwo;
import java.util.Scanner;
public class AgeValidation {
     public static void main(String[] arg)
     {
    	 Scanner a= new Scanner(System.in);
 		int x=0;
 		boolean valid=false;
 		while(!valid)
 		{
 			System.out.print("Enter Age");
 			try {
 				 x=a.nextInt();
 				 if(x<18) {
 					 throw new InvalidAgeException("Age must be >= 18 ");
 				 }
 				 valid=true; 
 			}
 			catch(InvalidAgeException e){
 				System.out.println("Error :"+e.getMessage());	
 			}
 		}
 		System.out.println("Age: "+ x);
 		a.close();
     }
}

package com.dover.dayonetwo;
import java.util.Scanner;
public class LoginSystem {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String user,password;
	String a="Atul";
	String b="123";
	int c=0;
	//boolean valid=true;
	while (c<4)
	{
		System.out.println("Enter username");
		user=s.nextLine();
		System.out.println("Enter Password");
		password=s.nextLine();
		try {
			if(user.equals(a) && password.equals(b) && c<4)
			{
				c=4;
				//valid=false;
			}
			else
			{
				c++;
				if(c>3)
				{
					//valid=false;
					throw new TooManyAttempts("Maximun attemp failed");
				}
			}
		}
		catch(TooManyAttempts e){
			System.out.println(e.getMessage());
		}
	}
	System.out.println("Succesfull login");
	s.close();
}

}

package com.dover.dayonetwo;

public class BankAcnt {
  private String accNum;
  private double bal;
public BankAcnt(String accNum, double bal) 
{
	this.accNum = accNum;
	this.bal = bal;
}
  public void deposit(double x)
  {
	  if(x>0)
	  {
		  bal+=x;	  }
  }
  public void withdraw(double x)
  {
	  if(x>0 && x<=bal)
	  {
		  bal-=x;	  }
  }
  public void getBalance()
  {
	  System.out.println("Balance is: "+ bal);
  }
  public static void main(String[] args)
  {
	  BankAcnt b1= new BankAcnt("xyz",100.6);
	  b1.deposit(20);
	  b1.withdraw(90);
	  b1.getBalance();  
  }
}

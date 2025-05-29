
package com.dover.dayonetwo;


public class Vehicle {
  public void move()
  {
	   System.out.println("Vehicle moved");
  }
}
class Car extends Vehicle
{
	@Override
	public void move()
	{
		 System.out.println("Car moved");
  }
}
class Bike extends Vehicle
{
	@Override
	public void move()
	{
		 System.out.println("Bike moved");
  }
}
class Truck extends Vehicle
{
	@Override
	public void move()
	{
		 System.out.println("Truck moved"); 
   }
}



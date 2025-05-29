package com.dover.dayonetwo;

public class Student {
	private String name;
	private int roll;
	private int marks;
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setMarks(int marks) {
		if(marks>=0 && marks<=100)
		this.marks = marks;
	}
	

public static void main(String[] arg)
{
	Student s=new Student();
	s.setName("Atul");
	s.setRoll(101);
	s.setMarks(85);
	s.setMarks(-150);
	s.setMarks(150);
	
	System.out.println("Name: "+ s.getName());
	System.out.println("Roll: "+ s.getRoll());
	System.out.println("Marks: "+ s.getMarks());
	
}
}

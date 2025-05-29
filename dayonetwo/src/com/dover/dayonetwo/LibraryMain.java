package com.dover.dayonetwo;

public class LibraryMain {
	public static void main(String[] args)
	{
		Library a=new Library();
		a.add("Java","Suryakant");
		a.add("Windchill", "mudit");
		a.add("Nothing", "Atul");
		
		a.show();
		System.out.println();
		a.remove("Windchill", "mudit");
		a.show();	
	}

}

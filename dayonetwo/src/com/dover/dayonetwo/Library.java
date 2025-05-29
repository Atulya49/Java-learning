package com.dover.dayonetwo;

public class Library {
     Boook[] boooks= new Boook[4];
     int c=0;
     public void add(String t,String a)
     {
    	 if(c<3)
    	 {
    		 boooks[c]= new Boook(t,a);
    		 //Null point exception b/c array of object and each element is null so there is no object 
    		 c++;
    		/* books[c]=new Boook();
    		 books[c].title=t;
    		 books[c].author=a;
    		 */
    	 }
     }
     public void remove(String t, String a)
     {
    	 for(int i=0;i<c;i++)
    	 {
    		 if(boooks[i].title.equals(t) && boooks[i].author.equals(a))
    		 {
    			 if(i==c-1)
    			 {
    				 c--;
    				 break;
    			 }
    			 else {
    			 for(int j=i;j<c-1;j++)
    			 {
    				 boooks[j]=boooks[j+1];
    			 }
    		 }
    		 boooks[c-1]=null;
    		 c--;
    		 break;
    		 }
    		 
     }
     }
     public void show()
     {
    	 for(int i=0;i<c;i++)
    	 {
    		 System.out.println(boooks[i].title +" : "+ boooks[i].author);
    	 }
     }
}

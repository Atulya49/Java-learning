package com.dover.dayonetwo;


public class summinmax {
	public static void main(String arg[])
	{
	  int[] arr= {1,2,3,4,5};
	  int sum=0;
	  int ma=Integer.MIN_VALUE;
	  int mi=Integer.MAX_VALUE;
	  for(int i=0;i<5;i++) {
		sum+=arr[i];
		ma=Math.max(ma,arr[i]);
        mi=Math.min(mi,arr[i]);		
	  }
	 System.out.println("sum=" + sum);
	 System.out.println("maximum=" + ma);
	 System.out.println("minimum=" + mi);
	 
	}

}

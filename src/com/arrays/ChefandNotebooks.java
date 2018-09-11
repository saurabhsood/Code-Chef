package com.arrays;

import java.util.Scanner;

public class ChefandNotebooks {

	public static void main(String s[])
	{
		Scanner scan = new Scanner(System.in);
		int testcases=scan.nextInt();
		int x=0; // No . Of Pages wants to write
		int y=0; // No. Of Pages Notebook has
		int k=0; //Budget
		int n=0; // Notebooks in the shop.		
		outer:
		for(int i=0; i < testcases ; i++)
		{
			x= scan.nextInt();
			y= scan.nextInt();
			k= scan.nextInt();
			n= scan.nextInt();	
			boolean found = false;
			for(int j=0; j < n ; j++)
			{
				int p = scan.nextInt(); // no. of pages
				int c = scan.nextInt(); // cost
				if(p >=(x-y) && c<=k)
				{
					
					//continue outer;
					found= true;
				}
			}	
			if(found)
				System.out.println("LuckyChef");
			else
				System.out.println("UnluckyChef");
		}		
	}
	
}

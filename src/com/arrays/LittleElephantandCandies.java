package com.arrays;

import java.util.Scanner;

public class LittleElephantandCandies {

	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int noEle=0;
		int noCandies=0;
		outer:
		for(int i=0; i < line ;i++)
		{
			noEle=sc.nextInt();
			noCandies = sc.nextInt();
			int totalCandies=0;
			for(int j =0; j < noEle ; j++)
			{
				totalCandies+=sc.nextInt();
			}
			if(noCandies>=totalCandies)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	
	
	
}

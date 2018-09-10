package com.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeadGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long count = Long.valueOf(br.readLine());
		long p1,p2=0;
		long maxp1=0;
		long maxp2=0;
		for(int i=0; i < count;i++)
		{
			String a[] = br.readLine().split(" ");
			p1=Long.valueOf(a[0]);
			p2=Long.valueOf(a[1]);
			if(p1 > p2)
			{
				long lead = p1 - p2;
				maxp1 = lead > maxp1 ? lead : maxp1;			
			}
			else
			{
				long lead = p2 - p1;
				maxp2 = lead > maxp2 ? lead : maxp2;				
			}
		}
		System.out.println(maxp1 > maxp2?1+" "+maxp1:2+" "+maxp2);
	}

}

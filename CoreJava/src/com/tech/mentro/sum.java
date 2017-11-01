package com.tech.mentro;
import java.util.*;
class sum
{
	public static void main(String arr[])
	{
		sum k=new sum();
		Scanner in=new Scanner(System.in);
		int a1=in.nextInt();
		int b1=in.nextInt();
		int c=k.add(a1,b1);
		
		System.out.println(c);
	
}
		public int add(int a, int b)
		{
			int d=a+b;
			return d;
		}
	
}
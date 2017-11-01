package com.tech.mentro;


import java.util.*;

public class SingleStarA
{
	public static void main(String[] arr)
	{
		Scanner in=new Scanner(System.in);
		int i,j,k=1;
		char ch;
		System.out.println("Input an Alphabet in capital letters that you want to print:");
		String str=in.nextLine();
		 ch=str.charAt(0);
		 System.out.println("nnnn");
		switch(ch)
		{
		case 'A':
		System.out.println("ttt    ");
		for(i=1;i<=40;++i)
		{
		for(j=0;j<=22;++j)
		{
		if(i==1||i==2||i==21||i==20)
		System.out.println("*");
		else
		{
		if(j==0||j==20)
			System.out.println("**");
		else
		System.out.println(" ");
		}
		}
		System.out.println("nttt	");;

		}
		break;
		default:
		{
			System.out.println("Invalid");
	}

	}}}

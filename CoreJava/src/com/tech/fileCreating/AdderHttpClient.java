package com.tech.fileCreating;
import java.io.*;
import java.net.*;
import java.util.*;
class AdderHttpClient
{
	public static void main(String arr[])throws Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first No. is : ");
		int a=in.nextInt();
		System.out.println("Enter second No. is : ");
		int b=in.nextInt();
		//Creating address or the web page
		StringBuilder str=new StringBuilder();
		str.append("http://localhost:8080/ClientHTTP/adder.jsp");
		str.append("?num1=").append(a).append("&num2=").append(b);
		//URL object is created for the address
		//System.out.println("Url:"+str);
		URL url=new URL(str.toString());
		//Sending request for the address
		URLConnection con=url.openConnection();
		//Obtaining the length of response
		int len=con.getContentLength();
		
		if(len==0){
	System.out.println("No response received.");}
		else{
			//Stream is obtained to read the  response
			InputStream cin=con.getInputStream();
		//bytes are read from the stream and displayed on the console
		while(true)
		{
			int ch=cin.read();
			if(ch==-1){
				break;}
			else{
			System.out.print((char)ch);
			}
		}
		}
	}
}
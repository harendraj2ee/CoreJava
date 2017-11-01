package com.tech.fileCreating;

import java.net.*;
import java.io.*;
class Client
{
	public static void main(String arr[])
	{
		try
		{
			System.out.println("Client Started sending connection request. -------------");
			Thread.sleep(2000);
			Socket socket=new Socket("localhost", 5000);
			Thread.sleep(1000);
			System.out.println("Connection completed, sending message. ------------------");
			//To read the message from keyboard line by line
			BufferedReader kin=new BufferedReader(new InputStreamReader(System.in));
			//To write message to the socket line by line
			PrintStream sout=new PrintStream(socket.getOutputStream());
			//Stream to read message from the socket line bye line
			BufferedReader sin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true)
			{
				System.out.println("Enter message to send, over and out to terminate. ");
				String msg=kin.readLine();
				//Message is written to the socket
				sout.println(msg);
				if(msg.equalsIgnoreCase("Over and Out"))
					break;
				//Reply is read from the socket
				String reply=sin.readLine();
				//Reply is displayed on the client's console
				System.out.println("Server : "+reply);
			}
			System.out.println("Closing Connection. ------------");
			Thread.sleep(2000);
			socket.close();
			System.out.println("Connection is closed.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
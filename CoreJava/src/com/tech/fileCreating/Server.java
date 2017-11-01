package com.tech.fileCreating;

import java.net.*;
import java.io.*;
class Server
{
	public static void main(String arr[])
	{
		try
		{
			//ServerSocket Object is created.
			ServerSocket server=new ServerSocket(5000);
			System.out.println("Server is ready, waiting for connection request. ----------");
			//Server is asked to start listening connection request
			Socket socket=server.accept();
			System.out.println("Waiting for client's messages. -------------------");
			//Stream to read message from the socket line by line
			BufferedReader sin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//To read the message from from the keyboard line by line
			BufferedReader kin=new BufferedReader(new InputStreamReader(System.in));
			//To write message to the socket line bye line
			PrintStream sout=new PrintStream(socket.getOutputStream());
			while(true)
			{
				//Reading message from the socket 
				String msg=sin.readLine();
				//If the message is over and out break the loop
				if(msg.equalsIgnoreCase("Over and Out"))
				break;
				//Otherwise display the message on Sever's Console
				System.out.println("Client : "+msg);
				//Reply is read from the keyboard
				System.out.println("Enter reply : ");
				String reply=kin.readLine();
				//Reply is written to the socket
				sout.println(reply);
			}
			System.out.println("Closing Connectin. ------------------");
			Thread.sleep(2000);
			server.close();
			socket.close();
			System.out.println("Server & connection are closed.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
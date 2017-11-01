package com.tech.fileCreating;

import java.net.*;
import java.util.*;
class UdpSender
{
	public static void main(String arr[])throws Exception
	{
		//A DatagramSocket object is created
		DatagramSocket sender=new DatagramSocket(2000);
		//Stream to read messages from keyboard
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter message to send, Over and out of terminate : ");
			String msg=in.nextLine();
			//A Packet is created to send the message 
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getLocalHost(),3000);
			//The packet is sent
			sender.send(packet);
			//if the message is over and out the break the loop
			if(msg.equalsIgnoreCase("Over and Out"))
			break;
			//Otherwise sent notification is displayed on the console
			System.out.println("Successfully sent.");
		}
		sender.close();
	}
}
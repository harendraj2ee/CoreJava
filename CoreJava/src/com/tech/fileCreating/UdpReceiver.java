package com.tech.fileCreating;

import java.net.*;
import java.util.*;
class UdpReceiver
{
	public static void main(String arr[])throws Exception
	{
		//A DatagramSocket Object is created
		DatagramSocket receiver=new DatagramSocket(3000);
		System.out.println("Receiver is ready. :");
		while(true)
		{
			//A Packet is created to receive the message
			DatagramPacket packet=new DatagramPacket(new byte[100],100);
			//Data is received into the packet
			receiver.receive(packet);
			//A String object is created for the received data
			String msg=new String(packet.getData());
			//Leading Spaces if any are removed from the message
			msg=msg.trim();
			//if the message is over and out then break then loop
			if(msg.equalsIgnoreCase("Over and Out"))
				break;
			//Otherwise the message is displayed on the console
			System.out.println("Received : "+msg);
		}
		receiver.close();
	}
}
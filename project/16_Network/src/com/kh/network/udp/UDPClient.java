package com.kh.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		// 입력 받은 값을 UDP 서버로 전송
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전송 메시지 : ");
		String message = sc.nextLine();
		
		try(DatagramSocket ds = new DatagramSocket()) {
			// 서버 IP, port 
			InetAddress ia = InetAddress.getByName("192.168.10.27");
			System.out.println(ia);
			int port = 8080;
			
			DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, ia, port);
			ds.send(dp);
		} catch(SocketException e) {
			e.printStackTrace();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

package com.kh.thread.chat;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		int port = 7979;
		try {
			Socket socket = new Socket("192.168.10.24", port);
			if(socket != null) {
				// 스트림 생성 
				// receiver 
				ClientReceiver sr = new ClientReceiver(socket);
				sr.start();
				// sender
				ClientSender ss = new ClientSender(socket);
				ss.start();
				// 데이터 통신
			}
		} catch(IOException e) {
			e.getMessage();
		}
	}
}

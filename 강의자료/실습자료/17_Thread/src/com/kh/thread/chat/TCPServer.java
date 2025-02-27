package com.kh.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// (1) 포트 지정 (IP는 PC에서 지정됨!)
		int port = 7979;
		
		try {
			// (2) ServerSocket 객체 생성 ( +포트 )
			ServerSocket server = new ServerSocket(port);
			
			// (3) Socket 객체 생성 ( 요청에 대한 수락 )
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
			
			// * 클라이언트로부터 메시지를 받는 쓰레드 => ServerReceiver
			ServerReceiver receiver = new ServerReceiver(socket);
			Thread task1 = new Thread(receiver);
			task1.start();
			
			// * 클라이언트로 메시지를 보내는 쓰레드 => ServerSender
			Runnable sender = new ServerSender(socket);
			Thread task2 = new Thread(sender);
			task2.start();
			
			/*
			Runnable a = () -> {
				// run 메소드 재정의
			};
			*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

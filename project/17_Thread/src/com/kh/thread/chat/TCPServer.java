package com.kh.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// 1) 포트 지정
		int port = 7979;
		try {
			// 2) ServerSocket 객체 생성
			ServerSocket server = new ServerSocket(port);
			// 3) Socket 객체 생성 (요청에 대한 수락)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "연결...");
			// 클라이언트로부터 메시지를 받는 스레드
			ServerReceiver sr = new ServerReceiver(socket);
			Thread receiverTask = new Thread(sr);
			receiverTask.start();
			
			// 클라이언트로 메시지를 보내는 스레드
			ServerSender ss = new ServerSender(socket);
			Thread senderTask = new Thread(ss);
			senderTask.start();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

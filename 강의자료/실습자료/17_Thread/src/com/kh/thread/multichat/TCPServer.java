package com.kh.thread.multichat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TCPServer {
	
	public static Queue<String> msgQueue = new LinkedList<>();
	public static List<BufferedWriter> bwList = new ArrayList<>(); 
	
	public static void main(String[] args) {
		// (1) 포트 지정 (IP는 PC에서 지정됨!)
		int port = 7777;

		
		try {
			// (2) ServerSocket 객체 생성 ( +포트 )
			ServerSocket server = new ServerSocket(port);

			// * 클라이언트로 메시지를 보내는 쓰레드 => ServerSender
			Runnable sender = new ServerSender();
			Thread task2 = new Thread(sender);
			task2.start();
			
			while(true) {
				// (3) Socket 객체 생성 ( 요청에 대한 수락 )
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
	
				
				// * 클라이언트로부터 메시지를 받는 쓰레드 => ServerReceiver
				ServerReceiver receiver = new ServerReceiver(socket);
				Thread task1 = new Thread(receiver);
				task1.start();
				
				bwList.add(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8")));
			}
			
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

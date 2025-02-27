package com.kh.thread.multichat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {
	private Socket socket;
	
	public ClientSender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		// Socket 객체로부터 출력용 스트림 생성
		try (PrintWriter pw = new PrintWriter(socket.getOutputStream());) {
			
			while(true) {
				// 콘솔창으로 입력된 값을 서버로 전송(출력)
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage);
				pw.flush();
				
				Thread.sleep(1);
			}
		} catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}






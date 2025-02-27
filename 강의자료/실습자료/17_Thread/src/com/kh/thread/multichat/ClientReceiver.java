package com.kh.thread.multichat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiver extends Thread {
	private Socket socket;
	
	public ClientReceiver(Socket socket) {
		this.socket = socket;
	}
	

	@Override
	public void run() {
		// socket 객체로부터 입력용 스트림 생성
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));) {
			while(true) {
				String message = br.readLine();
				// 전달된 메시지를 콘솔창에 출력
				System.out.println(socket.getInetAddress() + " : " + message);
				
				Thread.sleep(1);
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}

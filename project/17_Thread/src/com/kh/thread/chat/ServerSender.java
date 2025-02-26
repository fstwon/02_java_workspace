package com.kh.thread.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSender implements Runnable {
	private Socket socket;
	
	public ServerSender(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
			try(PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
				while(true) {
					Scanner sc = new Scanner(System.in);
					String message = sc.nextLine();
					pw.println(message);
					pw.flush();
				}
			} catch(IOException e) {
				e.printStackTrace();
		}
	}
}

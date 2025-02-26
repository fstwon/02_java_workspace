package com.kh.thread.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiver extends Thread {
	private Socket socket = null;
	public ClientReceiver(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
	    try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
	    	while(true) {
	    		String message = br.readLine();
	    		System.out.println("서버 : " + message);
	    	}
	    	
	    } catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	}
}

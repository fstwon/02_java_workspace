package com.kh.thread.multichat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServerSender implements Runnable {
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1);
				String msg = TCPServer.msgQueue.poll();
				
				if(msg == null) continue;
				for(BufferedWriter bw : TCPServer.bwList) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}

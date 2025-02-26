package com.kh.network.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	public void test() {
		// InetAddress : IP 주소 관련 정보를 확인할 수 있는 클래스
		try {
			System.out.println("[Local PC 정보 가져오기]");
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost); // PC/IP주소 정보
			System.out.println("Local PC 정보 : " + localHost.getHostName());
			System.out.println("Local PC의 IP 주소 : " + localHost.getHostAddress());
			
			System.out.println();
			System.out.println("[도메인을 통해 서버 정보 확인]");
			// getByName : 도메인을 통한 서버 정보를 확인할 수 있는 메소드
			InetAddress google = InetAddress.getByName("www.gooogle.com");
			System.out.println("Google 서버 명 : " + google.getHostName());
			System.out.println("Google IP 주소 : " + google.getHostAddress());
			
			System.out.println();
			System.out.println("[다수의 정보 확인]");
			
			System.out.println("[Naver]");
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트 개수 : " + naver.length);
			for(InetAddress i : naver) {
				System.out.println("네이버 호스트 정보 : " + i.getHostName());
				System.out.println("네이버 IP 주소 : " + i.getHostAddress());
			}
			
		} catch(UnknownHostException e) {
			e.getMessage();
		}
	}
}

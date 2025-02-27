package com.kh.last.p7;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 : ");
		// 키보드로 호스트명 또는 도메인명을 입력 받는다.
		String host = sc.nextLine();
		
		try {
			// 입력 받은 호스트명을 가지고,
			InetAddress[] inetArr = InetAddress.getAllByName(host);
			// 모든 ip 주소를 조회해서 출력한다.
			System.out.printf("%s는 %d개의 IP주소를 가지고 있습니다.\n"
								, host, inetArr.length);
			
			// 출력 시 호스트명과 ip 주소를 분리해서, ip 주소만 출력되게 한다.
			// 조회한 ip 개수가 1개 이상이면 루프문으로 모두 출력하고,
			int count=1;
			for(InetAddress inet : inetArr) {
				System.out.printf("%d번 IP = %s\n"
									, count++, inet.getHostAddress());
			}
			// 예외처리는 try ~ catch로 직접 처리한다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}

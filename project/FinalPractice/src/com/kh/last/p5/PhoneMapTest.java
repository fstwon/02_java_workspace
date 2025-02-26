package com.kh.last.p5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
		Map<String, Phone> map = new HashMap<String, Phone>();
		// main 함수 안에서 Phone 타입의 객체들을 선언
		Phone p1 = new Phone("galaxy S7", 563500, "삼성", 7);
		Phone p2 = new Phone("iphone 6s", 840000, "애플", 3);
		Phone p3 = new Phone("G5", 563500, "LG", 5);
		// model 을 키로 맵에 저장하고
		map.put("galaxy S7", p1);
		map.put("iphone 6s", p2);
		map.put("G5", p3);
		// 맵의 정보를 연속 출력 처리하고
		/*
		 * 출력 예시
			맵에 저장된 정보는 다음과 같습니다.
			galaxy S7 : galaxy S7, 563500, 삼성, 7
			iphone 6s : iphone 6s, 840000, 애플, 3
			G5 : G5, 563500, LG, 5
			phone.xml 파일에 성공적으로 저장되었습니다
		*/
		// 맵에 저장된 객체 정보를 연속 출력 한다.– Map.EntrySet<String, Phone> 사용할 것
		Set<Entry<String, Phone>> set = map.entrySet();
		Iterator<Entry<String, Phone>> it = set.iterator();
		
		// 맵에 저장된 객체 정보를 Properties 를 사용해 “phone.xml” 파일에 기록 저장한다.
		File file = new File("phone.xml");
		Properties p = new Properties();
		
		System.out.println("맵에 저장된 정보는 다음과 같습니다.");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			while(it.hasNext()) {
				Entry<String, Phone> e = it.next();
				String key = e.getKey();
				Phone value = e.getValue();
				p.setProperty(key, String.valueOf(value));
				p.storeToXML(new FileOutputStream(file), key);				
				System.out.println(key + " : " + value);
			}
			// Properties를 이용해 파일에 저장 시킨다.
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
	}
}

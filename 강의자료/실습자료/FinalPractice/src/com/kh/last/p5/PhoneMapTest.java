package com.kh.last.p5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
		 Map<String, Phone> map = new HashMap<String, Phone>();
		 // => 키에 대한 타입 : String
		 // => 밸류에 대한 타입 : Phone
		 
		// Phone 객체를 3개 생성
		 Phone p1 = new Phone("galaxy S7", 563500, "삼성", 7);
		 Phone p2 = new Phone("iphone 6s", 840000, "애플", 3);
		 Phone p3 = new Phone("G5", 563500, "LG", 5);
		
		 // 맵에 모델을 key로 객체를 저장한다. (=> 데이터추가 : put(키값, 밸류값))
		 map.put(p1.getModel(), p1);
		 map.put(p2.getModel(), p2);
		 map.put(p3.getModel(), p3);		 

		 // 맵에 저장된 객체 정보를 연속 출력 한다.
		 //   – Map.Entry<String, Phone> 사용할 것
		 Set<Entry<String, Phone>> entrySet = map.entrySet();
		 
		 Iterator<Entry<String, Phone>> it = entrySet.iterator();
		 while(it.hasNext()) {	// 데이터 유무 확인
			 Entry<String, Phone> entry = it.next();	// Entry 데이터 조회
			 
			 String key = entry.getKey();	// 키값 조회
			 Phone value = entry.getValue();// 밸류값 조회
			 
			 System.out.println(key + " : " + value);
		 }
		 
		 
		 // 맵에 저장된 객체 정보를 Properties 를 사용해 
		 Properties prop = new Properties();

		 // * 맵에서 키 목록 조회 => keySet():Set<K>
		 Set<String> keyList = map.keySet();
		 for(String key : keyList) {
			 prop.setProperty(key, map.get(key).toString());
			 // Map의 데이터를 Properties로 복사
			 // => map.put()과 유사한 메소드
		 }

		 //  “phone.xml” 파일에 기록 저장한다
		 try {
			 
			prop.storeToXML(new FileOutputStream("phone.xml"), "Phone 정보");
			// store => 파일(외부매체)에 출력
			// load => 파일(외부매체)로부터 입력
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}




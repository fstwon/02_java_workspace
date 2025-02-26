package com.kh.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1000, "HTML");
		hMap.put(1001, "CSS");
		hMap.put(1002, "JS");
		hMap.put(1003, "Java");
		// 키 목록 조회
		
		Set<Integer> keyList = hMap.keySet();
		System.out.println(keyList);
		System.out.println("[for-each 문 사용 조회]");
		for(Integer i : keyList) {
			System.out.println(i + " : " + hMap.get(i));
		}
		System.out.println();
		// "JS" 데이터 삭제
		hMap.remove(1002);
		// Iterator 사용하여 출력
		System.out.println("[Iterator 사용 조회]");
		Iterator<Integer> keyIt = keyList.iterator();
		while(keyIt.hasNext()) {
			int k = keyIt.next();
			System.out.println(k + " : " + hMap.get(k));
			
		}
		System.out.println();
		// entrySet : key=value 세트의 집합
		System.out.println("[Entry Set 사용 조회]");
		Set entrySet = hMap.entrySet();
		
		Iterator entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Entry entry = (Entry)(entryIt.next());
			
			Integer key = (Integer)(entry.getKey());
			String value = (String)(entry.getValue());
			System.out.println(key + " : " + value);
		}
	}

}

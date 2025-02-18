package practice_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOpractice {

	private static String fileName = "tt.txt";

	public static void main(String[] args) {
		fileWrite();
		fileRead();
	}
	
	public static void fileWrite() {
		String[] samples = {"안녕하세요", "반가워요", "또만나요"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));) {
			for(String s : samples) {
		
				bw.write(s);
				bw.newLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();		
		}
	
	}
	
	public static void fileRead() {
	
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

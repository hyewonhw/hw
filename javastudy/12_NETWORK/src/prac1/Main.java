package prac1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		
		// 임무 > C:\\storage에 저장하기
		
		try {
			
			// 접속
			String apiURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
			// 접속 확인
			if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
				System.out.println("API 접속 실패");
				return;
			}
			
			// 바이트 입력 스트림 -> 문자 입력 스트림 -> 버퍼추가
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			File file = new File("C:\\storage", "sfc_web_map.xml");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));			
			
			// readLine() 메소드를 이용한 복사
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
			
			// 닫기
			bw.close();
			br.close();
			con.disconnect();	
			
		} catch (MalformedURLException e) {
			System.out.println("API 주소오류");
		} catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("API 서버 오류");
		}
	}

}

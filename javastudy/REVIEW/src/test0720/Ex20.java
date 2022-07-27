package test0720;

public class Ex20 {

	public static void main(String[] args) {
		
		// 연습20 (switch)
		// 등급(1, 2, 3)에 따른 권한 출력
		// 1등금 : 쓰기 실행 읽기
		// 2등급 : 실행 읽기
		// 3등급 : 읽기
		// 나머지 : 없음
		
		int level = 5;
		String right = ""; // 권한
		
		switch(level) {
		case 1: right += "쓰기";
		case 2: right += "실행";
		case 3: right += "읽기"; break;
		default: right += "없음";
		}
		
		System.out.println(right);
		
	}

}

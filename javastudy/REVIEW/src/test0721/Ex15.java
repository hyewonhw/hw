package test0721;

public class Ex15 {

	public static void main(String[] args) {
		
		// 연습 15 (Math.random())
		// 확률 처리하기
		// 10% 확률로 "대박", 나머지 90% 확률로 "쪽박" 출력하기
		
		if(Math.random() < 0.1) {
			System.out.println("대박");
		} else { 
			System.out.println("쪽박");
		}
		
		
		
	}

}

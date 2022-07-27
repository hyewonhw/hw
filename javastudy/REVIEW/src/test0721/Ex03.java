package test0721;

public class Ex03 {

	public static void main(String[] args) {
		
		// 연습 03 (for문)
		// 1 ~ 100 사이의 모든 3의 배수만 출력하기
		// 힌트 : 3으로 나눈 나머지가 0인 숫자
		
		for(int n = 1; n <= 100; n++) {
			if(n % 3 == 0) {
				System.out.println(n + "");
			}
		}

	}

}

package test0721;

public class Ex04 {

	public static void main(String[] args) {
		
		// 연습 04 (for문)
		// 1 ~ 100 모든 정수 더하기 (5050출력)
		// 아래코드 참고
		int wallet = 0;
		wallet += 1000;
		wallet += 2000;
		wallet += 3000;
		System.out.println(wallet);

		int total = 0;
		for(int n = 1; n <= 100; n++) {
			total += n;
		}
		System.out.println("전체 합 : " + total);
		
		
		
		
	}

}

package test0721;

public class Ex09 {

	public static void main(String[] args) {
		
		// 연습 09 (continue)
		// 1 ~ 100 모두 더하기
		
		int total = 0;
		int n = 1;
		
		while(n <= 100) {
			total += n;
			n++;
			continue;
		}
			System.out.println("합계 : " + total);
	}

}

package test0720;

public class Ex09 {

	public static void main(String[] args) {
		
		// 연습 09 (조건연산자)
		// 홀수는 "홀수", 짝수는 "짝수"
		// 힌트
		// 홀수 -> 2로 나눈 나머지가 1인 수
		// 짝수 -> 2로 나눈 나머지가 0인 수
		
		int n = 99;
		
		if(n % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}

	}

}

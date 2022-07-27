package test0720;

public class Ex10 {

	public static void main(String[] args) {
		
		// 연습 10 (조건연산자)
		// 홀수는 "홀수", 짝수는 "짝수", 3의 배수는 "3의 배수"
		// 힌트
		// 3의 배수 -> 3으로 나눈 나머지가 0인 수 (단, 0은 고려하지 않는다.)
		
		int a = 1;
		
		if(a % 3 == 0) {
			System.out.println("3의 배수");
		} else if(a % 2 == 1) {
			System.out.println("홀수");
		} else if(a % 2 == 0) {
			System.out.println("짝수");
		}
		
	}

}

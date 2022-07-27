package test0720;

public class Ex16 {

	public static void main(String[] args) {
		
		// 연습 17 (switch)
		// switch문 이용해서 짝수, 홀수 나타내기
		
		int n = 5;
		
		switch(n % 2) {
		case 0: System.out.println("짝수"); break;
		default: System.out.println("홀수");
		}

	}

}

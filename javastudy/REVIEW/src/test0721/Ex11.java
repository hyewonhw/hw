package test0721;

public class Ex11 {

	public static void main(String[] args) {
		
		// 연습 11 (neated_for)
		// 구구단 출력
		// 2x1=2
		// 2x2=4
		// ...
		// 9x9=81
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.println(dan + "X" + n + "=" + (dan*n));
			}
		}

	}

}

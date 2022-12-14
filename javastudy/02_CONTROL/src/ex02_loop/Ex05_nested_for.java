package ex02_loop;

public class Ex05_nested_for {

	public static void main(String[] args) {
		
		// 1일차 1교시
		// 1일차 2교시
		// ...
		// 1일차 8교시
		// 2일차 1교시
		// ...
		// 3일차 8교시

		for(int day = 1; day <= 3; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차" + hour + "교시");
			}
		}
		
		// 연습 01
		// 2x1=2
		// 2x2=4
		// ...
		// 9x9=81
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.println(dan + "X" + n + "=" + (dan * n));
			}
		}
		
		// 연습 02
		// 2x1=2
		// 2x2=4
		// ...
		// 5x5=25
		
		for(int dan = 2; dan <= 5; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.println(dan + "X" + n + "=" + (dan * n));
				if(dan == 5 && n == 5) {
					break;
				}
			}
		}
		
		// 연습 03 (label을 이용한 풀이)
		// 연습 02 변형문제
		// 9x9=81까지 나오는 구구단에서 5x5=25까지만 출력되게
		
		outer: for(int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.println(dan + "X" + n + "=" + (dan * n));
				if(dan == 5 && n == 5) {
					break outer;
				}
			}
		}
		
		
		// 연습 04 (가로로 출력)
		// 2x1=2	3x1=3  ...  9x1=9
		// 2x2=4    3x2=6  ...  9x2=18
		// ...
		
		for(int n = 1; n <= 9; n++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "X" + n + "=" + (dan * n) + "\t");
			}
			System.out.println();
		}
		
		
		
		//내가 쓴 답
		// for(int n = 1; n <= 9; n++) {
		//		if(n == 9) {
		//			System.out.println();
		//		}
		//		for(int dan = 2; dan <= 9; dan++) {
		//			System.out.print(dan + "X" + n + "=" + (dan * n) + "\t");
		//			if(n == 9) { 
		//				System.out.println();
		//			}
		//		}
		// }
		
		
	}

}

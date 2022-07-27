package test0721;

public class Ex13 {

	public static void main(String[] args) {
		
		// 연습 13 (label을 이용한 풀이)
		// 연습 12 변형문제
		// 9X9=81까지 나오는 구구단에서 5X5=25까지만 출력되게
		
		outer: for(int dan = 2; dan <=9; dan++) {
				for(int n = 1; n <= 9; n++) {
					System.out.println(dan + "X" + n + "=" + (dan * n));
					if(dan == 5 && n == 5) {
						break outer;
					}
				}
		}
		
		
		
		
	}

}

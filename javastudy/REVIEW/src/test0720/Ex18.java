package test0720;

public class Ex18 {

	public static void main(String[] args) {
		
		// 연습18 (switch)
		// 분기 출력하기
		// 1 ~ 3월   : 1분기
		// 4 ~ 6월   : 2분기
		// 7 ~ 9월   : 3분기
		// 10 ~ 12월 : 4분기

		int m = 12;
		
		switch((m - 1) / 3) {
		case 0: System.out.println("1분기"); break;
		case 1: System.out.println("2분기"); break;
		case 2: System.out.println("3분기"); break;
		case 3: System.out.println("4분기"); break;
		}
	}

}

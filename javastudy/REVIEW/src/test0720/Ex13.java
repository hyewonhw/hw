package test0720;

public class Ex13 {

	public static void main(String[] args) {
		
		// 연습 13
		// 월에 따른 계절 출력
		// 봄  : 3 ~ 5
		// 여름 : 6 ~ 8
		// 가을 : 9 ~ 11
		// 겨울 : 12, 1 ~ 2
		// 잘못된 월 : 그외
		
		int month = 2;
		
		if(month < 1 || month >12) {
			System.out.println("잘못된 월");
		} else if (month == 12 || month <= 2) {
			System.out.println("겨울");
		}else if (month <= 5) {
			System.out.println("봄");
		} else if (month <= 8) {
			System.out.println("여름");	
		} else if (month <= 11) {
			System.out.println("가을");	
		}
		
	}

}

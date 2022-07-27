package test0721;

public class Ex16 {

	public static void main(String[] args) {
		
		// 연습 16 (Math.random())
		// 주사위 2개 던지기
		
		for(int n = 0; n < 2; n++) {
			int dice = (int)(Math.random() * 6) + 1;
			System.out.println("주사위" + dice);
		}
		

	}

}

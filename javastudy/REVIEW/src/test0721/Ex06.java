package test0721;

public class Ex06 {

	public static void main(String[] args) {
		
		// 연습 06 (for문)
		// 평점 (1 ~5)에 따른 별 (★) 출력하기

		int point = 4;
		String star = "";
		for(int n = 0; n < point; n++) {
			star += "★";
		}
		System.out.println(star);
		
	}

}

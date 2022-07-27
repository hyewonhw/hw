package test0721;

public class Ex17 {

	public static void main(String[] args) {
		
		// 연습 17 (Math.random())
		// 6자리 숫자 인증번호 만들기
		// String code = "123456" 이런식으로 출력되게
		
		String code = "";
		for(int n = 0; n <= 5; n++) {
			code += (int)(Math.random() * 10);
		}
		System.out.println(code);
		
	}

}

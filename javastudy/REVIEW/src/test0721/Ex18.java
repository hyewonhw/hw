package test0721;

public class Ex18 {

	public static void main(String[] args) {
		
		// 연습 18 (Math.random() + 유니코드)
		// 6자리 영문(대문자 + 소문자) 인증번호 만들기
		
		String code = "";
		for(int n = 0; n < 6; n++) {
			if(Math.random() < 0.5) {
				code += (char)((int)(Math.random() * 26) + 'A');
			} else {
				code += (char)((int)(Math.random() * 26) + 'a');
			}
		}
		
		
		System.out.println(code);
		
	}

}

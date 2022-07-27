package test0725;

public class Ex03 {

	public static void main(String[] args) {
		
		// 연습 03 
		// 대문자 6자리로 구성된 인증코드 작성하기
		StringBuilder sbCode = new StringBuilder();
		for(int n = 0; n < 6; n++) {
			sbCode.append((char)((int)(Math.random() * 26) + 'A'));
		}
		
		String code = sbCode.toString();
		System.out.println("인증코드 : " + code);

	}

}

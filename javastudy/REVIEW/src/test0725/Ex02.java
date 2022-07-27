package test0725;

public class Ex02 {

	public static void main(String[] args) {
		
		// 연습 02
		// 문자열 "abc12345def67890ghijk" 에서
		// 아라비아숫자 1234567890을 제외하고 한 글자씩 화면에 출력하시오.
		
		String str = "abc12345def67890ghijk";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				continue;
			}
			
			System.out.println(ch);
			
		}
		
		
		

	}

}

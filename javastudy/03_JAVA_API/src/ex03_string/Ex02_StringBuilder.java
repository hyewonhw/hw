package ex03_string;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder 클래스

		StringBuilder sb = new StringBuilder();
		sb.append(1); // 중요
		sb.append(true);
		sb.append('T');
		sb.append(3.14);
		sb.append("hello");
		// append = 추가
		
		System.out.println(sb);
		// 연결밖에 안함 +
		
		// hello가 포함되었는가?
		// sb.contains("hello");  // 실행 안됨
		
		// 첫 번째 글자 가져오기
		// sb.charAt(1);
		// sb.substring(0,1);
		
		// 동등 비교
		System.out.println(sb.equals("1trueT3.14hello"));
		
		// StringBuilder로 만든 문자열은 반드시 마지막에 String으로 변환해야 함
		String result = sb.toString(); // 중요
		System.out.println(result);
		System.out.println(result.equals("1trueT3.14hello"));
		
		
		// String과 StringBuilder의 성능 테스트
		// abcdefghijklmnopqrstuvwxyz
		// StringBuilder가 더 빠르다.
		
		String alphabet1 = "";
		long begin1 = System.nanoTime();
		for(char ch = 'a'; ch <= 'z'; ch++) {
			alphabet1 += ch;
		}
		long end1 = System.nanoTime();
		System.out.println((end1 - begin1) + alphabet1);
		
		
		StringBuilder sb2 = new StringBuilder();
		long begin2 = System.nanoTime();
		for(char ch = 'a'; ch <= 'z'; ch++) {
			sb2.append(ch);
		}
		long end2 = System.nanoTime();
		String alphabet2 = sb2.toString();
		System.out.println((end2 - begin2) + alphabet2);
		
		
		
		// 연습 03 . 대문자 6자리로 구성된 인증코드 작성하기
		StringBuilder sbCode = new StringBuilder();
		
		for(int n = 0; n<6; n++) {
			sbCode.append((char)((int)(Math.random() * 26) + 'A'));
		}

		String code = sbCode.toString();
		System.out.println("인증코드 : " + code);
		
		
		
		
		// 연습 04 . 1 2 3 4 5 6 7 8 9 10 만들기
		StringBuilder sbPaging = new StringBuilder();
		
		for(int n = 1; n <= 10; n++) {
			sbPaging.append(n+ " ");
		}
		
		String paging = sbPaging.toString();
		System.out.println(paging);
		
	
		/*
		 * 내가 쓴 답
		 *sbPaging.append(1);
		 *sbPaging.append(2);
		 *sbPaging.append(3);
		 *sbPaging.append(4);
		 *sbPaging.append(5);
		 *sbPaging.append(7);
		 *sbPaging.append(8);
		 *sbPaging.append(9);
		 *sbPaging.append(10);
		 *System.out.println(sbPaging);
		 *
		 */
		
		/*
		 * 내가 쓴 답
		 * for(char ch1 = '1'; ch1 <= '10'; ch1++) {
		 * 		sb.append(ch1);
		 * }
		 * 
		 */

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package test0725;

public class Ex04 {

	public static void main(String[] args) {
		
		// 연습 04 
		// 1 2 3 4 5 6 7 8 9 10 만들기
		StringBuilder sbPaging = new StringBuilder();
		for(int n = 1; n <= 10; n++) {
			sbPaging.append(n + " ");
		}
		
		String paging = sbPaging.toString();
		System.out.println(paging);

	}

}

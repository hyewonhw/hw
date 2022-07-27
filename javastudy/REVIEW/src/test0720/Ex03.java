package test0720;

public class Ex03 {

	public static void main(String[] args) {
		
		// 연습 03
		// 90초를 1분 30초로 나눠보기
		
		int sec = 90;
		int m = sec / 60;
		int s = sec % 60;
		
		System.out.println(m + "분 " + s + "초");

	}

}

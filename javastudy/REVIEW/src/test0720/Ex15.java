package test0720;

public class Ex15 {

	public static void main(String[] args) {
		
		// 연습 15
		// 오직 일 수만 고려
		// 1일이 금요일이다. 
		// n일 후 무슨 요일인지 출력하기.
		// 힌트
		// 7로 나눈 나머지값을 계산해보면 금1 토2 일3 월4 화5 수6 목0
		
		int day = 1;
		int n = 2;
		
		String weekName; 

		day += n;
		
		if(day % 7 == 0) {
			weekName = "목";
		} else if(day % 7 == 1) {
			weekName = "금";
		} else if(day % 7 == 2) {
			weekName = "토";
		} else if(day % 7 == 3) {
			weekName = "일";
		} else if(day % 7 == 4) {
			weekName = "월";
		} else if(day % 7 == 5) {
			weekName = "화";
		} else {
			weekName = "수";
		}
			
		System.out.println(weekName + "요일");
		
		
			
	}

}

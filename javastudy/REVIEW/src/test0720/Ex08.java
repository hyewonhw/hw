package test0720;

public class Ex08 {

	public static void main(String[] args) {
		
		// 연습 08 (조건연산자)
		// 순위가 1이면 "금메달", 순위가 2이면 "은메달", 순위가 3이면 "동메달"
		// 나머지 순위는 "없음"

		int rank = 2;
		String medal;
		
		if(rank == 1) {
			medal = "금메달";
		} else if(rank == 2) {
			medal = "은메달";
		} else if(rank == 3) {
			medal = "동메달";
		} else {
			medal = "없음";
		}
		
		System.out.println(medal);
		
	}

}

package test0720;

public class Ex17 {

	public static void main(String[] args) {
		
		// 연습 16 (switch)
		// 각 층별 관리자를 출력
		// 1 ~ 2층 : 전지현
		// 3 ~ 4층 : 한지민
		// 5 ~ 6층 : 박은빈
		// 나머지  : 박보검
		
		int floor = 15;
		String manager;
		
		switch(floor) {
		case 1:
		case 2: manager = "전지현"; break;
		case 3:
		case 4: manager = "한지민"; break;
		case 5:
		case 6: manager = "박은빈"; break;
		default: manager = "박보검";
		}

		System.out.println(floor + "층 관리자는 " + manager + "입니다.");
		
	}

}

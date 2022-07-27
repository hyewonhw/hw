package test0720;

public class Ex11 {

	public static void main(String[] args) {
		
		// 연습 11 (조건연산자)
		// 주민등록번호 뒷 7자리 중 첫 번째 숫자가 1,3,5이면 "남자", 2,4,6이면 "여자"
		
		int serial = 1234567;
		
		int n = serial / 1000000;
		
		switch(n) {
		case 1: 
		case 3:
		case 5: System.out.println("남자"); break;
		case 2:
		case 4: 
		case 6: System.out.println("여자"); break;	
		default : System.out.println("X");
		}

	}

}

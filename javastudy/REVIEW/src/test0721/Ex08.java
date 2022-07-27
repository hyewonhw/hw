package test0721;

public class Ex08 {

	public static void main(String[] args) {
		
		// 연습 08 (break문)
		// 모금목표 : 100000원
		// 한 번에 30원씩 모금
		// 1회 모금 : 30원		현재 : 30원
		// 2회 모금 : 30원		현재 : 60원
		// ...
		
		int goal = 100000;
		int total = 0;
		int money = 30;
		int n = 0;
		
		while(true) {
			
			if(total >= goal) {
				break;
			}
			
			total += money;
			n++;
			System.out.println(n + "회 모금 : " + money + "원" + "\t현재 : " + total + "원");
			
		}
		
		

	}

}

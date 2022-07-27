package test0721;

public class Ex07 {

	public static void main(String[] args) {
		
		// 연습 07 (while문)
		// 통장잔액 79350원 
		// 특정금액 450원씩 계속 빠져나감
		// 이때 최종 잔액

		int balance = 79350;
		int money = 450;
		while(balance >= 450) {
			System.out.println("잔액 : " + balance + "인출액 : " + money);
			balance -= money;
		}
		System.out.println("총 잔액 : " + balance);
		
	}

}

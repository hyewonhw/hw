package test0720;

public class Ex05 {

	public static void main(String[] args) {
		
		// 연습 05 (복합 대입 연산자)
		// 통장잔액(balance)에서 이자 5%를 받았음을 나타내자
		// 통장잔액 10000원
		
		long balance = 10000;
		balance *= 1.05;
		
		System.out.println(balance);
		
		// balance = balance * 1.05; 
		// -> balance는 long, 결과값은 double이기 때문에 balance에 저장 불가.
		// long을 강제캐스팅해야 저장 가능. 
		// balance = (long)(balance * 1.05);
		// -> balance * 1.05 를 먼저 계산하라고 묶고 결과를 long으로 강제캐스팅해야함
		
		// balance = balance + balance * 0.05;
		// -> 마찬가지로 결과값이 double이기 때문에 long인 balance에 저장 불가.
		
		// balance = balance + (long)(balance * 0.05);
		// -> long으로 강제 캐스팅해서 저장  
		
	}

}

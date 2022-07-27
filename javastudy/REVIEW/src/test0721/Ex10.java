package test0721;

public class Ex10 {

	public static void main(String[] args) {
		
		// 연습 10 (continue)
		// 1 ~ 100 중에서 3의 배수를 제외하고 모두 더하기
		
		int total = 0;
		int n = 0;
		
		while(n < 100) {
			
			n++;
			
			if(n % 3 ==0) {
				continue;
			}
			total += n;
	
		}
		
		System.out.println(total);
		
		

	}

}

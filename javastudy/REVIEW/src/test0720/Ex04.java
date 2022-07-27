package test0720;

public class Ex04 {

	public static void main(String[] args) {
		
		// 연습 04
		// x에 10이 있고, y에 20이 있다.
		// x와 y에 저장된 값을 서로 교환하시오.
		
		int x = 10;
		int y = 20;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
		
		

	}

}

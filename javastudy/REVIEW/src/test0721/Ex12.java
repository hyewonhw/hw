package test0721;

public class Ex12 {

	public static void main(String[] args) {
		
		// 연습 12 (nested_for)
		// 2x1=2
		// 2x2=4
		// ...
		// 5x5=25
		
		for(int dan = 1; dan <= 5; dan++) {
			for(int n = 1; n <=9; n++) {
				System.out.println(dan + "X" + n + "=" + (dan*n));
				if(dan == 5 && n == 5) {
					break;
				}
			}
		}
		
		
		
		
		
		
		
	}

}

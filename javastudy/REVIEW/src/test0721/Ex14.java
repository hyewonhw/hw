package test0721;

public class Ex14 {

	public static void main(String[] args) {
		
		// 연습 14 (nested_for)
		// 가로로 출력되게
		// 2X1=2	3X1=3	...	9x1 =9
		// ...
		// 2x9=18	3x9=27	...	9X9=81
		
		for(int dan = 2; dan <=9; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.print(dan + "X" + n + "=" + (dan * n) + "\t");
			}
		System.out.println();
		
		}
		
		
		
		
		
		
		
		
	}

}

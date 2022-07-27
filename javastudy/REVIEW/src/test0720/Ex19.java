package test0720;

public class Ex19 {

	public static void main(String[] args) {
		
		// 연습19 (switch)
		// 점수에 따른 학점
		// score      grade
		// 100 ~ 90    A
		// 89 ~ 80     B
		// 79 ~ 70     C
		// 69 ~ 60     D 
		// 59 ~ 0      F
		
		int score = 20;
		String grade;

		switch(score /10) {
		case 10:
		case 9: grade = "A"; break;	
		case 8: grade = "B"; break;	
		case 7: grade = "C"; break;	
		case 6: grade = "D"; break;	
		default: grade = "F";
		}
		
		System.out.println(score + "점은 " + grade + "학점입니다.");
		
	}

}

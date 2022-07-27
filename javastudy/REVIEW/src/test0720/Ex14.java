package test0720;

public class Ex14 {

	public static void main(String[] args) {
		
		// 연습 14 
		// 점수에 따른 학점
		// score      grade
		// 100 ~ 90    A
		// 89 ~ 80     B
		// 79 ~ 70     C
		// 69 ~ 60     D 
		// 59 ~ 0      F
		
		int score = 95;
		String grade;
		
		if (score < 0 || score >100) {
			grade = "X";
		} else if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "c";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("점수는 " + score + "점");
		System.out.println("학점은 " + grade + "학점");
		
	}

}

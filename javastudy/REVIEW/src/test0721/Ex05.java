package test0721;

public class Ex05 {

	public static void main(String[] args) {
		
		// 연습 05 (for문)
		// begin ~ end 모든 정수 더하기
		// begin과 end중 누가 큰지 모르는 상황
		// 출력값 5050
		// begin을 end보다 항상 작은 값으로 바꾼 뒤 begin ~ end 모두 더하기 진행
		// begin이 end보다 크다면 begin과 end를 교환

		int begin = 2;
		int end = 5;
		
		if(begin > end) {
			int temp;
			temp = begin;
			begin = end;
			end = temp;
		}
		
		int sum = 0;
		for(int n = begin; n <= end; n++) {
			sum += n;
		}

		System.out.println(sum);
		
		
		
		
		
	}

}

package quiz03;

public class Seat {
 
	// Person, Student, Alba를 모두 저장할 수 있는 타입은 Person
	// 좌석 25개
	// 1, 5, 10번 좌석 제외하고는 다 없는좌석 처리
	private Person person;		// 업캐스팅 				// 의자 하나에 사람 한명

	// Seat 생성자를 생략하면 
	// public Seat() { } -> 디폴트 생성자가 사용됨
	// new Seat()를 이용한 시트 생성이 가능함
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}

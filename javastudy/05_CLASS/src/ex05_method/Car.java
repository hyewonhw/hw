package ex05_method;

public class Car {

	// 자동차는 달리고 ,선다. 라는 것만 보고
	// 필드
	int oil;
	int speed;
	
	// 메소드
	
	// 1. 기름 넣기
	// 반환타입 : void ('반환값이 없다' 라는 뜻)
	// 메소드명 : addOil
	// 매개변수 : int o
	void addOil(int o) {
		oil += o;
		if(oil > 60) {
			oil = 60;
		}
	}
	
	// 2. 달리기
	// 반환타입 : void
	// 메소드명 : pushAccel
	// 매개변수 : X
	// 매개변수없으면 괄호 비워두면됨 
	void pushAccel() {
		if(oil == 0) {
			return;				// 반환타입이 void일때만 사용 가능
		}
		if(speed == 120) {
			oil--;
			return;
		}
		// 1번 밟을 때 마다 속도는 25씩 증가, 최대속도 120
		// 기름은 1씩 사용
		speed += 25;
		if (speed > 120) {
			speed = 120;
		}
			oil -= 1;  // 1빼는 것이기 때문에 oil--;으로 표기가능
	
	}
	// 3. 멈추기
	// 반환타입 : void
	// 메소드명 : pushbrake
	// 매개변수 : X
	void pushBrake(){
		if(speed == 0) {
			return;
		}
		speed -= 25;
		if(speed < 0) {
			speed = 0;
		}
	
		
	}	
		
	// 4. 계기판(기름, 속도) 확인
	// 반환타입 : void
	// 메소드명 : panel
	// 매개변수 : X
	void panel() {
		System.out.println("기름 " + oil);
		System.out.println("속도 " + speed);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

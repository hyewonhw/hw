package Prac_0729;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// 성공
		// 커피 메뉴를 입력받아 가격을 알려주는 프로그램을 구현하시오.(switch문)
		// 에스프레소, 카푸치노, 카페라떼 : 3500원 / 아메리카노 : 2000원
		
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 커피 드릴까요? >>>");
		String coffee = sc.next();
		int price = 0;
		
		switch(coffee) {
		case"에스프레소" :
		case"카푸치노" :
		case"카페라떼" : price = 3500; break;
		case"아메리카노" : price = 2000; break;
		default: System.out.println(coffee + "는 메뉴에 없습니다.");
		}
		if(price != 0) {
			System.out.println(coffee + "는 " + price+ "원 입니다.");
		}
		
		

	}

}

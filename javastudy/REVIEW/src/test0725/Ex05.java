package test0725;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// 연습 05
		// char 타입의 성별을 입력 받기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별(남/여)을 입력하세요 >>> ");
		char gender = sc.next().charAt(0);
		System.out.println(gender);
		
		sc.close();
	}

}

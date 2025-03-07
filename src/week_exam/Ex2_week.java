package week_exam;

import java.util.Scanner;

public class Ex2_week {
	
	public static void main(String[] args) {
		
		// 키보드에서 나이를 입력받고, 입력받은 나이가 30 이상이면 "드실만큼 드셨군요"
		// 이하면 "좀 더 드셔도 됨"을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if( age >= 30 ) {
			System.out.println("드실만큼 드셨군요");			
		}else {
			System.out.println("좀 더 드셔도 됨");
		}
		
	} // main

}

package week_exam;

import java.util.Random;

public class Ex3_week {
	public static void main(String[] args) {
		
		// 5월은 31까지 입니다.
		// 1 사이에서 12 사이 난수 발생.
		
		
		int ran = new Random().nextInt(12) + 1;
		int month = ran; // 아예 랜덤 변수를 month로 잡아두면 더 간결.
			
		switch( month ) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
			
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		}
		
		
		
		
		
	} // main

}

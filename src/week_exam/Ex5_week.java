package week_exam;

import java.util.Scanner;

public class Ex5_week {
	public static void main(String[] args) {
		
		// 키보드에서 연도를 입력하고 윤년인지, 평년인지 판단.
		// 400으로 나누어 떨어짐. (아래 조건에 부합하지 않아도 400으로 나눠떨어지면 윤년.)
		// 4로는 나누어떨어지지만, 100으로는 나눠지지 않음.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도 : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
			System.out.printf("%d년은 윤년입니다.", year);				
			
		}else {
			System.out.printf("%d년은 평년입니다.", year);
		    }
				
			
		
		
		
		
		
	} // main

}

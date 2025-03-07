package week_exam;

public class Ex6_week {
	public static void main(String[] args) {
		
		// 1부터 10까지 숫자 중에서 홀수의 합을 계산하여 출력
		// 결과 : 25
		
		int sum = 0;
		
		for(int i= 1; i <= 10; i++) {
			
			if( i % 2 != 0 ) {
				sum += i;
				
			} // if
			
		} // for
		
		System.out.println("결과 : " + sum);
		
		
		
	} // main

}

package work;

import java.util.Random;

public class Ex2_homework_lotto_check {
	public static void main(String[] args) {

		// 1 ~ 45 사이 중복되지 않는 난수를 lotto 배열에 담아 출력.
		
		// 0번 인덱스에 값 입력 후 다음 인덱스에 값을 입력할 때, 전에 자기와 같은 숫자가 있는지 확인. 다중 for문 필요.

		// 17 42 9 11 6 14

		/* int[] lotto = new int[6];		


		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = new Random().nextInt(45) + 1;
		    
			
			for(int j = 1; j < i; j++) {

				if( lotto[i] == lotto[j] ) {
					i--;
				
				} // if
				
	
			}  // inner	
			

		}	// outer
		
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
			
		} // for 2 */
		
		
		
		
		
		// 선생님 풀이
		
		int[] lotto2 = new int[6];
		
		outer:for( int i = 0 ; i < lotto2.length; ) {
			
			lotto2[i] = new Random().nextInt(6) + 1;
			System.out.print(lotto2[i] + " ");
			
			i++; // i의 증감식을 for문 안에 썼기 때문에 중복되어도 값이 증가하지 않고 기존 값 그대로 다시 중복 확인할 수 있다.
			
			// 중복 체크
			for( int j = 0; j < i; j++) {
				
				if( lotto2[i] == lotto2[j] ) {
					continue outer;
					
				} // if
				
				
			} // for inner
			
		} // for outer  
		
		
		// i = 0;  ->  랜덤으로 수를 하나 뽑아 lotto2[0]에

	 




	} // main

}

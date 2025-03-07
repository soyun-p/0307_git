package work;

import java.util.Random;

public class Ex2_homework_check {
	public static void main(String[] args) {

		// 1 ~ 45 사이 중복되지 않는 난수를 lotto 배열에 담아 출력.
		
		// 0번 인덱스에 값 입력 후 다음 인덱스에 값을 입력할 때, 전에 자기와 같은 숫자가 있는지 확인. 다중 for문 필요.

		// 17 42 9 11 6 14

		int[] lotto = new int[6];		

		int num = new Random().nextInt(45) + 1;
		


		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = num;
		    System.out.println(lotto[i]);
			

			for(int j = 1; j < i; j++) {

				if( lotto[i] == lotto[j] ) {
					i--;
				
				} // if


			}  // inner	
			
			

		}	// outer
		
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
			
		} // for 2
		
		

	




	} // main

}

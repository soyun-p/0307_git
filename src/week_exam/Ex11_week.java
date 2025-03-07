package week_exam;

import java.util.Scanner;

public class Ex11_week {
	public static void main(String[] args) {
		
		// 키보드에서 정수를 입력받고 그 숫자가 소수인지 아닌지 판별.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int n = sc.nextInt();
		
		
		for(int i = 2; i < n; i++) {
			
			if( n % i != 0 ) {
				System.out.printf("%d은(는) 소수입니다.\n", n);
				break;
			}else {
				System.out.printf("%d은(는) 소수가 아닙니다.\n", n);
				break;
				
			} // if-else
		
		}  //for
		
		
		
		
		/* 선생님 풀이
		 int i = 0;
		 
		 for( i = 2; i <= n; i++ ) {
		 
		     if( n % i == 0 ) {
		         break;
		     }  // if
		 
		 }  // for
		 
		 if( i == n ) {
		     System.out.println(n + "은 소수");
		 }else {
		     System.out.println(n + "은 안소수");
		 }
		  
		 */
		
	} // main

}

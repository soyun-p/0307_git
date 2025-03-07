package week_exam;

import java.util.Scanner;

public class Ex10_week {
	public static void main(String[] args) {
		
		// 키보드에서 정수 두 개를 입력 받고, 입력받은 수1 ~ 수2까지의 합을 계산하여 출력
		
		// 수1 : 2
		// 수2 : 5
		// 결과 : 14
		
		// 수1 : 5
		// 수2 : 2
		// 결과 : 14
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int n2 = sc.nextInt();            // 입력
		
		
		int n3 = 0;  // n3의 초기화는 if문 내에 만들어도 가능.
		
		if( n1 > n2 ) {
			n3 = n2;
			n2 = n1;
			n1 = n3;	
		} // if                   // if 
		
		
		int sum = 0;
		
		for(int i = n1; i <= n2; i++) {			
			sum += i;						
		} // for                      // for
		
		System.out.printf("결과 : %d\n", sum);  // 출력
		
		
	} // main

}

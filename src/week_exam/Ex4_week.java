package week_exam;

import java.util.Scanner;

public class Ex4_week {
	public static void main(String[] args) {
		
		// 키보드에서 정수 두 개와 연산자 입력받아 연산결과 출력.
		
		// 수1 : 11
		// 수2 : 50
		// 연산자 : +
		// 결과 : 61
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int n2 = sc.nextInt();
		
		System.out.println("연산자 : ");
		String op = sc.next();
		
		
		switch( op ) {
		case "+":
			System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
			break;
			
		case "-":
			System.out.printf("%d - %d = %d\n", n1, n2, n1-n2);
			break;
			
		case "x":
			System.out.printf("%d x %d = %d\n", n1, n2, n1*n2);
			break;
			
		case "/":
			System.out.printf("%d / %d = %.1f\n", n1, n2, (float)n1/n2);
			// 나누기에서 결과가 실수로 나올 수 있기 때문에 결과는 실수 타입으로 받는다.
			// 따라서 n1이나 n2 중 하나 이상은 무조건 float형으로 형변환을 해주어야 한다.
			break;
		
		} // switch
		
		
		
		
	} // main

}

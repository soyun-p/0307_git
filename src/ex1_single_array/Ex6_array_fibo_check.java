package ex1_single_array;

import java.util.Scanner;

public class Ex6_array_fibo_check {
	public static void main(String[] args) {
		
		// 피보나치 수열 (배열)	
		// 키보드에서 입력받은 횟수만큼의 결과를 보여주는 피보나치 수열
		
		// 길이 : 7
		// 1 1 2 3 5 8 13
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("길이 : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];  // 입력 받은 값만큼의 배열 길이 지정.
		
		// 초기값 지정
		if( length >= 2 ) {
			arr[0] = 1;
		    arr[1] = 1;
		} //if
		
		
		// 피보나치 수열 계산식
		for(int i = 2; i < length; i++) {
			arr[i] = arr[i-1] + arr[i-2];	
			
		} // for
		
		
		// 수열 출력
		for( int i : arr ) {
			System.out.print(i + " ");
			
		} // for 2
		
		
		
		
		
		
	} // main

}

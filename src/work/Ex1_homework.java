package work;

import java.util.Scanner;

public class Ex1_homework {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 정수가 소수(약수가 1, 자기자신 밖에 없는 것)인지 아닌지를 판단하라. (배열은 쓰지 않아도 된다.)
		
		// 입력 : 7
		// 7은(는) 소수입니다.
		
		// 입력 : 4
		// 4은(는) 소수가 아닙니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int num = sc.nextInt();
		
		for(int i = 2; i < num; i++) {
			if( num % i != 0  ) {
				System.out.println(num + "은(는) 소수입니다.");
				break;
			}else {
				System.out.println(num + "은(는) 소수가 아닙니다.");
				break;
			}	
			
			
		} // for
		
				
	}  // main

}

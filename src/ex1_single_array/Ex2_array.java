package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		
		int[] ar = new int[3];  
		//ar[0] = 100;
		//ar[1] = 200;
		//ar[2] = 300;
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (i + 1) * 100;  // 배열을 미리 값을 넣지 않고, 반복문 내에서 정해줘도 배열에 값이 넣어진다.
			System.out.println(ar[i]);
			
		} // for
		
		
		System.out.println("-------------------");
		
		
		
		// int[] numArr = new int[3];
		//numArr[0] = 30;
		//numArr[1] = 32;
		//numArr[2] = 65;
		
		// 배열의 선언 + 생성 + 초기화 를 한 번에 할 수 있다.
		int[] numArr = {30, 32, 60};  // 인덱스 0번부터 채워짐.
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
			
		}
		
		
		
		
	} // main

}

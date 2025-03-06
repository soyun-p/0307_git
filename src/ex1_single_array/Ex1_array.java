package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		// single array(단일 배열) : 배열은 '같은 자료형끼리 모아둔 묶음'이다.
		// 효율적인 자료 관리를 위해 '반드시' 알아둬야 한다.
		
		int n1 = 100;
		int n2 = 200;
		int n3 = 300;
		int n4 = 400;     // 너무 번거로움
		
		
		// 1) 배열 선언
		int[] arr; // 1차원 배열 선언
		
		// 2) 배열 생성	
		arr = new int[5];  // [] 안의 숫자는 배열의 길이, 방 갯수를 뜻한다.
		
		// stack 메모리  vs   heap 메모리
		// n1, n2, arr(-> 힙메모리에 생성된 int 값만 저장할 수 있는 공간의 주소 참조)    100, 200, 300, 400
		
		// 3) 초기화
		arr[0] = 100;  // 배열의 인덱스 번호는 0부터 시작한다.
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		for(int i = 0; i < arr.length; i++) {  // arr.length : arr의 방 갯수
			System.out.println( arr[i] );  
			// i-> 0~3일 때는 for문이 4회전 밖에 못하고, 배열 생성에 4개만 생성했기 때문에 arr[4]를 추가해도 출력되지 않는다.
			// 따라서 i의 범위를 arr.length(arr의 범위, 방 갯수)로 바꿔줘야 한다.
			// 배열을 생성할 때 지정한 방 갯수와 달리, 없는 방으로 접근하려고 하면 오류가 난다.
			
			// i=0 : arr[0] = 100
			// i=1 : arr[1] = 200 ......
			
			
		} // for
		
		
		
		
		
		
	} // main

}

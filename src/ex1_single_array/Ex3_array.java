package ex1_single_array;

public class Ex3_array {
	public static void main(String[] args) {
		
		int[] arr = new int[3];  // int 타입 맞춰줘야 한다.
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		
		// arr[3] = 13;  :  배열의 존재하지 않는 인덱스에 접근하는 것은 불가능.
		
		/* if( i == 0 )
			System.out.println( arr[i] );  */
		
		for(int i = 0; i < arr.length; i++) {	// arr.length : 배열의 범위. 중요!	
			System.out.println(arr[i]);			
		
		} // for
		
		System.out.println("--------------------------");
		
		// 개선된 루프(향상된 for문) : 하나도 빠짐없이 배열을 출력할 때 유용. 전체를 다 출력하는 경우에만 사용.  
		// 편리하지만, 배열의 각 인덱스에 대한 제어가 불가
		for( int num : arr ) {  // arr의 범위를 한 번에 
			System.out.println(num);
			
		}
		
		
		
		
	} // main

}

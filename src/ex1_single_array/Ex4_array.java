package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4]; // 선언 = 생성
		ch[0] ='J';
		ch[1] ='A';
		ch[2] ='V';
		ch[3] ='A';              // 초기화
		// ch[4] ='!';
		
		// 배열의 선언, 생성, 초기화를 한 번에
		
		char[] ch2 = { 'J', 'A', 'V', 'A'};
		for(int i= 0; i < ch2.length; i++) { 
			System.out.print(ch2[i]);
		} // for : JAVA 출력
		
		System.out.println();
		System.out.println("-----------------");
		
		for( char c : ch2) {  // 개선된 루프 방식. 더 간결
			System.out.print(c);		
			
		} // for
		
	} // main

}

package week_exam;

public class Ex9_week {
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
	    // .....
		// 10 1 2 3 4 5 6 7 8 9
		
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = i; j < 10 + i; j++) {
				
				if( j > 10 ) {
					System.out.printf("%d ", j-10);
					
				}else{
					System.out.printf("%d ", j);
				} //if
				
			} // inner
			
			System.out.println();
			
		}// outer
		
		
		
	} // main

}

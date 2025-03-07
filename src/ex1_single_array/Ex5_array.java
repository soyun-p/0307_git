package ex1_single_array;

public class Ex5_array {
	public static void main(String[] args) {
		
		//배열 nArr에 담긴 모든 값의 합을 출력
		int[] nArr = {11, 7, 21, 14, 9};
		int sum = 0;
		
		for(int i : nArr) { 
			
			sum += i;
						
		} // for
		
		System.out.println(sum);
		
		
		
		// 아래와 같이 코딩하려면, i의 범위를 신경써야 한다.
		// i의 범위가 nArr.length일 때는 nArr 배열의 개수가 i값이 된다.  ... 1
		// 그러나 개선된 루프 방식으로 할 때에는 i값이 배열 안의 원소 값이 i값이 된다.  ... 2
		// 따라서 1번 방식으로 할 때에는 계산식에 인덱스를 명시해 줘야 하고, 2번 방식은 인덱스 형식으로 명시할 필요가 없다.
		// for(int i = 0; i < nArr.length; i++) {
		//   sum += nArr[i];
		// }
		
		
		
	} // main
}

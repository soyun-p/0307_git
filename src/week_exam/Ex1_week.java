package week_exam;

public class Ex1_week {
	public static void main(String[] args) {
		
		// 과수원에서 생산되는 배, 사과, 오렌지를 키운다. 하루 생산되는 양은 각각 5, 7, 5개.
		// 하루 생산되는 과일의 총 갯수, 시간당 전체 과일의 평균 생산 갯수 출력
		// 단, 과일의 평균값 변수는 float 타입
		
		int peer = 5;
		int apple = 7;
		int orange = 5;
		
		int total = peer + apple + orange;
		float avg = total / 24F;
		
		System.out.printf("하루 생산되는 과일의 총 갯수 : %d\n", total);
		System.out.printf("시간당 전체 과일의 평균 생산 갯수 : %.1f\n", avg);
		
		
		
		
	} // main

}

package variable.exam01_220328;

public class Variable {

	/*
	 * 실습문제 1.
	 * 영화관의 요금 표는 다음과 같습니다.
	 *  	- 성인 : 10000원
	 *  	- 청소년 : 7000원
	 * 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	 * 
	 * 예시)
	 * <영수증>
	 * 성인 2명 : 20000원
	 * 청소년 3명 : 21000원
	 * 총 금액 : 41000원
	 * 
	 */
	public void practice1() {
		int adult = 10000;
		int aNum = 2;
		int teenager = 7000;
		int tNum = 3;
		
		System.out.println("<영수증>");
		System.out.println("성인 " + aNum +"명 : " + (adult * aNum) + "원");
		System.out.println("청소년 " + tNum +"명 : " + (teenager * tNum) + "원");
		System.out.println("총 금액 : " + ((adult * aNum) + (teenager * tNum)) + "원");
		
	}
	
	/*
	 * 실습문제 2.
	 * 문인수는 국어 점수 60점 / 영어 점수 70점 / 수학 점수 66점을 받았다.
	 * 이 학생의 총점과 평균을 출력하세요.
	 * 
	 * 예시)
	 * 국어 점수 : 60점
	 * 영어 점수 : 70점
	 * 수학 점수 : 66점
	 * 
	 * 총점 : 196점
	 * 평균 : 65.33점
	 */
	public void practice2() {
		double korean = 60;
		double english = 70;
		double math = 66;
		double avg = (korean + english + math)/3;
		
		System.out.println("국어 점수 : " + korean + "점");
		System.out.println("영어 점수 : " + english + "점");
		System.out.println("수학 점수 : " + math + "점");
		System.out.println();
		System.out.println("총점 : " + (korean + english + math) + "점");
		System.out.println("평균 : " + String.format("%.2f", avg) + "점");
	}
}

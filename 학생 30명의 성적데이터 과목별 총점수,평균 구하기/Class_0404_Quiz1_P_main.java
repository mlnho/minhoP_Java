import java.util.Scanner;

public class Class_0404_Quiz1_P_main {
	public static void main(String[] args) {

		//학생 배열만들기 + 클래스를 받아서 배열에 객체를 담는다.
		Class_0404_Quiz1_P [] student = new Class_0404_Quiz1_P[30];
		
		
		// 데이터 입력 
		for (int i = 0; i < student.length; i++) {
			//객체 생성하기
			student[i] = new Class_0404_Quiz1_P(); //배열 i마다 객체를 담는다.
			// 데이터 입력
			student[i].inputData();
		}
	
	
		// 계산
		int korTotal = 0, engTotal = 0, mathTotal = 0; //각 과목의 총 점수
		for(int i = 0; i<student.length; i++) {
			//각 i번째 학생마다의 점수들을 축적한다.
			korTotal = korTotal + student[i].kor; 
			engTotal = engTotal + student[i].eng;
			mathTotal= mathTotal + student[i].math;
		}
	
		//출력
		System.out.println("국어 점수 총점 : " + korTotal + ", 평균 : " + (korTotal / (double)student.length));
		System.out.println("영어 점수 총점 : " + engTotal + ", 평균 : " + (engTotal / (double)student.length));
		System.out.println("수학 점수 총점 : " + mathTotal + ", 평균 : " + (mathTotal / (double)student.length));
	
	}
}

// 1. 객체 데이터 사용
// 2. 학생 30명의 성적 데이터를 입력 받아서 (국어,영어,수학) 각 과목별 총점과 평균을 출력하세요.

import java.util.Scanner;

public class Class_0404_Quiz1_main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//배열로 학생이름 국어점수 영어 수학 배정받기 + student변수에 클래스를 넣어줬다.
		Class_0404_Quiz1[] student = new Class_0404_Quiz1[30];


//학생의 이름 데이터 받기		
		for (int i = 0; i < 30; i++) {
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요.");
			String inputNameString = scanner.nextLine();
			student[i].name = inputNameString;
		}
// 학생의 국어 영어 수학 점수 받기.
			for (int j = 0; j < 29; j++) {
				System.out.println(student[j] + "의 국어점수, 수학점수, 영어점수를 차례대로 입력해주세요.");

				String inputKorString = scanner.nextLine(); // 국어점수 받기
				student[j].kor = Integer.parseInt(inputKorString);
				String inputEngString = scanner.nextLine(); // 영어점수 받기
				student[j].eng = Integer.parseInt(inputEngString);
				String inputMathString = scanner.nextLine(); // 수학점수 받기
				student[j].math = Integer.parseInt(inputMathString);
				
				int sum = student[j].kor +  student[j].eng + student[j].math;
				
				System.out.println(student[j] + "의 총점은 :" + sum + " 평균 값은 : " + (sum/3));
				break;
			}
		}

	}


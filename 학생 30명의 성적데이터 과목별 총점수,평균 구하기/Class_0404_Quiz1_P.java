import java.util.Scanner;

public class Class_0404_Quiz1_P {
	String name;
	int kor;
	int eng;
	int math;

//데이터 입력
	public void inputData() {
		this.inputName();
		this.inputKor();
		this.inputEng();
		this.inputMath();
	}
	public void inputName() {   
		System.out.println("이름을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();

	}

//데이터 입력에 들어가는 국영수 점수 추출하는 메소드들
	public void inputKor() {
		System.out.println("국어 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.kor = Integer.parseInt(inputString);

	}

	public void inputEng() {
		System.out.println("영어 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.eng = Integer.parseInt(inputString);

	}

	public void inputMath() {
		System.out.println("수학 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.math = Integer.parseInt(inputString);

	}

}

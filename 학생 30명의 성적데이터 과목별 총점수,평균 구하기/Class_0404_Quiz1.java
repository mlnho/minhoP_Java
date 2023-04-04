import java.util.Scanner;

public class Class_0404_Quiz1 {
	String name; //이름
	int kor;	//국어
	int eng;	//영어
	int math;	//수학

	public void inputData() { //데이터를 넣을것이다. 아래 매소드들이 차례대로 실행할 것이다. 
		this.inputName();
		this.inputKor();
		this.inputEng();
		this.inputMath();
	}

	
//학생 이름 매소드
	public void inputName() {    
		System.out.println("이름을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();	
	
	}

	
//국어점수 입력 매소드
	public void inputKor() {
		System.out.println("국어 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.kor = Integer.parseInt(inputString);
		
	}
//영어점수 입력 매소드
	public void inputEng() {
		System.out.println("영어 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.kor = Integer.parseInt(inputString);
		
	}
	
//수학점수 입력 매소드	
	public void inputMath() {
		System.out.println("수학 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		this.kor = Integer.parseInt(inputString);
		
	}
	
	
	
	
	
	
}

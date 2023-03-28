import java.util.Arrays;
import java.util.Scanner;

// 2차원 배열
//사용자에게 9개의 숫자를 받아서 33 이중 배열만들고
// 각행의 덧셈합을 출력하기
public class Arrays_2Dimensional {
	public static void main(String[] args) {

		// 2차배열 생성, 빈값보다는 일단 초기값을 생성해주는 것이 좋다!
		int[][] numbers = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		// 반복문을 통해 배열에 사용자로부터 값을 입력 받아서 넣기
		Scanner scanner = new Scanner(System.in);

		// 3까지 한 이유는 3번째 인덱스애는 배열의 합값이 들어갈 예정이다.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers[i][j] = scanner.nextInt();
				System.out.println("값을 입력해주세요.");
				System.out.println(Arrays.deepToString(numbers));
			}
		}
		// numbers[0][3] = numbers[0][0] + numbers[0][1] + numbers[0][2] -> 행의 덧셈값
		// numbers[3][0] = numbers[3][0] + numbers[3][1] + numbers[3][2] -> 열의 덧셈 값
		// numbers[3][3] = numbers[3][0] + numbers[3][1] + numbers[3][2] -> 마지막 열의 값
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers[i][3] = numbers[i][3] + numbers[i][j];
				numbers[3][j] = numbers[3][j] + numbers[i][j];
			}
		}
		System.out.println(Arrays.deepToString(numbers));

		
		//출력하는 부분
		for (int i = 0; i < numbers.length; i++) { //행의 길이 즉 앞서 만든 배열의 총 대가로안!
			for (int j = 0; j < numbers[0].length; j++) { // 앞서 만든 배열의 하나하나의 길이를 잡는다.
				System.out.printf("%4d", numbers[i][j]); //"%4d" -> 4칸에 맞춰서 출력을한다!
			}
			System.out.println();
		}
		
	}
}

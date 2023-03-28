import java.util.Arrays;
import java.util.Random;

//100까지의 임의의 수를 30개 발생시켜서 배열로 만들기

public class bubbleSort {
	public static void main(String[] args) {

		// Random클래스 생성
		Random random = new Random();

		// 배열만들기-30개 담을 것이다.
		int[] number = new int[30];

		// 반복문을 사용해서 1~100까지의 임의의 값을 앞서 만든 배열에 담을 것이다
		for (int i = 0 + 1; i < number.length; i++) {
			number[i] = random.nextInt(100) + 1; // 1~100까지의 임의의 수 담기

		}
		System.out.println(Arrays.toString(number)); // 배열 잘 넣은 거 확인완료
//		System.out.println(number.length); //30개확인완료

		// selection sort
		// 앞서 만든 배열의 값에서 이제 배열 앞뒤로 크기를 비교하며 오름차순으로 만들 예정이다.
		for (int i = 0; i < number.length; i++) { //배열의 길이만큼 돌린다/
			for (int j = 0; j < number.length - 1; j++) {
				if (number[j] > number[j + 1]) {
					int tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
					System.out.println(i +"회차" + Arrays.toString(number));
				}
			}
		} System.out.println(Arrays.toString(number));
		

	}
}

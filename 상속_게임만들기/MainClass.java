import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("안녕하십니까 게임에 오신걸 환영합니다!");
		Thread.sleep(2000);
		System.out.println("게임을 시작하겠다면 Y를 눌러주시고 아니라면 N을 눌러주세요");
		String yN = scanner.nextLine();
		Base[] poketMon = { new Elec(), new Kkobuk(), new Firy(), new Windy(), new JJangdol() };
		System.out.println("포켓몬의 현황상태입니다.");
		for (int i = 0; i < poketMon.length; i++) {

			poketMon[i].ad();
		}
		Thread.sleep(3000);

		System.out.println("대전을 할 포켓몬 2마리를 랜덤 추첨하겠습니다.");

		int pocket1 = random.nextInt(5);
		System.out.println("첫번째 포켓몬은 " + poketMon[pocket1].name + "입니다.");
		Thread.sleep(1500);

		int pocket2 = 0;
		for (int i = 0; i < 9999; i++) {

			pocket2 = random.nextInt(5);
			if (pocket1 != pocket2) {
				break;
			}
		}
		System.out.println("두번째 포켓몬은 " + poketMon[pocket2].name + "입니다.");
		Thread.sleep(1500);

		boolean flag = true;

		System.out.println("대전을 시작하겠습니다.");
		Thread.sleep(1500);
		for (int i = 0; i < 9999; i++) {

			if (flag == true) {
				System.out.println(poketMon[pocket1].name + "의 공격입니다.");
				Thread.sleep(1000);
				int x = poketMon[pocket1].attack1();
				System.out.println(x);
				System.out.println(poketMon[pocket2].name + "에게 " + x + "의 데미지를 입혔습니다.");
				Thread.sleep(1000);
				poketMon[pocket2].underAttack(x);
				if (poketMon[pocket2].hp > 0) {
					System.out.println(poketMon[pocket2].name + "의 체력은 " + poketMon[pocket2].hp);
				}
				Thread.sleep(1000);
				flag = false;
			} else {
				System.out.println(poketMon[pocket2].name + "의 공격입니다.");
				Thread.sleep(1000);
				int y = poketMon[pocket2].attack1();
				System.out.println(poketMon[pocket1].name + "에게 " + y + "의 데미지를 입혔습니다.");
				Thread.sleep(1000);
				poketMon[pocket1].underAttack(y);
				if (poketMon[pocket1].hp > 0) {
					System.out.println(poketMon[pocket1].name + "의 체력은 " + poketMon[pocket1].hp);
				}
				flag = true;
				Thread.sleep(1000);
			}

			if (!poketMon[pocket2].isLive()) {
				System.out.println(poketMon[pocket2]);
				System.out.println(poketMon[pocket1].name + "is win");
				Thread.sleep(2000);
				break;
			} else if (!poketMon[pocket1].isLive()) {
				System.out.println(poketMon[pocket1]);
				System.out.println(poketMon[pocket2].name + "is win");
				Thread.sleep(2000);
				break;
			}
		}

	}
}
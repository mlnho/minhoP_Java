import java.util.Random;

public class Firy extends Base{
	   Random random = new Random();

	Firy() {
		this.hp = 100;
		this.name = "파이리";
		this.power = 30;
		this.defend = 10;
	}
	
	@Override
	public int attack1() {
		
		int n = random.nextInt(10);
		if (n>3) {
			System.out.println("파이리가 리자몽으로 진화하였습니다. 리자몽~~");
			this.power = this.power * 4;
		}else {
			System.out.println("파이리가 공격을 시전하였습니다. 파이~~리");
		}
		
		return this.power;
	}

	@Override
	public void attack2() {

	}

	@Override
	public void attack3() {

	}

	@Override
	public void ad() {
		System.out
				.println(this.name + "의 체력은 " + this.hp + "이며 공격력은 " + this.power + "이며 방어력은 " + this.defend + " 입니다.");
	}

}

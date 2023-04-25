import java.util.Random;

public class Kkobuk extends Base {
	Random random = new Random();
	Kkobuk() {
		this.hp = 120;
		this.name = "꼬부기";
		this.power = 20;
		this.defend = 10;
	}

	@Override
	public int attack1() {
		int n = random.nextInt(10);
		if(n>7) {
			System.out.println("꼬부기가 연못을 만나 공격력이증가했습니다");
			this.power = this.power * 2; 
		}else if (n>5) {
			System.out.println("꼬부기가 신비의 돌을 만나 잠시 진화했습니다.");
			this.power = this.power * 3;
		}else {			
			System.out.println("꼬부기가 물을 쏘았습니다. 퐈아");
		}
		return this.power;
	}

	@Override
	public void attack2() {
		System.out.println("꼬부기가 몸통박치기를 시전하였습니다. 퍽퍽퍽");
	}

	@Override
	public void attack3() {
		System.out.println("");
		
	}

	@Override
	public void ad() {
		System.out
				.println(this.name + "의 체력은 " + this.hp + "이며 공격력은 " + this.power + "이며 방어력은 " + this.defend + " 입니다.");
	}

}

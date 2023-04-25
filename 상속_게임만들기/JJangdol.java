import java.util.Random;

public class JJangdol extends Base {
	   Random random = new Random();

	JJangdol() {
		this.hp = 300;
		this.name = "짱돌";
		this.power = 10;
		this.defend = 50;
	}
	@Override
	public int attack1() {
		
		int n= random.nextInt(10);
		if (n>5) {
			System.out.println("짱돌이 자신의 몸을 일부 던졌습니다.");
			this.power = this.power *2; 
		}else {
			System.out.println("짱돌이 공격을 시전하였습니다. 팅팅");
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

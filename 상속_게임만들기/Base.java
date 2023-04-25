
public class Base {
	int hp;
	int power;
	int defend;
 
	String name;
	
	Base () {
		this.hp = 0;
		this.name = "기본";
	}
	
	public void underAttack(int attack) {
		this.hp = this.hp - attack;
	}
	
	public void info(int power ,int defend) {
		this.power = power;
		this.defend =defend;
	}
	
	public boolean isLive() {
		if (this.hp <1) {
			return false;
		}
		return true;
	}
	
	public int attack1() {
		return 0;
	}
	
	public void attack2() {
		
	}
	
	public void attack3() {
	
	}

	@Override
	public String toString() {
		if (this.isLive()) {
			return this.name + "(" + this.hp + ")";
		}
		return this.name + "is dead";
	}
	public void ad() {
//		System.out
//				.println(this.name + "의 체력은 " + this.hp + "이며 공격력은 " + this.power + "이며 방어력은 " + this.defend + " 입니다.");
	}
}

import java.util.Random;

public class Elec extends Base {

	   Random random = new Random();

		   // 기본 값
		Elec() {
			
	      this.name = "피카츄";
	      this.hp = 150;
	      this.power=30;
	      this.defend=10;
	   }

	   @Override
	   // 공격 받을시
	   public void underAttack (int attack) {
	      this.hp = this.hp - attack;
	   }

//	   @Override
	   // 내 스텟
//	   public void info(int power, int defend) {
//	      this.power = 8;
//	      this.defend = 6;
//	   }

	   @Override
	   // 스킬 [1] - 10%확률로 공격력 2배
	   public int attack1() {
		   
		   int s = random.nextInt(10);
		   if (s ==0) {
			   System.out.println("피카츄가 지우의 버프를 받았습니다. 삐까쮸우~~~~~");
			   this.power = this.power * 10000;
		   }else {
				System.out.println("피카츄가 공격을 시전하였습니다. 삐까삐까");
			}		  

	      return this.power;
	   }

	   @Override
	   // 스킬 [2] - 
	   public void attack2() {
	      boolean chance = true;
	      int count = 8; // 스킬 가능횟수
	      if (chance = true) {
	         if (Math.random() < 0.5) {
	            this.power = 15; // 10퍼센트 확률로 공격력 2배
	            count = count - 1;
	         }
	      }

	      // 스킬횟수 0
	      if (count == 0) {
	         chance = false;
	         System.out.println("스킬을 전부 사용하셨습니다.");
	      }

	   }

	   @Override
	   // 스킬 [3] - 체력회복
	   public void attack3() {
	      this.hp = this.hp + 15;
	   }
	   
	   @Override
		public void ad() {
			System.out
					.println(this.name + "의 체력은 " + this.hp + "이며 공격력은 " + this.power + "이며 방어력은 " + this.defend + " 입니다.");
		}
}

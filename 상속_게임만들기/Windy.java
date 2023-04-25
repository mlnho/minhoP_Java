import java.util.Random;

public class Windy extends Base{
	   Random random = new Random();

	Windy() {
      this.hp = 150;
      this.name="윈드";
      this.power=50;
      this.defend=5;
   }
   
   @Override
   public int attack1() {
		int n= random.nextInt(10);
		if (n>8) {
			System.out.println("윈드가 태풍을 만나 강해졌습니다.");
			this.power = this.power *2; 
		}else {
			System.out.println("윈디가 공격을 시전하였습니다. 후~우");
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
      System.out.println(this.name+"의 체력은 "+this.hp+"이며 공격력은 "+this.power+"이며 방어력은 "+this.defend+" 입니다.");
   }
   
   
}
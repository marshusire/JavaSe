package day10.test02;

public class Penguin extends Pet{

	@Override
	public void eat() {
		// 给企鹅喂食 ，恢复健康值
		if(this.getHealth()<100){
		   System.out.println("企鹅喂食一次 增减健康值 5");
		   this.setHealth(this.getHealth()+5);
		   //判断健康值是否满足100
		   if(this.getHealth()>=100){
			   this.setHealth(100);
		   }
		}
	}
	
	
}

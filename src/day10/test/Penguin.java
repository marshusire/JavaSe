package day10.test;
//子类继承父类
public class Penguin extends Pet {
   //默认的构造方法
	 public Penguin(){}
	 public Penguin(int health){
		 this.setHealth(health);
	 }
	 //子类特有行为
	 public void swiming(){
		 System.out.println("企鹅在南极游泳"); 
	 }
	 
	 
   //重写父类看病方法
	 @Override
	public void toHospital() {
		//定义企鹅看病的方法
		 if(this.getHealth()<50){
			 System.out.println("企鹅  进行 食疗...");
			 //恢复健康值
			 this.setHealth(95);
		 }
		
	}
	
}

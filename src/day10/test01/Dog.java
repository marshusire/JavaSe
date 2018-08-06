package day10.test01;
//子类继承父类 拥有父类公开的属性和方法
public class Dog extends Pet{
   
	//构造方法
	public Dog(){
	}
	public Dog(int health){
		this.setHealth(health);
	}
	
	//子类特有一个方法
		public void playPan(){
			System.out.println("接飞盘");
		}
	
	//重写看病的方法
	@Override
	public void toHospital() {
	  //定义狗的看病方法
		if(this.getHealth()<60){
		   System.out.println("狗狗 进行打针 吃药 恢复健康值中...");
		   //恢复健康值
		   this.setHealth(90);
		}
	}
	
	
}

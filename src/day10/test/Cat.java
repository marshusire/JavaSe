package day10.test;

public class Cat extends Pet{
  //默认的方法	
  public Cat(){	  
  }
  public Cat(int health){
	this.setHealth(health);  
  }
	
  @Override
	public void toHospital() {
		// TODO Auto-generated method stub
		if(this.getHealth()<30){
		   System.out.println("小猫 进行治疗");
			//重写设置健康值
		    this.setHealth(89);
		}
	}
  
	
}

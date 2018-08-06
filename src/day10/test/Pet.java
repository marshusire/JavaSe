package day10.test;
//宠物类 
public class Pet {
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
  
	//公共的行为看病
	public void toHospital(){
		System.out.println("看病的方法");
	}
	
}

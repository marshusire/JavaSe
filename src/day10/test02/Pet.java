package day10.test02;
//父类
public abstract class Pet {
   //属性值
	private int health;//健康值
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	//喂食
	public abstract void eat();
	

}

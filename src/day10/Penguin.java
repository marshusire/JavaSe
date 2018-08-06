package day10;

public class Penguin {
	// 属性
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void toHospital(){
		System.out.println("企鹅进行看病");
		 if(this.getHealth()<50){
			   this.setHealth(100);
		   }
	}
}

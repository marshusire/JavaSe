package day10;

public class Penguin {
	// ����
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void toHospital(){
		System.out.println("�����п���");
		 if(this.getHealth()<50){
			   this.setHealth(100);
		   }
	}
}

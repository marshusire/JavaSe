package day10;

public class Dog {
   //��������
    private int health;//����ֵ
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
    	
	//����
	public void toHospital(){
		System.out.println("��������");
		
		if(this.getHealth()<50){
			   this.setHealth(100);
		   }
	}
	
}

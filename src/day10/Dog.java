package day10;

public class Dog {
   //…Ë÷√ Ù–‘
    private int health;//Ω°øµ÷µ
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
    	
	//ø¥≤°
	public void toHospital(){
		System.out.println("π∑π∑ø¥≤°");
		
		if(this.getHealth()<50){
			   this.setHealth(100);
		   }
	}
	
}

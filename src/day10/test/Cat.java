package day10.test;

public class Cat extends Pet{
  //Ĭ�ϵķ���	
  public Cat(){	  
  }
  public Cat(int health){
	this.setHealth(health);  
  }
	
  @Override
	public void toHospital() {
		// TODO Auto-generated method stub
		if(this.getHealth()<30){
		   System.out.println("Сè ��������");
			//��д���ý���ֵ
		    this.setHealth(89);
		}
	}
  
	
}

package day10.test02;

public class Dog extends Pet{
    
	@Override
	public void eat() {
	  //��С��ιʳ  �ָ�����ֵ
	   if(this.getHealth()<100){
		  System.out.println("��ιʳһ�� �ָ�����ֵ");
		  this.setHealth(this.getHealth()+3);
		//����ֵ ֻ�ܵ���100
		   if(this.getHealth()>100){
			  this.setHealth(100); 
		   }
	   }		 
	}
}

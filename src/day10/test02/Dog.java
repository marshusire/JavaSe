package day10.test02;

public class Dog extends Pet{
    
	@Override
	public void eat() {
	  //给小狗喂食  恢复健康值
	   if(this.getHealth()<100){
		  System.out.println("狗喂食一次 恢复健康值");
		  this.setHealth(this.getHealth()+3);
		//健康值 只能等于100
		   if(this.getHealth()>100){
			  this.setHealth(100); 
		   }
	   }		 
	}
}

package day10.test02;

public class Master {
     //将父类做为方法形参 来实现多态
	
	//给所有宠物进行喂食
	public static void toEat(Pet p){
		//喂食
		 p.eat();
	}
	
	public static void main(String[] args) {
		//1.初始化两个宠物对象
		  Dog dog=new Dog();
		  Penguin p=new Penguin();
		//2.给宠物喂食 ，健康值不到100 继续喂食
		  //小狗
		  while(dog.getHealth()<100){
		     toEat(dog);//喂食一次
		  }
		  
		  //判断企鹅进行喂食
		  while(p.getHealth()<100){
			  toEat(p);
		  }
		  
	}

}

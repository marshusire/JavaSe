package day10.test;

public class Master {

// //给狗进行看病
//  public void cure(Dog dog){
//	  dog.toHospital();//送医院
//  }
//  public void cure(Penguin pen){
//	  pen.toHospital();
//  }
//  
	
	//1.父亲  二狗
	 // 小明  二明  
	
	
	
	
  //给所有宠物看病
  public void cure(Pet  p){
	//子类的对象 父类的引用
	  System.out.println("pppp===="+p);
	//调用去医院的方法
	  p.toHospital();

  }
  
   
  //入口方法
     public static void main(String[] args) {
		//1.初始化一个主人类对象 
    	  Master m=new Master();
    	//2.初始化一个Dog对象 ，将dog对象  赋值给 赋值给宠物类型（父类）
    	   Dog  dog=new Dog(40);
    	   System.out.println(dog);
    	   Pet p=dog;
    	   System.out.println(p);
    	   //给宠物看病
    	   m.cure(p);
    	   
    	   
    	//3.初始化一个企鹅对象,将企鹅对象的引用赋值给宠物类型（父类）   
    	   Penguin pen=new Penguin(20);
    	   System.out.println(pen);
    	   Pet p1=pen;//将子类的对象赋值给父类的引用
    	   System.out.println(p1);
    	   m.cure(p1);
    	   
    	//4.初始化一个cat对象
    	   Cat cat=new Cat(20);
    	   //给猫看病
    	   m.cure(cat);
    	   
    	   
    	  /**
    	   * 多态
    	   * 1. 将子类的对象 赋值给父类的引用
    	   * 2. 当用父类引用调用父类的方法时，执行的是子类重写的方法。
    	   * 3. 如果使用多态 必须有继承关系 
    	   * */
    	   
    	   
    	   
    	   
    	 
	 }
	
	
}

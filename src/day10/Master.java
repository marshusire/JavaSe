package day10;

/**
 * 
 * 主人类
 * */
public class Master {

 //给宠物进行看病
  public void cure(Dog dog){
	  System.out.println("给小狗看病");
	  //dog.toHospital();//给狗看病
  }
 //给企鹅看病	
  public void cure(Penguin pen){
	  System.out.println("给企鹅看病");
	 // pen.toHospital();//给企鹅看病
	  
  }
  
  
  public static void main(String[] args) {
    //1.初始化一个Mater 对象
	  Master m=new Master();
	  
	//2.初始化 主人养的宠物  
	  Dog dog=new Dog();
	  Penguin pen=new Penguin();
	
	//3.给宠物进行看病
	  m.cure(dog);
	  m.cure(pen);
  }
	
}

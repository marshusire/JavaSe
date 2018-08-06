package day09;

/**
 * 子类继承于 Person
 * 
 * Super 可以访问父类  属性和方法
 * super只能存在子类的方法中
 * super可以存在子类的构造方法中 用来调用父类的构造方法   必须放在构造方法第一行Super();
 *
 * 
 * */
public class Employee extends Person{
   //属性
	String hireDate;//入职时间
	
	//子类中定义和父类功能行为和属性
	 String name;//子类的属性
   
   //行为 子类也有
	 public void sleep(){
		 System.out.println("躺着睡觉");
	 }
	 
	 
	 /**
	  * 初始化一个对象的时候，构造方法必须被调用一次
	  *   1.如果子类的构造方法中没有显示调用父类的构造方法,默认调用无参数的构造方法
	  *   2.如果显示（super）调用父类指定的构造方法,父类指定构造方法会被执行一次；
	  * 
	  * */
	 //子类中构造法方法
	 public Employee(){
		 //显示调用父类的构造方法
		// super();//指定调用默认的构造方法
		 super("ddd");//指定调用带参数的父类的构造方法
		 
		 System.out.println("子类的构造方法"); 
	 }
	 
	 public Employee(String name){
		 
		 System.out.println("子类有参构造方法");
	 }
	 
	 
	public void methodA(){
		//不使用super 可以访问父类的成员
		
		//子类本身没有和父类相同的  属性和方法
		 System.out.println("name="+this.name);//调用当前类
		 System.out.println("supername"+super.name);//调用父类
		 super.sleep();//调用了父类的方法
		 this.sleep();
		 //  
		 
	}
	
	
	
	
}

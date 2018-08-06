package day09;

/**
 * 父类
 *  存放子类公共的特性和行为
 * */
public class Person {
   //公共属性
	String name;//姓名
	int    age; //年龄
	
	private int sex;//性别；
	
	protected String tel;//电话   可以在 不同包的子类中访问
	
	
	//构造方法
	public Person(){
	  System.out.println("父类的默认的构造方法");
	}
	public Person(String name){
		this();
	  System.out.println("父类带参数构造方法");
	}
	
	
   //方法
	public void sleep(){
		System.out.println(name+" "+age+" 睡觉");
	}
}

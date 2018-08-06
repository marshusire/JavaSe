package day09.test;
//父类中存放所有子类 公共属性和方法

public class Animal {
	private String name;// 名字
	private int age; // 年龄
	private int type; //类型  1 猫  2狗 3....

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(this);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    //功能行为
	public void doEat(){
		//区分
		
		System.out.println("吃东西");
	}
	
	//构造方法
	 public Animal(){
		 System.out.println("父类默认的构造方法");
	 }
	
	 public Animal(String name,int age){
		 System.out.println("父类带参数的构造方法");
		 //给当前父类对象属性进行赋值  
		  this.name=name; //姓名  this 
		  this.age=age;   //年龄
		  System.out.println("===="+this);
	 }
	
}

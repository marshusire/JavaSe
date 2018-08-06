package day09.test;
//子类继承父类
public class Dog extends Animal{
  //子类特有属性
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
  //狗有一个特有一个行为
	 public void swiming(){
		 System.out.println("会游泳"); 
	 }
	
	 //构造方法
	  public Dog(){
		  
	  }
	  public Dog(String name,int age){
		 //调用父类的构造方法 给属性进行赋值
		  super(name,age);
	  }
	 
}

package day09.test;
//子类继承父类  可以拥有父类公开属性和方法
public class Cat extends Animal{
   //子类特有属性
	 private String sex;

	 public String getSex() {
		return sex;
	 }
	 public void setSex(String sex) {
		this.sex = sex;
	 }

	//猫特有行为
	 public void upATree(){
		 System.out.println("猫可以上树"); 
	 } 
	 
	 //构造方法
	  public Cat(){
	  
	  }
	  //带参数的构造方法
	  public Cat(String name,int age){
		  //调用父类带参数构造方法 直接给父类属性赋值
		    super(name,age);
		  
	  }
	 
}

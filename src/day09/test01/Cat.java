package day09.test01;
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
	  
	  /**
	   * 重写 只能是方法 只能重写父类的方法
	   * 当父类功能行为 满足不了子类特性 ,子类需要对父类的方法进行
	   * 重新定义 
	   * 
	   * 1.必须在子类中重写
	   * 2.方法名 参数列表必须一致
	   * 3.修饰符要么和父类一致，要么比父类修饰权限大
	   * 4.返回值类型 要么一致 要么是其子类类型
	   * 5.方法中声明的异常 要么一致 获取子类类型
	   * 
	   * */
	    //重写
	    @Override     //注解
		public void doEat() {//重新定义父类的方法
			//super.doEat();//调用父类的方法
	       System.out.println("猫吃鱼   喵喵");
		}
	  
	  
	  
	 
}

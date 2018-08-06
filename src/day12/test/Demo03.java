package day12.test;

class Demo04{
   //方法的定义
	public static void  test(Demo03 demo){
		//对属性进行赋值
		demo.setName("mars");
		demo.setAge(12);
	}
	
}


public class Demo03 {
  /***
   * this 关键字代表的是当前对象 
   *      this只能在方法中使用 只能在实例方法中使用  
   *      this可以区分局部变量和成员变量
   *      this可以调用当前类的构造方法
   *      this可以做为方法的返回值(链式语法编程)
   *      this可以做为方法的实参进行传值
   */
	
    private String  name;
    private int     age;
    public String getName() {
       return name;
	}
	public void setName(String name) {
		//区分局部变量和成员变量
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public void methodB(){
     	
    }
    //this 做为方法的实参进行传递
	public void methodA(){
		this.methodB();//等价于 对象.methodB();
      //方法的传参 this  this代表的就是当前对象
		Demo04.test(this);
	}
	
	//this可以做为方法的返回值 进行调用
	public Demo03 getSum(){
		System.out.println("求和");
		return this;
	}
	
	public static void method(){
	}
   
	public static void main(String[] args) {
		//1.初始化一个对象
		  Demo03 demo=new Demo03(1);
		//2.调用方法  链式语法编程
		  demo.getSum().methodA();
		  System.out.println(demo.getName()+"  "+demo.getAge());
		  
		  
	}
	
	/**
	 * 
	 *  构造方法中 使用this关键字 可以调用构造方法
	 *     this 必须在第一行
	 *  
	 *
	 * 
	 * */
	
	  public Demo03(){
		 this(1);
	  }
	  public Demo03(int num,int age){
		  
	  }
	  public Demo03(int num){
		  this(2,3);
		  
	  }
	
	
}

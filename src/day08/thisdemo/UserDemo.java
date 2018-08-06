package day08.thisdemo;

public class UserDemo {
     /**
      * this 代表的是当前对象
      * this 只能在一个地方出现   方法中
      *      构造方法
      *      实例方法
      * */
	
	//属性
	String name;
	int    age;
   //方法	
	public void method(){
	   System.out.println("this=="+this);
	  //输出name 和 age
	  System.out.println(name+" "+age);
	}
	public static void methodA(){
		//this.name="name";
	}
	
	//默认构造方法
	public UserDemo() {
		this.name="22222";
	}
	
	//入口方法
	public static void main(String[]args){
		UserDemo.methodA();
		
		//1.初始化一个对象
		   UserDemo user=new UserDemo();
		//2.给属性进行赋值
		  // user.name="mars";
		   user.age=12;
		//3.调用方法
		   user.method();
		   System.out.println("user=="+user);
		   
		
		//2.初始化UserDemo对象
		   UserDemo user1=new UserDemo();
		   //给属性赋值
		   user1.name="张三";
		   user1.age=18;
		   //调用方法
		   user1.method();
		   System.out.println("user1"+user1);
		
		
		
	}

}

package day08.setinit;

import java.util.Arrays;

public class User {
	// 属性
	private String name; // 姓名
	private int age; // 年龄

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//默认构造方法
	 public User(){ 
	 }
	 public User(String name,int age){
		 //通过this解决 成员变量和局部变量的二义性
		  this.name=name;
		  this.age=age;
	 }
	 
	 //入口方法
	 public static void main(String[] args) {
	    //初始化一个对象 同时，给对象属性赋值   有两种方式
		  //1.通过setter注入
		     //1.1初始化一个对象
		      User user=new User();
		     //1.2给对象的属性进行赋值
		      user.setName("mars");
		      user.setAge(18);
		     //1.3.访问属性的值
		      System.out.println("==name==="+user.name+" age=="+user.age);
		      
		      
		   //2.通过构造方法 对当前对象的属性进行赋值
		      User user1=new User("小姐姐",18);
		      System.out.println(user1.getName()+"   "+user1.getAge());
		/**
		 * 
		 * 总结： 
		 *    当初始化对象的时候，对象的属性比较少的情况下，我们通过构造方法给对象的属性进行赋值  。
		 *    如果对象的属性比较多的情况，最好通过setter注入的方式进行赋值，简单明了。
		 */
		      
		 
	 }
	
}

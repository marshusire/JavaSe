package day09.qy;

import day09.Person;

/**
 * 继承不同包中的父类
 * 
 * 
 * */

public class Worker extends Person{
	public void dowork(){
		//子类中是否可用访问到父类 private default(默认成员) protected  public
		// this.sex=12;   私有的成员是不可以直接访问
		// this.name="";  默认成员在不同包中 也是不可以访问的
		    this.tel="188888888";//protected 修饰的成员可以在不同包的子类中访问
	}
}

package day08.test;

import day08.SecondDemo;
import day08.*;
public class TestDemo {
    /**
     *  不同包中测试不同访问权限的类 
     * */
	public static void main(String[] args) {
	   //1.初始化SecondDemo类
		   SecondDemo demo=new SecondDemo();
        //2.访问demo的属性
		  //demo.name="";//private 私有
		  //demo.like="";//默认 只能在同包中访问
		  //demo.toEat();//默认 只能在同包中访问
		   
		//3.初始化一个用默认修饰符的类    不可以的 不在同一包 不能引用
		   // SecondDemo01 demo1=new SecondDemo01();
		   
	   //在不同包中 访问public 修饰的成员和类
		  ThirdDemo third=new ThirdDemo();
		  //访问属性 public
		  third.name="哒哒哒";
		  third.age=123;
		  //访问方法 bublic
		  third.printFormat();
		   
		   
		  
	}

}

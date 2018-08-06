package day14.innerclass;

import day14.innerclass.OutDemo01.Inner;

public class TestDemo {

	public static void main(String[] args) {
		// 初始化一个外部类
		OutDemo01 out = new OutDemo01();
		//给外部类的属性进行赋值
		out.name="lucy";
		
		// 初始化一个内部类对象
		Inner inner = out.new Inner();
		//给内部类的属性进行赋值
	    inner.name="mars";
		//访问内部类的方法
		inner.printmsg();
		inner.printOutMsg();
		inner.methodA();
		
		//直接初始化一个内部类对象 外部类不能直接访问了
		OutDemo01.Inner in=new OutDemo01().new Inner();
		
		in.printOutMsg();
		
	}

}

package day08.thisdemo;

public class ThisDemo03 {
	//this 可以作为方法返回值(链式编程)
	public void methodA(){
		System.out.println("确认过眼神遇见对的人");	
	}
	//定义一个方法  有返回值
	public ThisDemo03 methodB(){
		//处理一个操作
		System.out.println("走马 ");
		//将当前对象返回
		return this;
	}

	//入口方法
	public static void main(String[]args){
		//1.初始化一个对象 ThisDemo03
		  ThisDemo03 demo=new ThisDemo03();
		  System.out.println(demo);
		//调用方法
		//ThisDemo03 demo1=demo.methodB();
		// demo1.methodA();
		  demo.methodB().methodA();//链式语法编程
		 //System.out.println("demo1"+demo1);
		  
		 
		
	}
}

package day12.test;

public class Demo{
  //成员变量
	String name;    //实例成员变量   对象来调用   私有   堆区
	static int age; //静态成员变量   通过类名 或者对象  共享  方法区
	
	
	//定义一个常量的时候 final 必须初始化一个默认的初始化值
	
	public  void methodA(){
	 //方法
	  //局部变量  从定义变量 开始到花括号结束
		System.out.println(name);
	}
	public  static void methodB(){
		//静态方法  在静态方法内部 访问外部成员，外部成员必须是静态静态成员
		System.out.println(age);
	}
	{//代码块
		
		
	}
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		Demo demo1=new Demo();
	  //获取他们的class对象
       Class c=demo.getClass();
       Class c1=demo1.getClass();
	   System.out.println(c+"  "+c1);
	   
		
		
	}
	
	
	

}

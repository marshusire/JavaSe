package day14.innerclass;

public class OutDemo03 {
   //属性
	String name;
    int    sex;
	
	public void methodA(){
		System.out.println("外部类的实例方法");
	}
	
	/***
	 * 局部内部类
	 *  位置:方法中
	 *  成员： 必须都是实例成员
	 *  
	 *  只能在声明的方法中使用
	 */
	public  void methodB(){
		
		final int num=10; 
		
	    class Inner02{
		     String name;
		     int  age;
		     public void methodc(){
		    	 //局部内部类可以访问外部类的所有成员 
		    	 System.out.println(sex);
		    	
		    	 //访问外部类 ，方法内的局部变量  局部变量必须加上final修饰符 ，Jdk1.8开始不需要添加
		    	 System.out.println(num);
		    	 System.out.println("局部内部类的 实例方法");
		     }
//		     public static void methodD(){
//		    	 System.out.println("局部内部类的静态方法");
//		     }       
		  }
	     
	     //1.初始化一个内部类对象
	      Inner02 in=new Inner02();
	     //2.访问成员
	      in.name="mars";
	      in.age=12;
	      in.methodc();
	      
	     
	     
		  	
	}
	
	 public static void main(String[] args) {
	    //初始化一个对象 外部类的对象
		   OutDemo03 demo=new OutDemo03();
		   demo.methodB();
		 
		 
		 
		 
	 }
	
	
	
}

package day14.innerclass;

/**
 * 内部类：
 *      在类的内部在定义一个类,可以看做成类的成员。
 * 类的成员：
 *       字段，方法，类。
 *       
 * 内部类类型：
 *     1.实例内部类      
 *     2.静态内部类
 *     3.局部内部类
 *     4.匿名内部类  
 *     
 * @author Administrator
 *
 */


public class OutDemo01 {
	//外部类的属性
	 String name;//实例成员
	 int  age;
	//外部类的方法
	 public void methodA(){
	   System.out.println("你好"); 
	 }
	 //定义一个实例内部类
	 /**
	  * 实例内部类
	  *   位置： 类中 方法外
	  *   修饰符：public private  protected
	  *   不能用static
	  *    
	  *    类中定义的成员
	  *    不能使用static进行修饰
	  *    访问权限修饰符 都可以
	  *       
	  *    //内部类访问外部类的成员   
	  *       在内部类中可以直接访问外部类的成员(实例和静态)
	  *       
	  *    
	  */
	      class Inner{	  
		   //定义内部的成员
		      String name;//实例成员
		   // static int  number;// 不能使用static 进行修饰
		   public void printmsg(){
			   System.out.println("我是实例内部类的方法"+name+age);
		   } 
		   public void printOutMsg(){
			  //如果外部类成员和内部类成员一致 默认访问的是内部类的成员，
			  //如果要访问外部类成员
			     System.out.println(OutDemo01.this.name);
			  //调用外部类的methodA方法
			     OutDemo01.this.methodA();   
			  //通过内部类 给外部类成员赋值
			     OutDemo01.this.age=11;
		   }
		   
		   public void methodA(){
			   System.out.println("内部类的方法"); 
		   }
		   
		   public Inner(){
			   System.out.println("构造方法");
		   }
		   
	   
	    }
	 
	
	      
	

}

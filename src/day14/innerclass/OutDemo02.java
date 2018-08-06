package day14.innerclass;

public class OutDemo02 {
   String name;
   static int  number;
   public void methodA(){
	 System.out.println("外部类实例方法");  
   }
   public static void methodB(){
	 System.out.println("外部类静态方法");
   }
   /**
    *  静态内部类
    *    位置： 类中 方法外部
    *    修饰: final abstract static  private  public  protected
    *    成员：
    *      静态 非静态
    *      
    */
      static class Inner01{
    	  String  name;
    	  static  int age;
    	  public Inner01(){
    		  System.out.println("构造方法");
    	  }
    	  
    	  public void mehtodA(){
    		  System.out.println("内部类的实例成员");
    		  //静态内部类的实例成员可以访问外部类的静态成员
    		    number=112;
    		    name="mars";//代表是内部类成员
    		  // OutDemo02.this.name="123"; 不允许访问外部类的实例成员
    		  
    	  }
    	  public static void methodB(){
    		  //只能访问外部类的静态成员
    		  
    		  System.out.println("内部类的静态成员");
    	  }
    	  
      }
   
     public static void main(String[] args) {
		//1.初始化一个静态内部类对象  没有初始化外部类对象
    	  OutDemo02.Inner01 in=new OutDemo02.Inner01();
    	//2.访问内部类 成员 可以访问 所有的成员
    	  in.mehtodA();//内部类的实例方法
    	  in.methodB();//内部类的静态方法
    	  
    	//直接访问内部类的静态成员  类名来访问
    	  OutDemo02.Inner01.age=11;
    	  OutDemo02.Inner01.methodB();
    	  
         //内部类访问外部类的成员 只能访问静态成员；	  
    	   
	}
   
	
	
}

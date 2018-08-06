package day12.test;


class Father{
   //1.属性	
     String name;  	
   //2.方法
     //构造方法
     public Father(){
    	 System.out.println("父类默认的构造方法");
     }
     public Father(String name){
    	 this.name=name;
     }
}


public class Demo05 extends Father{
	
	//String name;//子类的name
	
  /**
   * super关键字 代表父类
   *      super代表父类对象 
   *      只能在子类的方法中使用
   *      super在子类的构造方法中使用，用来调用父类的构造方法 必须放在第一行
   *      super 可以访问父类的成员
   *      
   *      在一个构造方法中 this()和super()关键字 调用构造方法 二选一  
   *      
   * */
	
	public Demo05(){
		
	  //super调用父类的构造方法	
	    super("22");
	    this.name="33";   //
	    super.name="44";  //调用父类的成员
	
	}	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
}

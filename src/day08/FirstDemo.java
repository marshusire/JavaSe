package day08;

public class FirstDemo {
  //private  字段  方法 
  //在同类中可以访问  test dd
   private String name;//姓名
   
   private void study(){
	  System.out.println(name+"Hello");
   }
   public static void main(String[] args) {
		FirstDemo demo=new FirstDemo();
		demo.name="333";
    	demo.study();
   }
}

class FirstDemo01{
	
	public void method(){
		//初始化一个类
		 FirstDemo first=new FirstDemo();
		//设置属性
		// first.study();
	}
	
}

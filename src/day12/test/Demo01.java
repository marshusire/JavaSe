package day12.test;


class Test{
	
	Test methodA() throws ArrayIndexOutOfBoundsException{
		System.out.println("我 很高,很帅");
		return null;
	}
	
}


public class Demo01 extends Test{
  /**
   *  方法重载
   *     特点: 两同 一不同
   *         两同： 同类  同方法名
   *        一不同： 参数列表 不同
   */
	public double getArea(int num){
		
		Demo02 demo=new Demo02(2);
		
		return 0;
	}
	public double getArea(int num ,int num1){
		return num*num1;
	}
	
	/**
	 * 方法重写：
	 *     当父类的行为满足不了子类的行为特征,需要对父类的行为,进行重新定义。
	 *  特点：
	 *      必须有继承关系，方法重写在子类中重写
	 *      方法名,参数必须和父类保持一致
	 *      方法的返回值类型 和父类保持一致或者是子类
	 *      声明的异常,和父类一致或者是子类
	 *      修饰符不能比父类的小
	 * 
	 * */
	 
	       //重写
	    @Override  
	   public Test methodA() throws ArrayIndexOutOfBoundsException {
	    		// 父类的行为满足不了子类的行为 
	    	      System.out.println("很富");
	    		 // super.methodA();//保留了父类的特性 
	    		 return null;
	    		 
	    		 
	    		
	    		
	   }
	
	
	
	
}

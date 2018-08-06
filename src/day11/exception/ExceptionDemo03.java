package day11.exception;

public class ExceptionDemo03 {
	/**
	 * 声明异常  用关键字 throws
	 * 修饰符 返回值类型 方法名(参数列表) throws 异常类型,异常类型1..{
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 作用：告诉方法调用者，调用该方法有可能会产生 异常类型，调用用这需要对 异常类型进行处理
	 * 
	 * 
	 * 
	 * 异常传递链过程中 
	 *  不会创建新的异常信息，会保留原来的异常信息 ，继续往上传
	 * 
	 * 
	 * */
	
	//定义方法
	public static  void methodA()throws ArithmeticException{
		//求两个数的商
		 int a=10;
		 int b=10;	
		 System.out.println("a/b="+a/b);//有可能产生异常类型,不对该异常处理
		 methodB();//调用MethodB
	}
	
	//
	public static void methodB() throws ArrayIndexOutOfBoundsException{
		//操作数组
		int[]arr={1};
		System.out.println(arr[2]);//当前方法不对异常处理，只对异常进行声明，谁调用，谁处理
	}
	
	
	public static void main(String[] args) {
		//调用者捕获异常信息
	    try{
		  methodA();
		}catch(Exception e){
		  e.printStackTrace();
		}
	    /*
		try{
	      methodB();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}*/
		System.out.println("异常处理完毕");
		
	}
	
	
}

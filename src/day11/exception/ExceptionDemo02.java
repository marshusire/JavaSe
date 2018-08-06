package day11.exception;

public class ExceptionDemo02 {
	
	public static void main(String[] args) {
		
		/**
		 * try catch finally语句
		 * 如果使用return语句，必须先执行完finally之后，在执行return语句 
		 * 终止finally语句执行 只有一种情况
		 * 
		 * 
		 * 
		 * */
		
		
		try{
			//可能出现的异常代码
			 int a=10;
			 int b=0;
		 	 System.out.println("a/b="+a/b);
		 	// return;
		}catch(Exception e){
			System.out.println("我已经捕获处理");
			System.exit(0);//终止当前虚拟机
			//return;
		}finally{
			System.out.println("我是最终要执行的一句");
		}
		
		   System.out.println("所有操作都处理完毕");
		
		
		
	}
	

}

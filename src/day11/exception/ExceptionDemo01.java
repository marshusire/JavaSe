package day11.exception;

public class ExceptionDemo01 {
	
	/***
	 *  捕获异常          
	 *  try{
	 *    //有可能出现异常的代码
	 *  }catch(Exception e){
	 *    //捕获异常
	 *  }finally{//最终
	 *    //无论有无异常 最终还是要执行
	 *  }
	 *
	 *  try 必须和 catch 或者finally结合使用 单一try不能使用
	 * @param args
	 */
	

	public static void main(String[] args) {
		 
		//声明两个变量
		  int num=1;
		  int num1=1;
		  int[]arr=new int[1];
		  
		  
		try{//存放有可能出现异常的代码
		  System.out.println(num/num1);  //如果出现异常,没有对异常处理，以下代码将不会执行
		}catch(ArithmeticException e){
			
		}catch (ArrayIndexOutOfBoundsException e){
			// TODO: handle exception
		}catch(Exception e){//捕获异常  对异常进行处理 ，保证程序继续运行
			   //处理异常
				 System.out.println(e.getMessage());//获取到异常的信息
				//异常所有的信息打印出来
				 e.printStackTrace();//打印输出所有的堆栈的信息
	    }
		 
		 System.out.println("hello   =====");
		 /**
		  * try和finally结合使用
		  * 
		  * */
	
		  try{
			  //有可能出现异常的代码
			   arr[0]=1;
			  // arr[1]=2;
		  }finally {
			  //无论有无异常都会执行该代码块  如果没有catch语句 出现异常后，代码执行会完毕，程序中断
			  System.out.println("最终");
		   }
		      System.out.println("finally");
		 
		
		   /**
		    * 
		    * try{
		    *   可能出现异常的代码块
		    * }catch(异常类型1){
		    *    //捕获到异常类型1
		    * }catch(异常类型2){
		    *    //捕获到异常类型2
		    * }finally{
		    *    //最终要执行的代码
		    * }
		    * 
		    * catch 捕获多个异常的时候
		    *       先子类异常  后父类类型
		    * 
		    * 
		    * 
		    * */   
		      
		      try{
		    	//有可能出现异常的代码块  
		    	  System.out.println(num/num1);  //算术异常
		    	  System.out.println(arr[1]);    //数组下标越界异常  
		      }catch (ArithmeticException e) {
				//捕获到异常
		    	  e.printStackTrace();//打印输出当前堆栈的异常信息
			  }catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				   e.printStackTrace();
		      }catch(Exception e){
		    	  
		      }finally{
				  System.out.println("最终执行的代码块");
			  }
		      
		      
		      
		      
		      
		      
		      
		      
		      

	}

}

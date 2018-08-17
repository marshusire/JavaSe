package day22.thread;

/**
 * 1.Java类只支持单根继承，一旦继承了Thread类 ，就不能在继承其他资源
 * 2.使用起来比较简单方便
 * 3.当前案例将 ，它不能实现资源的共享
 * 
 * @author Administrator
 *
 */


public class Apple01 extends Thread{
   //苹果的总数
   static int count=50;
   @Override
	public void run() {//子线程的线程体
		//吃苹果
	    for (int i= 50; i>0; i--) {//每次循环一次吃一个
	    	if(count>0){
			System.out.println(Thread.currentThread().getName()+"吃了第"+(count--)+"苹果");
	    	}
		}
	}	
	
	 public static void main(String[] args) {
	     //1.初始化三个线程
		  Apple01 app=new Apple01();
		  app.setName("小A");
		  Apple01 app1=new Apple01();
		  app1.setName("小B");
		  Apple01 app2=new Apple01();
		  app2.setName("小C");
		  
		//2.启动线程
		  app.start();
		  app1.start();
		  app2.start();
		  
		 
		 
		 
	 }
   
   
	
}

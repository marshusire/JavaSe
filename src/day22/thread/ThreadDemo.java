package day22.thread;

/**
 * 
 * ThreadDemo 继承了Thread
 *  那么该类就是一个线程类
 *   必须在子类中重写run方法
 *   run 方法是线程体
 *  
 * 
 * @author Administrator
 *
 */


public class ThreadDemo extends Thread{

	@Override
	public void run() {
	    //线程体
		//获取当前线程的名称
		 try {
			Thread.sleep(1000);//当前线程休眠1秒钟
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void method(){
		//1.获取当前线程
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
	   //1.获取当前线程
		 Thread th=Thread.currentThread();
	   //2.查看当前线程的名称
		 System.out.println(th.getName());
       //3.查看当前线程的状态
		 System.out.println(th.getState());
	   //4.查看线程的id
		 System.out.println(th.getId());
	   //5.查看当前线程的优先级
		 System.out.println(th.getPriority());
		 method();
		 
	   //6.创建一个子线程	 启动了一个线程  其实做了一个异步操作
	  	 ThreadDemo th1=new ThreadDemo();
	  	 //给线程设置名字
	  	 th1.setName("mars");
		 //启动线程  不能直接调用run方法 必须通过start来调用
	  	 th1.start();
		 // th1.run();
		 System.out.println("执行完毕");

	}

}

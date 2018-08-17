package day22.thread;

/**
 * ThreadDemo01实现 Runnable这个接口
 *  
 *  ThreadDemo01不是线程类
 *  
 * @author Administrator
 *
 */
public class ThreadDemo01 implements Runnable{
    
	@Override
	public void run() {
		//执行的线程体
		System.out.println("打印线程的名称"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//1.创建一个ThreadDemo01的实例
		 ThreadDemo01 demo=new ThreadDemo01();
		 
		//2.创建一个线程对象  执行demo对象
		 Thread th=new Thread(demo,"mars");
		 th.start();//启动一个线程
	   //3.在次启动一个线程 对demo操作
		 Thread th1=new Thread(demo, "mars1");
		 th1.start();
		 
		 
		
	}
	
	
}

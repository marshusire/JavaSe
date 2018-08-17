package day22.thread;
/**
 * 实现接口
 * 1.当前类可以继续继承其他类，还可以继续实现其他接口
 * 2.使用起来相对会有点复杂
 * 3.可以实现资源的共享
 * 
 * 
 * @author Administrator
 *
 */

public class Apple02 implements Runnable{
    int count=50;//苹果的总数量
	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			//吃苹果
			if(count>0){
			   System.out.println(Thread.currentThread().getName()+"吃了第"+count--+"苹果");
			}
		}
	}
	
	public static void main(String[] args) {
		//1.初始化一个Apple02对象
		 Apple02 app=new Apple02();//0x123
		 
		//2.初始化三个线程 都对 app这个对象操作
		 new Thread(app, "小A").start();  
		 new Thread(app,"小B").start(); 
		 new Thread(app,"小C").start();  
		 
		
		
		
	}
	
	
	
}

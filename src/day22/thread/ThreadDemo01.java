package day22.thread;

/**
 * ThreadDemo01ʵ�� Runnable����ӿ�
 *  
 *  ThreadDemo01�����߳���
 *  
 * @author Administrator
 *
 */
public class ThreadDemo01 implements Runnable{
    
	@Override
	public void run() {
		//ִ�е��߳���
		System.out.println("��ӡ�̵߳�����"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//1.����һ��ThreadDemo01��ʵ��
		 ThreadDemo01 demo=new ThreadDemo01();
		 
		//2.����һ���̶߳���  ִ��demo����
		 Thread th=new Thread(demo,"mars");
		 th.start();//����һ���߳�
	   //3.�ڴ�����һ���߳� ��demo����
		 Thread th1=new Thread(demo, "mars1");
		 th1.start();
		 
		 
		
	}
	
	
}

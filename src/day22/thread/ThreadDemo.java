package day22.thread;

/**
 * 
 * ThreadDemo �̳���Thread
 *  ��ô�������һ���߳���
 *   ��������������дrun����
 *   run �������߳���
 *  
 * 
 * @author Administrator
 *
 */


public class ThreadDemo extends Thread{

	@Override
	public void run() {
	    //�߳���
		//��ȡ��ǰ�̵߳�����
		 try {
			Thread.sleep(1000);//��ǰ�߳�����1����
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void method(){
		//1.��ȡ��ǰ�߳�
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
	   //1.��ȡ��ǰ�߳�
		 Thread th=Thread.currentThread();
	   //2.�鿴��ǰ�̵߳�����
		 System.out.println(th.getName());
       //3.�鿴��ǰ�̵߳�״̬
		 System.out.println(th.getState());
	   //4.�鿴�̵߳�id
		 System.out.println(th.getId());
	   //5.�鿴��ǰ�̵߳����ȼ�
		 System.out.println(th.getPriority());
		 method();
		 
	   //6.����һ�����߳�	 ������һ���߳�  ��ʵ����һ���첽����
	  	 ThreadDemo th1=new ThreadDemo();
	  	 //���߳���������
	  	 th1.setName("mars");
		 //�����߳�  ����ֱ�ӵ���run���� ����ͨ��start������
	  	 th1.start();
		 // th1.run();
		 System.out.println("ִ�����");

	}

}

package day22.thread;

/**
 * 1.Java��ֻ֧�ֵ����̳У�һ���̳���Thread�� ���Ͳ����ڼ̳�������Դ
 * 2.ʹ�������Ƚϼ򵥷���
 * 3.��ǰ������ ��������ʵ����Դ�Ĺ���
 * 
 * @author Administrator
 *
 */


public class Apple01 extends Thread{
   //ƻ��������
   static int count=50;
   @Override
	public void run() {//���̵߳��߳���
		//��ƻ��
	    for (int i= 50; i>0; i--) {//ÿ��ѭ��һ�γ�һ��
	    	if(count>0){
			System.out.println(Thread.currentThread().getName()+"���˵�"+(count--)+"ƻ��");
	    	}
		}
	}	
	
	 public static void main(String[] args) {
	     //1.��ʼ�������߳�
		  Apple01 app=new Apple01();
		  app.setName("СA");
		  Apple01 app1=new Apple01();
		  app1.setName("СB");
		  Apple01 app2=new Apple01();
		  app2.setName("СC");
		  
		//2.�����߳�
		  app.start();
		  app1.start();
		  app2.start();
		  
		 
		 
		 
	 }
   
   
	
}

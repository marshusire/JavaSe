package day22.thread;
/**
 * ʵ�ֽӿ�
 * 1.��ǰ����Լ����̳������࣬�����Լ���ʵ�������ӿ�
 * 2.ʹ��������Ի��е㸴��
 * 3.����ʵ����Դ�Ĺ���
 * 
 * 
 * @author Administrator
 *
 */

public class Apple02 implements Runnable{
    int count=50;//ƻ����������
	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			//��ƻ��
			if(count>0){
			   System.out.println(Thread.currentThread().getName()+"���˵�"+count--+"ƻ��");
			}
		}
	}
	
	public static void main(String[] args) {
		//1.��ʼ��һ��Apple02����
		 Apple02 app=new Apple02();//0x123
		 
		//2.��ʼ�������߳� ���� app����������
		 new Thread(app, "СA").start();  
		 new Thread(app,"СB").start(); 
		 new Thread(app,"СC").start();  
		 
		
		
		
	}
	
	
	
}

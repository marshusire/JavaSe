package day11.block;

public class BlockDemo {
	/**
	 * ����� ���շ��� ���Ի���Ϊ4����
	 *    1.�ֲ������
	 *    2.��ʼ�������
	 *    3.��������
	 *    4.��̬�����
	 * */
	 //�ֲ������ 
	 public void methodA(){
		 System.out.println("����ÿ����һ�λ�ִ��һ��");
	 }
	 public static void methodB(){
		 System.out.println("����ÿ����һ�λ�ִ��һ��");
		 
	 }
	 //��ʼ�������
	 {
		System.out.println("��ʼ������������ڹ�������,ÿ����һ�������ʱ�򣬻�ִ��һ��"); 	 
	 }
	 //��������
	 public BlockDemo(){
		 System.out.println("�������� ÿ����һ��������ִ��һ��");
	 }
	 //��̬����� ������ص�JVM��ʱ�� ���Զ�ִ��һ�θô���� ֻ��ִ��һ�� 
	 static{
		System.out.println("��̬�����ִ�� "); 
	 }
	
	 public static void main(String[] args) {
		//1.��ʼ��һ��BlockDemo�Ķ���
		 BlockDemo demo=new BlockDemo();
		 demo.methodA();
		 
		 BlockDemo  demo1=new BlockDemo();
		 
	
		 
	}
	

}

package day12.test;

public class Demo{
  //��Ա����
	String name;    //ʵ����Ա����   ����������   ˽��   ����
	static int age; //��̬��Ա����   ͨ������ ���߶���  ����  ������
	
	
	//����һ��������ʱ�� final �����ʼ��һ��Ĭ�ϵĳ�ʼ��ֵ
	
	public  void methodA(){
	 //����
	  //�ֲ�����  �Ӷ������ ��ʼ�������Ž���
		System.out.println(name);
	}
	public  static void methodB(){
		//��̬����  �ھ�̬�����ڲ� �����ⲿ��Ա���ⲿ��Ա�����Ǿ�̬��̬��Ա
		System.out.println(age);
	}
	{//�����
		
		
	}
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		Demo demo1=new Demo();
	  //��ȡ���ǵ�class����
       Class c=demo.getClass();
       Class c1=demo1.getClass();
	   System.out.println(c+"  "+c1);
	   
		
		
	}
	
	
	

}

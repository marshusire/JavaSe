package day08.thisdemo;

public class ThisDemo03 {
	//this ������Ϊ��������ֵ(��ʽ���)
	public void methodA(){
		System.out.println("ȷ�Ϲ����������Ե���");	
	}
	//����һ������  �з���ֵ
	public ThisDemo03 methodB(){
		//����һ������
		System.out.println("���� ");
		//����ǰ���󷵻�
		return this;
	}

	//��ڷ���
	public static void main(String[]args){
		//1.��ʼ��һ������ ThisDemo03
		  ThisDemo03 demo=new ThisDemo03();
		  System.out.println(demo);
		//���÷���
		//ThisDemo03 demo1=demo.methodB();
		// demo1.methodA();
		  demo.methodB().methodA();//��ʽ�﷨���
		 //System.out.println("demo1"+demo1);
		  
		 
		
	}
}

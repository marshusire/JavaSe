package day14.innerclass;

import day14.innerclass.OutDemo01.Inner;

public class TestDemo {

	public static void main(String[] args) {
		// ��ʼ��һ���ⲿ��
		OutDemo01 out = new OutDemo01();
		//���ⲿ������Խ��и�ֵ
		out.name="lucy";
		
		// ��ʼ��һ���ڲ������
		Inner inner = out.new Inner();
		//���ڲ�������Խ��и�ֵ
	    inner.name="mars";
		//�����ڲ���ķ���
		inner.printmsg();
		inner.printOutMsg();
		inner.methodA();
		
		//ֱ�ӳ�ʼ��һ���ڲ������ �ⲿ�಻��ֱ�ӷ�����
		OutDemo01.Inner in=new OutDemo01().new Inner();
		
		in.printOutMsg();
		
	}

}

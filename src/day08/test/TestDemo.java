package day08.test;

import day08.SecondDemo;
import day08.*;
public class TestDemo {
    /**
     *  ��ͬ���в��Բ�ͬ����Ȩ�޵��� 
     * */
	public static void main(String[] args) {
	   //1.��ʼ��SecondDemo��
		   SecondDemo demo=new SecondDemo();
        //2.����demo������
		  //demo.name="";//private ˽��
		  //demo.like="";//Ĭ�� ֻ����ͬ���з���
		  //demo.toEat();//Ĭ�� ֻ����ͬ���з���
		   
		//3.��ʼ��һ����Ĭ�����η�����    �����Ե� ����ͬһ�� ��������
		   // SecondDemo01 demo1=new SecondDemo01();
		   
	   //�ڲ�ͬ���� ����public ���εĳ�Ա����
		  ThirdDemo third=new ThirdDemo();
		  //�������� public
		  third.name="������";
		  third.age=123;
		  //���ʷ��� bublic
		  third.printFormat();
		   
		   
		  
	}

}

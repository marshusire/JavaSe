package day09;

/**
 * ����
 *  ������๫�������Ժ���Ϊ
 * */
public class Person {
   //��������
	String name;//����
	int    age; //����
	
	private int sex;//�Ա�
	
	protected String tel;//�绰   ������ ��ͬ���������з���
	
	
	//���췽��
	public Person(){
	  System.out.println("�����Ĭ�ϵĹ��췽��");
	}
	public Person(String name){
		this();
	  System.out.println("������������췽��");
	}
	
	
   //����
	public void sleep(){
		System.out.println(name+" "+age+" ˯��");
	}
}

package day09.test;

public class TestDemo {

	public static void main(String[] args) {
	     //1.��ʼ��һ��Cat ����
		   Cat cat=new Cat("Tom",1);
		   //����sex
		   cat.setSex("��");
		  //��ȡ name �� age������
		   System.out.println(cat.getName());//����û�� �Ҹ���
		   System.out.println(cat.getAge()); //����û�� �Ҹ���
		   System.out.println(cat.getSex());//����
		  //���ù�������Ϊ
		   cat.doEat();
		   cat.upATree();
		   
		  //2.��ʼ��һ��dog����
		   Dog dog=new Dog("Lucy",8);
		   //dog���е�����
		   dog.setWeight(12);
		   //��ȡdog �� age ������
		   System.out.println(dog.getName());
		   System.out.println(dog.getAge());
		   System.out.println(dog.getWeight());
		   //ִ�й�����Ϊ
		   dog.doEat();
		   dog.swiming();

	}

}

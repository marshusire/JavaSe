package day08.thisdemo;

public class UserDemo {
     /**
      * this ������ǵ�ǰ����
      * this ֻ����һ���ط�����   ������
      *      ���췽��
      *      ʵ������
      * */
	
	//����
	String name;
	int    age;
   //����	
	public void method(){
	   System.out.println("this=="+this);
	  //���name �� age
	  System.out.println(name+" "+age);
	}
	public static void methodA(){
		//this.name="name";
	}
	
	//Ĭ�Ϲ��췽��
	public UserDemo() {
		this.name="22222";
	}
	
	//��ڷ���
	public static void main(String[]args){
		UserDemo.methodA();
		
		//1.��ʼ��һ������
		   UserDemo user=new UserDemo();
		//2.�����Խ��и�ֵ
		  // user.name="mars";
		   user.age=12;
		//3.���÷���
		   user.method();
		   System.out.println("user=="+user);
		   
		
		//2.��ʼ��UserDemo����
		   UserDemo user1=new UserDemo();
		   //�����Ը�ֵ
		   user1.name="����";
		   user1.age=18;
		   //���÷���
		   user1.method();
		   System.out.println("user1"+user1);
		
		
		
	}

}

package day09.test;
//�����д���������� �������Ժͷ���

public class Animal {
	private String name;// ����
	private int age; // ����
	private int type; //����  1 è  2�� 3....

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(this);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    //������Ϊ
	public void doEat(){
		//����
		
		System.out.println("�Զ���");
	}
	
	//���췽��
	 public Animal(){
		 System.out.println("����Ĭ�ϵĹ��췽��");
	 }
	
	 public Animal(String name,int age){
		 System.out.println("����������Ĺ��췽��");
		 //����ǰ����������Խ��и�ֵ  
		  this.name=name; //����  this 
		  this.age=age;   //����
		  System.out.println("===="+this);
	 }
	
}

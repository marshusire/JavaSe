package day08.setinit;

import java.util.Arrays;

public class User {
	// ����
	private String name; // ����
	private int age; // ����

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//Ĭ�Ϲ��췽��
	 public User(){ 
	 }
	 public User(String name,int age){
		 //ͨ��this��� ��Ա�����;ֲ������Ķ�����
		  this.name=name;
		  this.age=age;
	 }
	 
	 //��ڷ���
	 public static void main(String[] args) {
	    //��ʼ��һ������ ͬʱ�����������Ը�ֵ   �����ַ�ʽ
		  //1.ͨ��setterע��
		     //1.1��ʼ��һ������
		      User user=new User();
		     //1.2����������Խ��и�ֵ
		      user.setName("mars");
		      user.setAge(18);
		     //1.3.�������Ե�ֵ
		      System.out.println("==name==="+user.name+" age=="+user.age);
		      
		      
		   //2.ͨ�����췽�� �Ե�ǰ��������Խ��и�ֵ
		      User user1=new User("С���",18);
		      System.out.println(user1.getName()+"   "+user1.getAge());
		/**
		 * 
		 * �ܽ᣺ 
		 *    ����ʼ�������ʱ�򣬶�������ԱȽ��ٵ�����£�����ͨ�����췽������������Խ��и�ֵ  ��
		 *    �����������ԱȽ϶����������ͨ��setterע��ķ�ʽ���и�ֵ�������ˡ�
		 */
		      
		 
	 }
	
}

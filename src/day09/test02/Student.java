package day09.test02;

import java.sql.Array;

public class Student {

	//���� 
      String name;//
      int   age;
	
	
	  //��дtoString
       @Override
       public String toString() {
    	return name+"  "+age;
      }
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//1.����һ��student����
		   Student stu=new Student();
		   Student stu1=new Student();
		   System.out.println(stu+"    "+stu1);
		//����̳и������з���
		 //  Object stu2=stu.clone();
		  // System.out.println(stu+"  "+stu2);
		   
		   //�ж����������Ƿ����   ���== �ڴ������Ƿ����
		   if(stu.equals(stu1)){
			   System.out.println("���");
		   }else{
			   System.out.println("�����");
		   }
		   String str=new String("123");
		   String str1=new String("123");
		   if(str1.equals(str)){
			  System.out.println("�������");
		   }
		   stu.name="mars";
		   stu.age=11;
		   String msg=stu.toString();
		   System.out.println(msg);
		   
		   if(stu instanceof Array){
			   System.out.println("��");
		   }
		
		
	}
}

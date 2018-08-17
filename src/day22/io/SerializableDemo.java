package day22.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//�������Ҫ֧�����л����� ����ʵ�ֽӿ� Serializable
class Student implements Serializable{
   String name;
   int  age;
}



public class SerializableDemo {
   
	//���л�������  ͨ�����뼼�� ת���� ����������  �洢����
	 public static void writeObj() throws FileNotFoundException, IOException{
		 //1.����һ��ObjectOutputStream����
		  ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("data"));
		 //2.д����
		   //д�������������
		    out.writeChar('A');;
		    out.writeBoolean(true);
		   //�Զ����������
		    Student stu=new Student();
		    stu.name="mars1";
		    stu.age=12;
		   //д����� ��Ҫ�Զ�����ж������л�����
		    out.writeObject(stu);
		   //ˢ��
		    out.flush();
		 //3.�ر���
		    out.close();
	 } 
	
	
	
	//�����л��������������� ͨ�����뼼�� ��������ԭ��ԭ���Ķ���	
	 public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
		//1.����һ��objectInputstream����
		   ObjectInputStream input=new ObjectInputStream(new FileInputStream("data"));
		 
		//2.��ȡ���� ���մ��˳����ж�ȡ
		    //��ȡchar
		     System.out.println(input.readChar());
		    //��ȡboolean����
		     System.out.println(input.readBoolean());
		    //��ȡstudent  �������л�����
		     Student stu=(Student)input.readObject();
		     System.out.println(stu.name +"  "+stu.age);
		//3.�ر���  
		     input.close();
	 }
	
	
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
          writeObj();//�������л�
          readObj(); //�������л�
	}

}

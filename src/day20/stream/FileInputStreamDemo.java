package day20.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//������  �������ⲿ������  ��ȡ�� �ڴ���
public class FileInputStreamDemo {
   
	public static void main(String[] args) throws IOException {
	 //1.����һ�������ֽ������󣬹���ָ��Ҫ�������ļ�������   
		//1.1�����ļ�·��
		 String path="test.txt";//����Դ
		//1.2��ʼ������������
		 //FileInputStream input=new FileInputStream(new File(path));
		  FileInputStream input=new FileInputStream(path);
      //2.��ȡ����   
		  //2.1����ʣ����ֽ�
		 /*  System.out.println(input.available());
		   //2.2��ȡһ���ڵ�
		   System.out.println(input.read());
		   System.out.println(input.available());//���пɶ�ȡ���ֽ���
		   
		   //����������
		  /* byte[]b=new byte[input.available()];
		   int len=input.read(b);//�����е����ݶ�ȡ�� byte������,���ر��ν��յ��ֽ���
		   System.out.println(len);*/
		    byte[]b=new byte[6];
		   //��ȡ����==-1˵���Ѿ���ȡ���ļ���β����
		       int len=0;
		       while((len=input.read(b))!=-1){
		    	  //������յ�����  ��b������
		    	    String tmp=new String(b, 0, len);
		    //
		    	    System.out.println(tmp); 	   
		       }
		   
      //3.�ر���
		  input.close();

	}

}

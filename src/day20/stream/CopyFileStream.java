package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {

	/***
	 * �����ļ�
	 *  1.�Ƚ��ļ���ȡ���ڴ���
	 *  2.���ڴ��е����� ��д�뵽ָ�����ļ�
	 * 
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		//1.��ʼ��һ������������  ,����Ҫ�������ļ�������
		   FileInputStream input=new FileInputStream("test.txt");
		   //��ʼ��һ����������󣬹���Ҫд���ļ�������
		   FileOutputStream outpu=new FileOutputStream("c:\\Users\\Administrator\\Desktop\\111.txt");
		   
	    //2.��ȡ�ļ�
		  //2.1��ʼ��һ����������
		   byte[]b=new byte[10];
		  //2.2��ȡ����
		   int len=0;
		   while((len=input.read(b))!=-1){
			   //��������  д���������
			   outpu.write(b,0,len);
		   }
		   //ˢ�뵽����
		       outpu.flush();
		
		//3.�ر���
             input.close();
             outpu.close();
	}

}

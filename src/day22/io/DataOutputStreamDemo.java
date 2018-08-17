package day22.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
     /**
      *  DataOutputStream 
      *   �����������  ���Խ�java��������ֱ��д�뵽�ļ���
      * 
      * 
      * @param args
     * @throws IOException 
      */
	public static void main(String[] args) throws IOException {
	    //1.��ʼ��һ��DataOutputStream����
		 DataOutputStream out=new DataOutputStream(new FileOutputStream("data.txt"));
		
		 //2.д������
		   out.writeBoolean(true);//д��һ��boolean ֵ����
		   out.writeByte(3);;//д��һ���ֽ�����
		   out.writeChar('A');//д��һ���ַ�����
		   out.writeDouble(12.4);//д��һ��double����
		   out.writeFloat(3.31f);//д��һ��float����
		   out.writeLong(1111L);//д��һ��long����
		   out.writeShort(32);//д��һ��short����
		   out.writeUTF("hello");  //д��һ��String���� ������UTF-8
		 
		   //��������
		   out.flush();
		   
		 //3.�ر�������
		   out.close();
		 
		
		
	}

}

package day22.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {
       /**
        * DataInputStream
        *  ������������   ���Զ�ȡ�ļ�  ���ļ��ж�Ӧ�������ͻ�ԭ��Java�Ļ�����������
        * 
        * 
        * 
        * @param args
     * @throws IOException 
        */
	
	
	public static void main(String[] args) throws IOException {
		//1.��ʼ��һ��DataInputStream����
		 DataInputStream  input=new DataInputStream(new FileInputStream("data.txt"));
		
		//2.��ȡ���� ���밴�մ��˳������ȡ
		 System.out.println(input.readBoolean());//boolean
		 System.out.println(input.readByte());//byte
		 System.out.println(input.readChar());//char
		 System.out.println(input.readDouble());//double
		 System.out.println(input.readFloat()); //float
		 System.out.println(input.readLong());  //long
		 System.out.println(input.readShort()); //short
		 System.out.println(input.readUTF());//utf-8
		 
		//3.�ر���
		 input.close();

	}

}

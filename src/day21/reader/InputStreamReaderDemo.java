package day21.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	/**
	 * InputStreamReader �Ƕ�ȡ�ַ���
	 *  ��ȡ�ļ������ַ�Ϊ��λ,�ײ㻹���ֽ���
	 *
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
	    //1.����һ���ַ�������
		   //1.1����һ���ֽ������� ��������Ҫ�������ļ�·�������ֽ���
		  FileInputStream in=new FileInputStream("test.txt");
		   //1.2�����ַ������� �����ֽ���
		  InputStreamReader reader=new InputStreamReader(in);
		//2.��ȡ�ַ�
		 /* //1.��ȡ�����ַ�
		   System.out.println(reader.read());
		 //3.��ȡһ���ַ������ַ�������ַ������� ������
		     char[]cbuf=new char[10];
		     int len=reader.read(cbuf);
		     System.out.println(len);
		 //4.�����ж�ȡһ�����ȵ��ַ�����Ż���������ĳ��λ�ÿ�ʼ  �����Ƕ���
		    // reader.read(cbuf, offset, length)
		    */
		    //��ʼ��һ��������
		       char[]cbuf=new char[10];
		    //���ý��յĳ���
		       int len=0;
		    //ѭ����ȡ����
		       while((len=reader.read(cbuf))!=-1){
		    	   //������յ�����  ���ַ����� ת���� String 
		    	   System.out.println(new String(cbuf, 0, len));
		       }
		  
		//3.�ر���
		     in.close();
             reader.close();
		
	}

}

package day20.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileOutputStreamDemo {
  //���������������ڴ��е����� ��д�뵽һ��ָ�����ļ��л��͵�����
	public static void main(String[] args) throws IOException {
		//1.����һ����������󣬶����������ļ� ͬʱ�Զ�����
		   //1.1����һ���ļ�
		     String name="test.txt";
		   //1.2��������   boolean׷�ӵ���˼��true ׷��  false ��׷��
		     FileOutputStream out=new FileOutputStream(name,false);//ÿ�����ݸ���
		     
		//2.���ڴ��е����� д�뵽����
		    //1.������д�뵽����
		     String str="����й�";
		    //2.��String����ת���� byte����
		     byte[]b=str.getBytes("GBK");
		    //3.д���� 
		     out.write(b);
		   //out.write(b, 0,b.length);//��b�����д�0 ��ʼ��λ�� ����ĳ��� д�뵽ָ���ļ���
		   //out.write(12);//��һд��һ���ֽ�
		//3.ǿ��ˢ�����е�����,���ļ���
		     out.flush();
		//4.�ر���
	   	     out.close();
	}
	
	
	
}

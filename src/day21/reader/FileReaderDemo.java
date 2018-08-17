package day21.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileReaderDemo {
   /**
    * FileReader �� inputStreamReader������
    *   ֻ��ʹ��ƽ̨Ĭ�ϵ��ַ������ʽ
    * 
    * @param args
 * @throws IOException 
    */
	 
	
	public static void main(String[] args) throws IOException {
	  //1.����һ��FileReader����
		FileReader reader=new FileReader("123.txt");
		
      //2.��ȡ�ַ�
		  //2.1����һ���ַ�������
		  char[]cbuf=new char[10];
		  //2.2�������ճ��� һ������
		  int len;
		  //2.3ѭ������ȡ�ַ�
		  while((len=reader.read(cbuf))!=-1){
			 //�����ַ�
			  System.out.println(new String(cbuf,0,len));
			  
		  }
	
	  //3.�ر���
		  reader.close();
		  
		
		
		
	}
	
	
}

package day21.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
   /**
    * BufferedReader �� reader������
    *  
    *  �����ص����ÿ�ο��Զ�ȡһ�� ��һ�еĶ������ ��ȡ�����з���һ�н���
 * @throws IOException 

    */
	
	public static void main(String[] args) throws IOException {
	  //1.��ʼ��һ��BufferedReader����
		//ʹ���ֶ����ñ����ʽ
		  //InputStreamReader in=new InputStreamReader(in, charsetName);
		//ʹ��Ĭ�ϵı����ʽ
		   FileReader in=new FileReader("123.txt");
		   BufferedReader r=new BufferedReader(in);//��Ҫһ��reader��һ������
	  //2.��ȡ����
		   //��ȡ�����ַ�
		  // System.out.println(r.read());
		   //��ȡ����ַ�
		   //char[]cbuf=new char[10];
		   //System.out.println(r.read(cbuf));
		   //��ȡһ���ַ��� �������з�����
		   //String str=r.readLine();
		   //System.out.println(str);
		   //������ȡʣ�����е��ı�
		    //1.����һ��Str ��������һ������
		   String str=null;
		   while((str=r.readLine())!=null){
			   //��������
			   System.out.println(str);
		   }
		   
	  //3.�ر���  	
		   in.close();
		   r.close();
		   
		   
		
	}
	
	
	
}

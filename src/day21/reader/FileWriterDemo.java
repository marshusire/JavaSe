package day21.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

   //FileWirter ��OutPutStreamWriter������	
	public static void main(String[] args) throws IOException {
	   //1.��ʼ��һ��FileWriter����	
         FileWriter writer=new FileWriter("333.txt",false);
	   //2.д����
         writer.write("���ǵ�һ����fileWirter��");
         
         writer.flush();//ˢ�뵽����
       //3.�ر���  
         writer.close();
         
		
	}

}

package day21.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {
    /**
     * BufferedWriter ��writer������
     *   1.����д��һ������ ���Ի���
     *  
     * @param args
     * @throws IOException 
     */
	public static void main(String[] args) throws IOException {
		//1.����һ��BufferedWriter����
		   //1.1����һ��Writer������� ���������ַ��ı��뼯 
		   // OutputStreamWriter out=new OutputStreamWriter(out, charsetName);
		     //Ĭ��ƽ̨�ı��뼯
		     FileWriter out=new FileWriter("666.txt",true);
		
		     BufferedWriter w=new BufferedWriter(out);
		     
		//2.д��һ������
		     String str="�㳤����ÿ�";
		     w.write(str);//���ַ���д�뵽��
		     w.newLine();//д��һ�����з�
		     w.flush();//ǿ��ˢ��
		
		//3.�ر���
             out.close();
             w.close();
	}

}

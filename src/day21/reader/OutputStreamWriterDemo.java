package day21.reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    //д���ַ���   
	public static void main(String[] args) throws IOException {
	    //1.��ʼ��һ�������ַ�������
		   //1.1����һ���ֽ������󣬹���Ҫ�������ļ� ����
		   FileOutputStream out=new FileOutputStream("123.txt", true);   
		   //1.2�����ַ������󣬹����ֽ���
		   OutputStreamWriter w=new OutputStreamWriter(out);
        //2.д����
		    //1.����д�����ַ�
		    w.write('a');
		    //2.ˢ��һ���ַ�����
		    char[]cbuf={'b','c','d','e','f'};
		    w.write(cbuf);
		    //3.ˢ������ ���ĸ�λ�ÿ�ʼ�����ĸ�λ�ý���
		    w.write(cbuf,0,4);
		    //4.ˢ��һ���ַ���
		    w.write("���");
		   //ˢ�����
		    w.flush();
		//3.�ر���
            out.close();
            w.close();
	}

}

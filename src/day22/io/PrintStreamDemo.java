package day22.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    /**
     * PrintStream ��ӡ�����
     *  ��������ֽ���������ͬ������������ݣ��Դ����з�
     * �����������ַ� ʹ��PrintWriter �������ñ����ʽ
     * @param args
     * @throws FileNotFoundException 
     */
	public static void main(String[] args) throws FileNotFoundException {
		//1.����һ��PrintStream����
		 PrintStream st=new PrintStream(new FileOutputStream("112.txt"),false);
		//2.д������ //��ӡ���
		 //��ӡ����������й���
		 st.print(true);
		 st.print(123);
		 st.print(12.3f);
		 st.print("he");
		 //��ӡ��� �����й���
         st.println(false);
         st.println("dddd");
         st.println("ffff");
		//3.�ر���  
		 st.close();
		 
	}

}

package day22.process;

import java.io.IOException;

public class ProcessDemo {
     /**
      * Java ���������̵����ַ�ʽ
      *    1.ͨ��runtime��
      *    2.ͨ��ProcessBuilder ��
      * 
      * @param args
     * @throws IOException 
      */
	
	public static void main(String[] args) throws IOException {
	/*	//1.ͨ������ʱ  
		  Runtime time=Runtime.getRuntime();
		//2.ִ��Ҫ�򿪵Ľ���
		  time.exec("C:\\Program Files (x86)\\Netease\\CloudMusic\\cloudmusic.exe");
    */
		//2.ͨ��������������������
		   ProcessBuilder builder=new ProcessBuilder("notepad");
		//��������
		   builder.start();
		
	}

}

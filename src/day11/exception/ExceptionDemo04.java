package day11.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionDemo04 {
	
	/**
	 * Throw �ؼ���  �׳�һ���쳣
	 * һ���ֶ��׳�һ���쳣 ��throwһ�´��뽫����ִ��  ������return
	 * 
	 * throw �쳣����;
	 * ��ʹ��throw ��ʱ�� ���������쳣����
	 * 
	 * */
	
	
	public static void methodA() throws Exception{
		System.out.println("��ö�");
		 //����һ���쳣����
		   Exception e=new Exception("�쳣����Ϣ");
		  //�׳�һ���쳣
		    throw e;
		   // System.out.println("��˵�ĺܶ�");
	}
	
	
	//�����쳣  ���Ǳ����ʱ������������쳣����
	public static void methodB() throws FileNotFoundException{
		//�ļ�����
		File file=new File("");
		//2.���ļ�
		FileInputStream in=new FileInputStream(file);	
	}
	
	//�п���������ʱ�����쳣��Ϣ ������ʱ�쳣 Ҳ����Ҫ���쳣���д���
	public void methodC(){
		int a=10;
		int b=0;
		System.out.println("a/b="+a/b);	
	}
	
	
	public static void main(String[] args) {
		//
		 try {
			methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	

}

package day20.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//输入流  将程序外部的数据  读取到 内存中
public class FileInputStreamDemo {
   
	public static void main(String[] args) throws IOException {
	 //1.创建一个输入字节流对象，关联指定要操作的文件，打开流   
		//1.1声明文件路径
		 String path="test.txt";//数据源
		//1.2初始化输入流对象
		 //FileInputStream input=new FileInputStream(new File(path));
		  FileInputStream input=new FileInputStream(path);
      //2.读取操作   
		  //2.1看流剩余的字节
		 /*  System.out.println(input.available());
		   //2.2读取一个节点
		   System.out.println(input.read());
		   System.out.println(input.available());//流中可读取的字节数
		   
		   //声明缓冲区
		  /* byte[]b=new byte[input.available()];
		   int len=input.read(b);//将流中的数据读取到 byte数组中,返回本次接收的字节数
		   System.out.println(len);*/
		    byte[]b=new byte[6];
		   //读取长度==-1说明已经读取到文件的尾部了
		       int len=0;
		       while((len=input.read(b))!=-1){
		    	  //处理接收的数据  从b数组中
		    	    String tmp=new String(b, 0, len);
		    //
		    	    System.out.println(tmp); 	   
		       }
		   
      //3.关闭流
		  input.close();

	}

}

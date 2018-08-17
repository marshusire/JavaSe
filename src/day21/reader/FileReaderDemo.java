package day21.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileReaderDemo {
   /**
    * FileReader 是 inputStreamReader的子类
    *   只能使用平台默认的字符编码格式
    * 
    * @param args
 * @throws IOException 
    */
	 
	
	public static void main(String[] args) throws IOException {
	  //1.创建一个FileReader对象
		FileReader reader=new FileReader("123.txt");
		
      //2.读取字符
		  //2.1声明一个字符缓冲区
		  char[]cbuf=new char[10];
		  //2.2声明接收长度 一个变量
		  int len;
		  //2.3循环来读取字符
		  while((len=reader.read(cbuf))!=-1){
			 //处理字符
			  System.out.println(new String(cbuf,0,len));
			  
		  }
	
	  //3.关闭流
		  reader.close();
		  
		
		
		
	}
	
	
}

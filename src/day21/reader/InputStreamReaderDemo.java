package day21.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	/**
	 * InputStreamReader 是读取字符类
	 *  读取文件是以字符为单位,底层还是字节流
	 *
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
	    //1.创建一个字符流对象。
		   //1.1创建一个字节流对象 ，关联到要操作的文件路径，打开字节流
		  FileInputStream in=new FileInputStream("test.txt");
		   //1.2创建字符流对象 关联字节流
		  InputStreamReader reader=new InputStreamReader(in);
		//2.读取字符
		 /* //1.读取单个字符
		   System.out.println(reader.read());
		 //3.读取一串字符，把字符存放在字符数组中 缓冲区
		     char[]cbuf=new char[10];
		     int len=reader.read(cbuf);
		     System.out.println(len);
		 //4.从流中读取一定长度的字符，存放缓冲区，从某个位置开始  长度是多少
		    // reader.read(cbuf, offset, length)
		    */
		    //初始化一个缓冲区
		       char[]cbuf=new char[10];
		    //设置接收的长度
		       int len=0;
		    //循环读取数据
		       while((len=reader.read(cbuf))!=-1){
		    	   //处理接收的数据  将字符数组 转换成 String 
		    	   System.out.println(new String(cbuf, 0, len));
		       }
		  
		//3.关闭流
		     in.close();
             reader.close();
		
	}

}

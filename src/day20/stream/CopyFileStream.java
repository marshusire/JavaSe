package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {

	/***
	 * 复制文件
	 *  1.先将文件读取到内存中
	 *  2.将内存中的数据 ，写入到指定的文件
	 * 
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		//1.初始化一个输入流对象  ,关联要操作的文件，打开流
		   FileInputStream input=new FileInputStream("test.txt");
		   //初始化一个输出流对象，关联要写的文件，打开流
		   FileOutputStream outpu=new FileOutputStream("c:\\Users\\Administrator\\Desktop\\111.txt");
		   
	    //2.读取文件
		  //2.1初始化一个缓冲数组
		   byte[]b=new byte[10];
		  //2.2读取数据
		   int len=0;
		   while((len=input.read(b))!=-1){
			   //处理数据  写入多少数据
			   outpu.write(b,0,len);
		   }
		   //刷入到流中
		       outpu.flush();
		
		//3.关闭流
             input.close();
             outpu.close();
	}

}

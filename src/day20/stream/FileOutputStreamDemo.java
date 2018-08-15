package day20.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileOutputStreamDemo {
  //输出流：将计算机内存中的数据 ，写入到一个指定的文件中或发送到网络
	public static void main(String[] args) throws IOException {
		//1.创建一个输出流对象，对象关联输出文件 同时自动打开流
		   //1.1声明一个文件
		     String name="test.txt";
		   //1.2创建对象   boolean追加的意思　true 追加  false 不追加
		     FileOutputStream out=new FileOutputStream(name,false);//每次内容覆盖
		     
		//2.将内存中的数据 写入到流中
		    //1.将数据写入到流中
		     String str="你好中国";
		    //2.将String类型转换成 byte数组
		     byte[]b=str.getBytes("GBK");
		    //3.写操作 
		     out.write(b);
		   //out.write(b, 0,b.length);//将b数组中从0 开始的位置 数组的长度 写入到指定文件中
		   //out.write(12);//单一写入一个字节
		//3.强制刷入流中的数据,到文件中
		     out.flush();
		//4.关闭流
	   	     out.close();
	}
	
	
	
}

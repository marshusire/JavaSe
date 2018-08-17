package day22.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
     /**
      *  DataOutputStream 
      *   二进制输出流  可以将java基本类型直接写入到文件中
      * 
      * 
      * @param args
     * @throws IOException 
      */
	public static void main(String[] args) throws IOException {
	    //1.初始化一个DataOutputStream对象
		 DataOutputStream out=new DataOutputStream(new FileOutputStream("data.txt"));
		
		 //2.写入数据
		   out.writeBoolean(true);//写入一个boolean 值类型
		   out.writeByte(3);;//写入一个字节类型
		   out.writeChar('A');//写入一个字符类型
		   out.writeDouble(12.4);//写入一个double类型
		   out.writeFloat(3.31f);//写入一个float类型
		   out.writeLong(1111L);//写入一个long类型
		   out.writeShort(32);//写入一个short类型
		   out.writeUTF("hello");  //写入一个String类型 编码用UTF-8
		 
		   //输入数据
		   out.flush();
		   
		 //3.关闭数据流
		   out.close();
		 
		
		
	}

}

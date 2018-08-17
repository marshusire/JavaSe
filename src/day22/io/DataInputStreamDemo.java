package day22.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {
       /**
        * DataInputStream
        *  二进制输入流   可以读取文件  将文件中对应数据类型还原成Java的基本数据类型
        * 
        * 
        * 
        * @param args
     * @throws IOException 
        */
	
	
	public static void main(String[] args) throws IOException {
		//1.初始化一个DataInputStream对象
		 DataInputStream  input=new DataInputStream(new FileInputStream("data.txt"));
		
		//2.读取数据 必须按照存的顺序来读取
		 System.out.println(input.readBoolean());//boolean
		 System.out.println(input.readByte());//byte
		 System.out.println(input.readChar());//char
		 System.out.println(input.readDouble());//double
		 System.out.println(input.readFloat()); //float
		 System.out.println(input.readLong());  //long
		 System.out.println(input.readShort()); //short
		 System.out.println(input.readUTF());//utf-8
		 
		//3.关闭流
		 input.close();

	}

}

package day21.reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    //写出字符流   
	public static void main(String[] args) throws IOException {
	    //1.初始化一个对象字符流对象
		   //1.1创建一个字节流对象，关联要操作的文件 打开流
		   FileOutputStream out=new FileOutputStream("123.txt", true);   
		   //1.2创建字符流对象，关联字节流
		   OutputStreamWriter w=new OutputStreamWriter(out);
        //2.写操作
		    //1.可以写当个字符
		    w.write('a');
		    //2.刷入一个字符数组
		    char[]cbuf={'b','c','d','e','f'};
		    w.write(cbuf);
		    //3.刷入数组 从哪个位置开始，到哪个位置结束
		    w.write(cbuf,0,4);
		    //4.刷入一个字符串
		    w.write("你好");
		   //刷入操作
		    w.flush();
		//3.关闭流
            out.close();
            w.close();
	}

}

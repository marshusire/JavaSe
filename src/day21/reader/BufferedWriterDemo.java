package day21.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {
    /**
     * BufferedWriter 是writer的子类
     *   1.可以写入一行数据 可以换行
     *  
     * @param args
     * @throws IOException 
     */
	public static void main(String[] args) throws IOException {
		//1.创建一个BufferedWriter对象
		   //1.1创建一个Writer子类对象 可以设置字符的编码集 
		   // OutputStreamWriter out=new OutputStreamWriter(out, charsetName);
		     //默认平台的编码集
		     FileWriter out=new FileWriter("666.txt",true);
		
		     BufferedWriter w=new BufferedWriter(out);
		     
		//2.写入一行数据
		     String str="你长得真好看";
		     w.write(str);//将字符串写入到流
		     w.newLine();//写入一个换行符
		     w.flush();//强制刷入
		
		//3.关闭流
             out.close();
             w.close();
	}

}

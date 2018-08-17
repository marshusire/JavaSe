package day21.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
   /**
    * BufferedReader 是 reader的子类
    *  
    *  最大的特点就是每次可以读取一行 ，一行的定义就是 读取到换行符算一行结束
 * @throws IOException 

    */
	
	public static void main(String[] args) throws IOException {
	  //1.初始化一个BufferedReader对象
		//使用手动设置编码格式
		  //InputStreamReader in=new InputStreamReader(in, charsetName);
		//使用默认的编码格式
		   FileReader in=new FileReader("123.txt");
		   BufferedReader r=new BufferedReader(in);//需要一个reader的一个对象
	  //2.读取数据
		   //读取单个字符
		  // System.out.println(r.read());
		   //读取多个字符
		   //char[]cbuf=new char[10];
		   //System.out.println(r.read(cbuf));
		   //读取一行字符串 碰到换行符结束
		   //String str=r.readLine();
		   //System.out.println(str);
		   //持续读取剩下所有的文本
		    //1.声明一个Str 用来接收一行数据
		   String str=null;
		   while((str=r.readLine())!=null){
			   //处理数据
			   System.out.println(str);
		   }
		   
	  //3.关闭流  	
		   in.close();
		   r.close();
		   
		   
		
	}
	
	
	
}

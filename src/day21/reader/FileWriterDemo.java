package day21.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

   //FileWirter 是OutPutStreamWriter的子类	
	public static void main(String[] args) throws IOException {
	   //1.初始化一个FileWriter对象	
         FileWriter writer=new FileWriter("333.txt",false);
	   //2.写数据
         writer.write("我是第一个用fileWirter的");
         
         writer.flush();//刷入到流中
       //3.关闭流  
         writer.close();
         
		
	}

}

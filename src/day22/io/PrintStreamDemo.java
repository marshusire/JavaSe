package day22.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    /**
     * PrintStream 打印输出流
     *  可以输出字节流可以向不同的流中输出数据，自带换行符
     * 如果输入的是字符 使用PrintWriter 可以设置编码格式
     * @param args
     * @throws FileNotFoundException 
     */
	public static void main(String[] args) throws FileNotFoundException {
		//1.创建一个PrintStream对象
		 PrintStream st=new PrintStream(new FileOutputStream("112.txt"),false);
		//2.写入数据 //打印输出
		 //打印输出不带换行功能
		 st.print(true);
		 st.print(123);
		 st.print(12.3f);
		 st.print("he");
		 //打印输出 带换行功能
         st.println(false);
         st.println("dddd");
         st.println("ffff");
		//3.关闭流  
		 st.close();
		 
	}

}

package day11.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionDemo04 {
	
	/**
	 * Throw 关键字  抛出一个异常
	 * 一旦手动抛出一个异常 ，throw一下代码将不会执行  类似于return
	 * 
	 * throw 异常对象;
	 * 在使用throw 的时候 必须声明异常类型
	 * 
	 * */
	
	
	public static void methodA() throws Exception{
		System.out.println("你好对");
		 //创建一个异常对象
		   Exception e=new Exception("异常的信息");
		  //抛出一个异常
		    throw e;
		   // System.out.println("你说的很对");
	}
	
	
	//编译异常  就是编译的时候必须必须进行异常声明
	public static void methodB() throws FileNotFoundException{
		//文件操作
		File file=new File("");
		//2.打开文件
		FileInputStream in=new FileInputStream(file);	
	}
	
	//有可能在运行时出现异常信息 ，运行时异常 也是需要对异常进行处理
	public void methodC(){
		int a=10;
		int b=0;
		System.out.println("a/b="+a/b);	
	}
	
	
	public static void main(String[] args) {
		//
		 try {
			methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	

}

package day22.process;

import java.io.IOException;

public class ProcessDemo {
     /**
      * Java 中启动进程的两种方式
      *    1.通过runtime类
      *    2.通过ProcessBuilder 类
      * 
      * @param args
     * @throws IOException 
      */
	
	public static void main(String[] args) throws IOException {
	/*	//1.通过运行时  
		  Runtime time=Runtime.getRuntime();
		//2.执行要打开的进程
		  time.exec("C:\\Program Files (x86)\\Netease\\CloudMusic\\cloudmusic.exe");
    */
		//2.通过进程生成器启动进程
		   ProcessBuilder builder=new ProcessBuilder("notepad");
		//启动进程
		   builder.start();
		
	}

}

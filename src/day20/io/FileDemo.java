package day20.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		//1.拼接字符串路径
		    String path="C:\\Users\\Administrator\\Desktop\\座位.xls";
		//2.将字符串路径  转换成File对象
		    File file=new File(path);
		   //file.getParentFile();
		   //File file1=new File("C:\\Users\\Administrator\\Desktop", "座位.xls");
		   //File file2=new File(new File("C:\\Users\\Administrator\\Desktop"),"座位");
		    
		//3.读取文件属性信息
            //读取文件名称
		    System.out.println("文件名称"+file.getName());
		    //获取文件的绝对路径
		    System.out.println("文件的绝对路径"+file.getAbsolutePath());
		    System.out.println("文件的相对路径"+file.getPath());
		    System.out.println("文件的父目录"+file.getParent());
		    System.out.println("文件分区的大小"+file.getTotalSpace());//返回的是字节   Kb  Mb Gb
		    System.out.println("文件所在分区可用的字节数"+file.getFreeSpace());//返回空间可用的字节数
	        System.out.println("判断文件是否是一个绝对路径"+file.isAbsolute());
	        System.out.println("判断当前文件是否是一个文件"+file.isFile());
	
	}

}

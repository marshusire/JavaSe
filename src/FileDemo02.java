import java.io.File;
import java.io.IOException;

public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		//1.先将文件夹路径  转换成 File 对象
		  File file=new File("c:\\Users\\Administrator\\Desktop");
		  
		  //创建目录
		//System.out.println(file.mkdir()); 只能创建当前目录，不能创建父目录
		//  System.out.println(file.mkdirs());//创建当前目录的同时，如果父目录不存在，会创建父目录
		  
		 //判断文件是否存在
		  System.out.println(file.exists());
		  
         //查看当前文件是否是目录
		  System.out.println(file.isDirectory());
		 //查看当前目录下所有文件
		   String []list=file.list();
		   System.out.println(file.getAbsolutePath());
		   System.out.println(file.getParent());
		  //遍历所有路径
		   for (String string : list) {
			   System.out.println(string);
			   //转成file对象
			  File tmp=new File(file.getAbsolutePath()+File.separator+string);
			  System.out.println(tmp.getPath());
			   // new File(parent, child)
		   }
		  
		   File[]fils=file.listFiles();//将目录下所有的文件转换成文件对象，返回文件对象数组；
		   for (File file2 : fils) {
			  System.out.println(file2.getPath());
		   }
		  
		   //将路径转换成文件对象
		   File file2=new File("C:\\Users\\Administrator\\Desktop\\1233.txt");
		   //创建文件
		   file2.createNewFile();
		   file2.delete();//立即删除
		  // file2.deleteOnExit();//当前虚拟机 停止的时候在删除
		   
		   System.out.println("");
		   
		   //列出当前系统盘符
		   File[]roots=File.listRoots();
		   for (File file3 : roots) {
			System.out.println(file3.getAbsolutePath());
		   }
		   
		   
	}

}

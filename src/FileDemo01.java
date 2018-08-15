import java.io.File;
import java.util.Date;

public class FileDemo01 {

	public static void main(String[] args) {
	   //先将文件路径 转换成文件对象
		 //文件路径分为两种   绝对路径    相对路径
		 //绝对路径：是以盘符为根查找文件 C:\\Users\\Administrator\\Desktop\\123.txt
		 //相对路径：以当前文件夹为跟   .当前目录  ..上级目录
		    File file=new File("git.txt");
		  //获取父目录
		    String path=file.getParent(); //绝对路径可以获取到父目录  相对路径不可以
		    System.out.println(path);
		  //获取当前对象的相对路径
		    System.out.println(file.getPath());
		    System.out.println(file.getAbsolutePath());//绝对路径
		    System.out.println("当前文件大小"+file.length());//   
		    //最后修改的时间
		    long time=file.lastModified();//时间戳 
		    Date date=new Date();
		    date.setTime(time);
		    System.out.println(date);
		    System.out.println("获取文件的名字="+file.getName());
		    System.out.println("判断当前路径是否是一个文件路径"+file.isFile());
		    System.out.println("判断当前路径是否是一个隐藏文件"+file.isHidden());
		    System.out.println("判断当前文件是否是一个可执行的文件"+file.canExecute());
		    System.out.println("判断当前文件是否是一个可读文件 "+file.canRead());
		    System.out.println("判断文件是否可写 "+file.canWrite());
		    //设置文件可读可写
		    //file.setExecutable(executable);//可执行
		    
		    //文件进行重命名
		     // file.renameTo(new File("git.txt"));
		    
	}
}

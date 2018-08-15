import java.io.File;

public class FileDemo03 {
    //遍历C盘下所有的文件

	public static void listFiles(File file){
		//判断file是否是文件
		if(file.isFile()){
			 //判断是否以 txt结尾
			if(file.getName().endsWith("123.txt")){
				System.out.println(file.getPath());
				//更改为 456.txt
				//
				
				File dest=new File("4561.txt");
				dest=new File(file.getParentFile(), "456.txt");
				file.renameTo(dest);
				
			}
			
		  //System.out.println(file.getName());//输出当前文件名	
		}else{
		 //文件夹
		  //获取当前文件夹下所有的文件和目录
		   File[]files=file.listFiles();
		   if(files==null) return;
		  //将文件一个一个取出来 判断是文件夹还是文件
		   for (File file2 : files) {
			   //判断 file2是文件还是文件夹
			   listFiles(file2);
		   }	
		}
	}
	
	
	public static void main(String[] args) {
	//调用方法
		File[]files=File.listRoots();
		for (File file : files) {
			listFiles(file);
		}
		
		
		
	}

}

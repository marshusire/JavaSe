import java.io.File;
import java.io.IOException;

public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		//1.�Ƚ��ļ���·��  ת���� File ����
		  File file=new File("c:\\Users\\Administrator\\Desktop");
		  
		  //����Ŀ¼
		//System.out.println(file.mkdir()); ֻ�ܴ�����ǰĿ¼�����ܴ�����Ŀ¼
		//  System.out.println(file.mkdirs());//������ǰĿ¼��ͬʱ�������Ŀ¼�����ڣ��ᴴ����Ŀ¼
		  
		 //�ж��ļ��Ƿ����
		  System.out.println(file.exists());
		  
         //�鿴��ǰ�ļ��Ƿ���Ŀ¼
		  System.out.println(file.isDirectory());
		 //�鿴��ǰĿ¼�������ļ�
		   String []list=file.list();
		   System.out.println(file.getAbsolutePath());
		   System.out.println(file.getParent());
		  //��������·��
		   for (String string : list) {
			   System.out.println(string);
			   //ת��file����
			  File tmp=new File(file.getAbsolutePath()+File.separator+string);
			  System.out.println(tmp.getPath());
			   // new File(parent, child)
		   }
		  
		   File[]fils=file.listFiles();//��Ŀ¼�����е��ļ�ת�����ļ����󣬷����ļ��������飻
		   for (File file2 : fils) {
			  System.out.println(file2.getPath());
		   }
		  
		   //��·��ת�����ļ�����
		   File file2=new File("C:\\Users\\Administrator\\Desktop\\1233.txt");
		   //�����ļ�
		   file2.createNewFile();
		   file2.delete();//����ɾ��
		  // file2.deleteOnExit();//��ǰ����� ֹͣ��ʱ����ɾ��
		   
		   System.out.println("");
		   
		   //�г���ǰϵͳ�̷�
		   File[]roots=File.listRoots();
		   for (File file3 : roots) {
			System.out.println(file3.getAbsolutePath());
		   }
		   
		   
	}

}

import java.io.File;
import java.util.Date;

public class FileDemo01 {

	public static void main(String[] args) {
	   //�Ƚ��ļ�·�� ת�����ļ�����
		 //�ļ�·����Ϊ����   ����·��    ���·��
		 //����·���������̷�Ϊ�������ļ� C:\\Users\\Administrator\\Desktop\\123.txt
		 //���·�����Ե�ǰ�ļ���Ϊ��   .��ǰĿ¼  ..�ϼ�Ŀ¼
		    File file=new File("git.txt");
		  //��ȡ��Ŀ¼
		    String path=file.getParent(); //����·�����Ի�ȡ����Ŀ¼  ���·��������
		    System.out.println(path);
		  //��ȡ��ǰ��������·��
		    System.out.println(file.getPath());
		    System.out.println(file.getAbsolutePath());//����·��
		    System.out.println("��ǰ�ļ���С"+file.length());//   
		    //����޸ĵ�ʱ��
		    long time=file.lastModified();//ʱ��� 
		    Date date=new Date();
		    date.setTime(time);
		    System.out.println(date);
		    System.out.println("��ȡ�ļ�������="+file.getName());
		    System.out.println("�жϵ�ǰ·���Ƿ���һ���ļ�·��"+file.isFile());
		    System.out.println("�жϵ�ǰ·���Ƿ���һ�������ļ�"+file.isHidden());
		    System.out.println("�жϵ�ǰ�ļ��Ƿ���һ����ִ�е��ļ�"+file.canExecute());
		    System.out.println("�жϵ�ǰ�ļ��Ƿ���һ���ɶ��ļ� "+file.canRead());
		    System.out.println("�ж��ļ��Ƿ��д "+file.canWrite());
		    //�����ļ��ɶ���д
		    //file.setExecutable(executable);//��ִ��
		    
		    //�ļ�����������
		     // file.renameTo(new File("git.txt"));
		    
	}
}

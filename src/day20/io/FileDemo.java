package day20.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		//1.ƴ���ַ���·��
		    String path="C:\\Users\\Administrator\\Desktop\\��λ.xls";
		//2.���ַ���·��  ת����File����
		    File file=new File(path);
		   //file.getParentFile();
		   //File file1=new File("C:\\Users\\Administrator\\Desktop", "��λ.xls");
		   //File file2=new File(new File("C:\\Users\\Administrator\\Desktop"),"��λ");
		    
		//3.��ȡ�ļ�������Ϣ
            //��ȡ�ļ�����
		    System.out.println("�ļ�����"+file.getName());
		    //��ȡ�ļ��ľ���·��
		    System.out.println("�ļ��ľ���·��"+file.getAbsolutePath());
		    System.out.println("�ļ������·��"+file.getPath());
		    System.out.println("�ļ��ĸ�Ŀ¼"+file.getParent());
		    System.out.println("�ļ������Ĵ�С"+file.getTotalSpace());//���ص����ֽ�   Kb  Mb Gb
		    System.out.println("�ļ����ڷ������õ��ֽ���"+file.getFreeSpace());//���ؿռ���õ��ֽ���
	        System.out.println("�ж��ļ��Ƿ���һ������·��"+file.isAbsolute());
	        System.out.println("�жϵ�ǰ�ļ��Ƿ���һ���ļ�"+file.isFile());
	
	}

}

import java.io.File;

public class FileDemo03 {
    //����C�������е��ļ�

	public static void listFiles(File file){
		//�ж�file�Ƿ����ļ�
		if(file.isFile()){
			 //�ж��Ƿ��� txt��β
			if(file.getName().endsWith("123.txt")){
				System.out.println(file.getPath());
				//����Ϊ 456.txt
				//
				
				File dest=new File("4561.txt");
				dest=new File(file.getParentFile(), "456.txt");
				file.renameTo(dest);
				
			}
			
		  //System.out.println(file.getName());//�����ǰ�ļ���	
		}else{
		 //�ļ���
		  //��ȡ��ǰ�ļ��������е��ļ���Ŀ¼
		   File[]files=file.listFiles();
		   if(files==null) return;
		  //���ļ�һ��һ��ȡ���� �ж����ļ��л����ļ�
		   for (File file2 : files) {
			   //�ж� file2���ļ������ļ���
			   listFiles(file2);
		   }	
		}
	}
	
	
	public static void main(String[] args) {
	//���÷���
		File[]files=File.listRoots();
		for (File file : files) {
			listFiles(file);
		}
		
		
		
	}

}

package day15.string;

import java.io.UnsupportedEncodingException;

public class StringDemo01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	  //1.����һ���ַ��� ͨ�����췽��	
		String str=new String();//����һ�����ַ���
		System.out.println(str.isEmpty());//�ж��ַ����Ƿ���һ���մ�""
		System.out.println(str.length());//��ȡ�ַ����ĳ���
		
		byte[]b={1,3,4,5};
		
		str=new String(b);//��byte������ת��һ���ַ���
		System.out.println(str);
		str=new String(b,"UTF-8");//ָ�������ʽ
		System.out.println(str);
		char[]c={'a','b','c','d','e'};
		str=new String(c,1,4); //������ c ���±�1��ʼ ��ȡ����4 ת��String����
		System.out.println(str);
		
		 char cr= str.charAt(0);//��ȡָ�������� char�ַ�
		 System.out.println(cr);
		
		//����һ������  ��ʾ�ַ��� С�� ��һ���ַ��� ����0 ���       ����1
		 int result=str.compareTo("ebcd");   //�Ƚ��ַ���   ����(����)  ���ڣ�0��  С��(����)
		 result=str.compareToIgnoreCase("BCDE");
		 System.out.println(result);
		
		//�ж��ַ����Ƿ����ĳ���ַ���
		  System.out.println(str.contains("bc"));
		  System.out.println(str.equalsIgnoreCase("BcdE"));//�Ƚ��ַ��� �����ִ�Сд
		  System.out.println(str.equals("BCde"));//�Ƚ��ַ������ִ�Сд
		
		  //��̬���� ��char ����ת����String
		  str=String.copyValueOf(c);
		  System.out.println(str);
		  
		  //�ж��ַ������ѽ�β
		  System.out.println(str.endsWith("de"));
	      //��ĳ���ַ���Ϊǰ׺
		  System.out.println(str.startsWith("ab"));
		  
		  //�ַ�����ѯ indexof()��ѯ�ַ������ַ�����һ�γ��ֵ�����
		  System.out.println(str.indexOf('b'));
		  System.out.println(str.indexOf("cd"));//�ַ����״γ��ֵ�λ��
		  //���һ�γ��ֵ�λ��
		  System.out.println(str.lastIndexOf('b'));
		  System.out.println(str.lastIndexOf("de"));
		  
		  //�ַ��� Сдת��д  ��дתСд  �����µ��ַ���
		    System.out.println(str.toUpperCase());//ת���ɴ�д
		    System.out.println(str.toLowerCase());//��дת����Сд	
		  
		    
		    //��ȡ�ַ���
		     System.out.println(str.substring(2));//���±�2��ʼ��ȡ�Ӵ�
		     System.out.println(str.substring(1, 3));//���±�1��ʼ��ȡ �� �±�������[1,3)
		 
		    //�ָ��ַ��� ����һ������
		       str="�����������,�������������,�һ�һ�����䲻����һƬ�Ʋ�";
		       String list[]=str.split(",");
		       for (String string : list) {
				System.out.println(string);
			 }
		    
		    //�滻
		       System.out.println(str.replace("����", "ŤŤ"));
		    
		
	}
	
	
	
}

package day15.string;

public class StringDemo {

	public static void main(String[] args) {
	   //1.�����ַ������ַ�ʽ
		 String str="ABCD"; //������
	    //2ͨ�����췽������һ������  //���з�����ڴ�
		 String str1=new String("ABCD");
		//3.
		 String str2="ABC";
		//4.�ϲ��ַ��� ���з����ڴ�
		 String str3=str2+"D";  //�µĶ��� ֻ���ڶ���
		//5.�ϲ��ַ���
		 String str4="AB"+"CD";
		 
		//String ��Ҫ�����ڴ�ĵط�������  1.����  2������
		 //������  �洢���ǳ��� �����ڱ���Ķ��Ѿ�����Щ���ݴ洢�ڳ�������
		 //������new Sting������  ƴ�ӵ��µ��ַ�
		 
		 //�ַ������бȽϵ�ʱ�� == �Ƚϵ������õ�ַ ���
		 if(str4==str){
			 System.out.println("���");
		 }else{
			 System.out.println("�����");
		 }
		 //equals �ȽϱȽϵ��������Ƿ���� �����ڴ� 
		 if(str.equals(str3)){
			 System.out.println("�������");
		 }
		 
		 //�ж�һ���ַ��Ƿ���ڳ�����һ��Ҫ�ó����ͱ������бȽ�
		 String str5=null;
		 if("123".equals(str5))
		//�жϵ�ַ�Ƿ�Ϊ��
		 if(str5==null)
			 System.out.println("�жϵ�ַ���� �Ƿ�Ϊ��");
        //�ж������Ƿ�Ϊ��
		 if("".equals(str5)){
			 System.out.println("�ж������Ƿ�Ϊ��");
		 }
		  System.out.println(str);

	}

}

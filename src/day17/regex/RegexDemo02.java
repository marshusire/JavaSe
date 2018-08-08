package day17.regex;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo02 {

	public static void main(String[] args) {
	   //1.����һ��������ʽ
		 String reg="1[3578]\\d{9}";//����
		 String str="18838113607";//Ҫƥ����ַ���
		 boolean r=str.matches(reg);
		 System.out.println(r);
		
	   //������ʽ ƥ������ʽ��
		 //1.ͨ�� reg�����ַ����� ����һ��Patter����
		   Pattern p=Pattern.compile(reg);
		 //2.����Ҫ�������ַ�������ȡһ��ƥ��������
           Matcher m=p.matcher(str);
         //3.ƥ���ַ��Ƿ�Ϸ�
           System.out.println(m.matches());
         //4.�滻�ַ���
           System.out.println(m.replaceAll("beautiful"));
        
         //5.���Ҫ�ָ��ַ���
           Pattern p1=Pattern.compile("3");//����ת���ɶ���
           String strs[]=p1.split("18838113607");//Ҫ�ָ��Ǹ��ַ���
           for (String string : strs) {
			System.out.println(string);
		   }
           
        /**
         * ��Ĳ���
         * �� һ��С����() 
         * (A(B(C(D)))(E))
         *  1. ABCDE
         *  2. bcd
         *  3. CD
         *  4. D
         *  5. E
         */
           
         str="18838113607";//�������ַ���   
         //������ ����
         reg="(1)([3578])(\\d{9})";
         //������ת����Patter����
         Pattern p2=Pattern.compile(reg);
       //2����Ҫ�������ַ��� ����һ��Matche����
         Matcher m1=p2.matcher(str);
         //ƥ��ɹ�
         //System.out.println(m1.matches());
       //3.������
         // m1.find();//�����Ƿ��и����������
          System.out.println(m1.groupCount());//�����������
             m1.find();//������
          //while(){
             System.out.println(m1.group());//Ĭ�ϻ�ȡ��0���Ӵ�
        	 System.out.println("��һ��"+m1.group(1));//��ȡ����Ӵ�
        	 System.out.println("�ڶ���"+m1.group(2));
        	 System.out.println("������"+m1.group(3));
        	 //��ȡ��Ŀ�ʼ���� �ͽ�������
        	 System.out.println(m1.start(2)+"  end"+m1.end(2));
          //} 
         
           
         //���֤ ������֤  
           reg="[1-8]\\d{5}(\\d{4})(\\d{2})(\\d{2})\\d{3}[0-9X]"; 
           String scard="41045719900110587X"; 
         //1�Ƚ�����ת���� Patter����
           p=Pattern.compile(reg);
          //2.����Ҫ�������ַ�������ȡһ��Matcher����
           Matcher m3=p.matcher(scard);
          //3.����
           if(m3.find()){
        	 //������
        	   System.out.println("�ܹ�"+m3.groupCount()+"��");
        	   System.out.println("��һ��"+m3.group(1));//��
        	   System.out.println("�ڶ���"+m3.group(2));//��
        	   System.out.println("������"+m3.group(3));//��
           }
           
           
	}

}

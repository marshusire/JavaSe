package day17.regex;

public class RegexDemo01 {

	public static void main(String[] args) {
		//1.split �ָ�
		  String  str="�����ҽ���,�뿪��������,�뽫�۽ǽ�,������ȥ-����";
		//2.�Զ��Ž��зָ�
          String reg="��";
          reg="(.)\\1";//�Ե��ʽ��зָ�
         //3.�ָ� 
          String[]list=str.split(reg);
          for (String string : list) {
		   System.out.println(string);	
	      }
          
         //�滻 replace
         //�滻����  //ѡ���һ��淶 +1������
          reg="(.)\\1+"; 
          str=str.replaceAll(reg, "Java");
          System.out.println(str);
          
          //ƥ�����֤�ź��� ������
          // ((a)(f)(s)(d)f)d
          
  
          
	}

}

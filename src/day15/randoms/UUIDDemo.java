package day15.randoms;

import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		//UUID ��128λ������� ��֤��ͬһʱ���� ���������������Ψһ��  ���������16���Ʊ�ʾ
		  //1.��ȡһ��UUID����
		  UUID uid=UUID.randomUUID();
		  //2.������ת��String
		  String str=uid.toString();
		  System.out.println(str);
		  //3.ȥ��-
		  String newStr=str.replace("-","");
          System.out.println(newStr);
	}

}

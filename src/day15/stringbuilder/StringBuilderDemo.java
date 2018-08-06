package day15.stringbuilder;

public class StringBuilderDemo {
  /***
   * StringBuilder 
   *  1.�ɱ��ַ��������ݸı����õ�ַ�ǲ���ı�
   *  2.StringBilder �������̰߳�ȫ�ģ���֧��ͬ������д�ٶȱȽϿ죬һ�㲻�����̰߳�ȫ�������
   *    ������ʹ�ø���
   *  3.�����StringBuffer ���ܷ���һ�� Ψһ����Stingbuffer �̰߳�ȫ,֧���߳�ͬ�������ܱȽϵ�
   */
	
	public static void main(String[] args) {
	   //1.��ʼ��һ��StringBuilder����  ���ַ�����
		 StringBuilder str=new StringBuilder();
	   //2.��β��׷���ַ�
		 str.append(true);//��boolean����ת����String����  ���ݸı���,���õ�ַ����
		 str.append('��');//׷��char
		 str.append(0.8); //׷��double����
		 str.append(11);  //׷��һ��int����
		 str.append(new Object());//׷��һ������
		 char[]c={'��','��','��','.'};
		 str.append(c);//׷��һ��char����
		 str.append(c,1,3);//׷��һ������ �������±�λ�ÿ�ʼ- ����
		 str.append("ϲ����", 1, 2);//׷���ַ����� ����λ��0��ʼ ��ȡ�ַ�  �����±�[��ʼ�±�,�����±꣩
	
	   //3.��ָ��λ�ò�������
		 str.insert(1,'d');
		 str.insert(3,"��ƿ��");
	
	   //4.�滻 ��ĳ��λ�ÿ�ʼ �� ĳ��λ�ý���  �滻ָ�����ַ�������ʼλ��,����λ��)
		 str.replace(3,6,"������");		  
		 System.out.println("=="+str);
		
	    //5.��ѯ
		String ss= str.substring(10);//���ַ����� �±�λ�� һֱ��ȡ�����  ����һ��String����
		ss=str.substring(0,3);//��ָ��λ�ÿ�ʼ��ȡһ���ַ���[��ʼλ��,����λ��)
		System.out.println(ss);
		//��ѯָ������λ�õ��ַ�
		 char cc=str.charAt(0);
		 System.out.println(cc);
		//��ѯָ���ַ� �״γ��ֵ�����λ��
		  int index=str.indexOf("��");
		  System.out.println(index);
		//��ѯָ���ַ��� ���һ�γ��ֵ�����λ��
		  index=str.lastIndexOf("��");
		  System.out.println(index);
		 
		//ɾ��ָ�����ַ�
		  str.delete(0, 5);//��ָ��λ�� ɾ��������  [��ʼλ��,����λ��)
		  System.out.println(str);
		  str.deleteCharAt(0);//ɾ��ָ������λ�õ��ַ�
		  System.out.println(str);
		  
		//��ת�ַ���
		  str.reverse();
		  System.out.println(str);
		  
		  

		
	}
	
	
	
	
}

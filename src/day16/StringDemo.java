package day16;

public class StringDemo {
	/**
	 * 1.�û���������6-16λ ��������ĸ�����»��� 
	 * 2.�ֻ�������֤ 
	 * 3.qq������֤
	 * 4.������Բ�,����Ϊ˪˪,��ν������,��ˮһ�����Զ������ָ��ַ�
	 * 
	 * �� 
	 * 
	 * 5.���������ı� �滻����Ϊ��"Java"
	 * 
	 * 
	 * @param args
	 */

	// ��ʼ���û���
	public static boolean regexUser(String name) {
		// �û���������6-16λ ��������ĸ�����»���
		// 1.�ж��ַ�������
		if (name.length() >= 6 && name.length() <= 16) {
			// 2.�ַ����ָ��һ���ַ�����
			char cs[] = name.toCharArray();
			// 3.�����ַ����飬���ַ��� ��ĸ ���� �»��ߵ� ������жԱ�
			// Сд��ĸȡֵ 97-122
			// ��д��ĸȡֵ 65-90
			// �»��� 95
			// ���� 48-57
			for (char c : cs) {
				// �ж��Ƿ��ڷ�Χ��
				if (!(c >= 97 && c <= 122 || c >= 65 && c <= 90 || c >= 48 && c <= 57 || c == 95))
					return false;
			}
			return true;
		}
		return false;
	}


	public static boolean regexPhone(String phone) {
		/**
		 * 1.�ֻ�������֤ 1.����11λ 2.����ȫ�������� 3.��һλ������1 4.�ڶ�λ ������ 3 5 7 8
		 * 
		 */

		// 1.�������жϳ���
		if (phone.length() != 11)
			return false;
		// 2.���ַ��� �ָ���ַ�
		char[] cs = phone.toCharArray();
		// 3.�ж��Ƿ���ȫ���� ͬʱ�ж� ��һλ �͵ڶ�λ��ֵ
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];// ͨ������ȡ��ֵ
			// �ж��Ƿ�������
			if (c >= 48 && c <= 57) {
				// �Ƿ��ǵ�һ��
				if (i == 0 && c != 49)
					return false;
				else if (i == 1) {
					if (!(c == 51 || c == 53 || c == 55 || c == 56))
						return false;
				}
			} else {
				// ��������
				return false;
			}

		}
	    	
		return true;
		
	}
	
	//qq����
	 public static boolean regexQQ(String qq){
		/**
		 *  1.5-10λ
		 *  2.����������
		 *  3.������0��ͷ  
		 */
		 //1.�ж�qq����ĳ���
          if(!(qq.length()>=5&&qq.length()<=10))return false;
		 //2.�ַ��� ת���� �ַ�����
		   char[]cs=qq.toCharArray();
		 //3.�ж��ַ��Ƿ���ȫ���� �ж���λ����Ϊ0
		     //����ȡ���ַ�
		   for (int i = 0; i < cs.length; i++) {
			   char c = cs[i];
			   //�ж��ַ��Ƿ��Ǵ�����
		       if(c>=48&&c<=57){
		    	   //��һλ����Ϊ0
		    	   if(i==0&&c==48){
		    		 return false;
		    	   }
		    	   
		       }else{
		    	   return false;
		       }
		   }
		   
		   //ѭ��ִ�����
		   return true;
	 }
	 
	 public static String replace(String str,String newStr){
		 //1.��strת����char����
		   char[]arr=str.toCharArray();
		  //����һ����ʱ���ַ��� �����ϲ��滻 
		   String tmp="";
		 //2.��������
		   for (int i = 0; i < arr.length; i++) {
			   char c = arr[i];
			  //1.�ж��Ƿ��ǿմ�
			   if(tmp.length()==0){
				   tmp+=c;
			   }else{
				  //tmp���Ƿ����c 
				    if(tmp.contains(""+c)){
				       //���� �ͼ����ϲ�	
				    	tmp+=c;
				       //�ж��Ƿ������һλ
				    	if(i==arr.length-1){
				    		str=str.replace(tmp,newStr);
				    	}
				    }else{//������c
				    	if(tmp.length()>1){//�е���  tmp
				    		//�滻�µ�ֵ
				    	 str=str.replace(tmp, newStr);
				    	}
				        tmp=c+"";//���¸�ֵ
				    }
				   
			   }
		   }
		 
		 
		 return str;
				 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(regexUser("ddddddddddddd_123A"));
		System.out.println(regexPhone("1983&113607"));
		System.out.println(regexQQ("146047566"));
		System.out.println(replace("������ͥԺ�������������", "Java"));
	}

}

package day08;

//����һ���� login ������Ҫ������ʾ��װ ʵ�ֵ�¼����
// ��װ ����ʵ��ϸ�ڸ����أ�ֻ�����������÷���

class Login{
  //����
  //��Ϊ	ʵ�ֵ�¼����
     //�ж��û��� �����Ƿ�Ϸ�	
  private  boolean isOk(String str){
    	 //length();��ȡ�ַ����ĳ���
    	if(str.length()>=6&&str.length()<=16){
    		return true;
    	} 	 
    	return false;
  }
	
  public String login(String userName,String pwd){
	   //1.�ж��û����ǺϷ� 6-16λ
	        if(!isOk(userName)) 
	           return "�û����Ϸ�";
	   //2.�ж������Ƿ�Ϸ� 6-16λ
	        if(!isOk(pwd))
	           return "������Ϸ�������";
	   //3.�ж��Ƿ��¼�ɹ�
	       if(userName.equals("mars12345")&&pwd.equals("123456")){
	    	   return "��¼�ɹ�";
	       }
	       return "�û��������������";  
	       
   }
}


public class LoginDemo {
   /** 
     	��ǰ����Ҫ�����ǵ��õ�¼����
    */	
	
	public LoginDemo() {
		// Ĭ�ϵĹ��췽��
	}
	public static void main(String[] args) {
		//��ڷ���
		//1.��ʼ��һ��Login����
		 Login demo=new Login();
		 
		//2.���õ�¼ ���¼�������߼� �����������н��в���
		 
		 //�ж��û����������Ƿ�Ϸ�
		 //demo.isOk("111111");
		 //demo.isOk("1111111");

		 String msg=demo.login("1111111","2222");
		 System.out.println(msg);

	}

}




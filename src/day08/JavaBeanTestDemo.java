package day08;

public class JavaBeanTestDemo {
  public static void main(String[] args) {
	  //1.��ʼ��һ��JavaBean����
	     UserBean user=new UserBean();
	    // Class.forName(className) 
	  //2.����һ��setter����
	     user.setName("���");
	     user.setAge(12);
	     user.setSex(true);  
	  //3.ȡ������ֵ
	     System.out.println(user.getName()+" "+user.getAge()+" "+user.isSex());
   }
	
	
}

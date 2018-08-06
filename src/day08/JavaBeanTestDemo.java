package day08;

public class JavaBeanTestDemo {
  public static void main(String[] args) {
	  //1.初始化一个JavaBean对象
	     UserBean user=new UserBean();
	    // Class.forName(className) 
	  //2.调用一个setter方法
	     user.setName("多多");
	     user.setAge(12);
	     user.setSex(true);  
	  //3.取出所有值
	     System.out.println(user.getName()+" "+user.getAge()+" "+user.isSex());
   }
	
	
}

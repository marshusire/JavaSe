package day08;

//定义一个类 login 该类主要功能演示封装 实现登录功能
// 封装 将类实现细节给隐藏，只公开公共调用方法

class Login{
  //属性
  //行为	实现登录功能
     //判断用户名 密码是否合法	
  private  boolean isOk(String str){
    	 //length();获取字符串的长度
    	if(str.length()>=6&&str.length()<=16){
    		return true;
    	} 	 
    	return false;
  }
	
  public String login(String userName,String pwd){
	   //1.判断用户名是合法 6-16位
	        if(!isOk(userName)) 
	           return "用户不合法";
	   //2.判断密码是否合法 6-16位
	        if(!isOk(pwd))
	           return "请输入合法的密码";
	   //3.判断是否登录成功
	       if(userName.equals("mars12345")&&pwd.equals("123456")){
	    	   return "登录成功";
	       }
	       return "用户名或者密码错误";  
	       
   }
}


public class LoginDemo {
   /** 
     	当前类主要作用是调用登录功能
    */	
	
	public LoginDemo() {
		// 默认的构造方法
	}
	public static void main(String[] args) {
		//入口方法
		//1.初始化一个Login对象
		 Login demo=new Login();
		 
		//2.调用登录 其登录的所有逻辑 都不在这类中进行操作
		 
		 //判断用户名和密码是否合法
		 //demo.isOk("111111");
		 //demo.isOk("1111111");

		 String msg=demo.login("1111111","2222");
		 System.out.println(msg);

	}

}




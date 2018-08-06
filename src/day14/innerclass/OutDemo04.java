package day14.innerclass;

//声明一个接口
interface MyInterface{
   public void  sendMsg(String msg);
}


public class OutDemo04 {
   
	public static void methodC(MyInterface face){
		face.sendMsg("你好的点点滴滴");
	}
	
	
	/**
    * 匿名内部类: 当前这个类是没有名字
    * 定义的位置： 方法内
    */
      public static void main(String[] args) {
		     //定义了一个匿名的类 类的名字不知道，肯定这个类实现接口
    	   MyInterface face=new MyInterface(){
				//属性
    	    	 
    	    	//方法  
    	    	 void MethodB(){
    	    		 System.out.println("你好");
    	    	 }
				@Override
				public void sendMsg(String msg) {
					// TODO Auto-generated method stub
					System.out.println(msg);
				}
			};
    	  
		   //多态	
           methodC(face);
	  }
	
	
	
}

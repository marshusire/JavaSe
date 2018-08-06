package day13.interface01;

public class TestDemo {
	
	//实现 调用 FirstInterFace 方法
	public static void methodA(FirstInterface face){
		//开锁关锁
		face.lock();
		face.unlock();
		
		
		
	}
	
	//secondinterface
	public static void methodB(SecondInterface face){
		 //调用防火
		face.fireProof();
	}
	public static void methodC(ThirdMyInterFace face){
		//防老王功能
		face.guardWang();
		
	}
	
	

	public static void main(String[] args) {
	   //1.初始化一个安全门
	/*	  SecurityDoor door=new SecurityDoor();
	   //2.调用方法
		  door.openDoor();
		  door.closeDoor();
		  door.lock();
		  door.unlock();
		  door.fireProof();
		  door.guardWang();
		  
	    //初始化另一个安全门
		  SecurityDoor01 door01=new SecurityDoor01();
		  //调用方法
		  door01.openDoor();
		  door01.closeDoor();
		  door01.lock();
		  door01.unlock();
		  door01.fireProof();
		  
		//初始化一个窗户对象
		  Window win=new Window();
		  win.guardWang();
		 */
		/**
		 * 多态的方式 初始化一个对象
		 * */
		  //1.初始化一个对象 将对象赋值给父类类型
		   SecurityDoor face1=new SecurityDoor();//接口也可以看做成一个特殊的父类
		   //2.调用方法
		  /* face1.lock();
		   face1.unlock();
		   Door door=(Door)face1;
		   door.openDoor();
		   door.closeDoor();
		   */
		   //想调用 关锁开锁 只要当前类实现了 FirstInterface接口
		   methodA(face1);
		   methodB(face1); 
		   methodC(face1);
		    
		  //初始化一个Window对象
		   Window w=new Window();
		   methodC(w);
		   methodA(w);
		   
		
		  
	}

}

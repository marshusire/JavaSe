package day13.interface01;

/*
 * 
 * 
 * */
public class Window implements ThirdMyInterFace,FirstInterface {
   @Override
   public void guardWang() {
	   System.out.println("有摄像头  报警装置  联网 推送消息  窗户自动上锁");
   }
   @Override
	public void lock() {
		// TODO Auto-generated method stub
	System.out.println("窗户上锁");
	}
   @Override
	public void unlock() {
		// TODO Auto-generated method stub
	System.out.println("窗户开锁");	
	}
}

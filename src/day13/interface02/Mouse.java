package day13.interface02;
//鼠标遵循USB规范
public class Mouse implements USBInterface{
   @Override
   public void installDriver() {
	// TODO Auto-generated method stub
	   System.out.println("鼠标加载驱动中");
   }
   @Override
	public void doWork() {
		// TODO Auto-generated method stub
	   System.out.println("鼠标输入信息");
	}
	
}

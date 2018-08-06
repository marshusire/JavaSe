package day13.interface02;
//当前类实现Usb 规范
public class Fan implements USBInterface{

	@Override
	public void installDriver() {
		// TODO Auto-generated method stub
		System.out.println("风扇加载驱动中");
	}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
	    System.out.println("风扇开始工作");
   }
	
  //自定义 功能
	public void method(){
		System.out.println("上天");
		
	}
	
	
}

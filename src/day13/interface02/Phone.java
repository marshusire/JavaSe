package day13.interface02;

//手机遵循USB规范
public class Phone implements USBInterface{

	public void call(){
		System.out.println("拨打电话中");
	}
	
	@Override
	public void installDriver() {
		// TODO Auto-generated method stub
	   System.out.println("手机加载驱动中");	
	}
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("手机充电中");
		
	}
	
}

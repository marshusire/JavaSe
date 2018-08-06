package day13.interface02;
//遵循USB规范 实现接口
public class MoveDevice implements USBInterface{

	 @Override
	public void installDriver() {
		// TODO Auto-generated method stub
	   System.out.println("U盘加载驱动中...");	
	}
	 @Override
	public void doWork() {
		// TODO Auto-generated method stub
	   System.out.println("U盘读写数据中");
	}
	
}

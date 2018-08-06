package day13.interface02;

//电脑可以使用usb设备
public class Computer {
  //插入USB设备
	public static void insertDevice(USBInterface face){
		//执行usb的方法
		face.installDriver();
		face.doWork();
		//手机打电话
		//上转下   需要对数据类型进行判断
		if(face instanceof Phone){
		  Phone p=(Phone)face;
		  //执行打电话  子类私有方法
		  p.call();
		}	
	}
	
	public static void main(String[] args) {
	   //1.初始化一个风扇对象
		 Fan f=new Fan();
	   //2.风扇可以安装到电脑
		 insertDevice(f);
	   //3.创建一个鼠标对象
		 Mouse  m=new Mouse();
		 //鼠标安装在电脑上
		 insertDevice(m);
	   //4.初始化一个U盘对象
		 MoveDevice d=new MoveDevice();
		 //将U盘插入电脑上
		 insertDevice(d);
		
	   //5.初始化一个手机对象
		 Phone phone=new Phone();
		//将手机连接到电脑上
		 insertDevice(phone);
		 
		
	}
	
	
	
}

package day13.interface02;
//��ѭUSB�淶 ʵ�ֽӿ�
public class MoveDevice implements USBInterface{

	 @Override
	public void installDriver() {
		// TODO Auto-generated method stub
	   System.out.println("U�̼���������...");	
	}
	 @Override
	public void doWork() {
		// TODO Auto-generated method stub
	   System.out.println("U�̶�д������");
	}
	
}

package day13.interface02;
//�����ѭUSB�淶
public class Mouse implements USBInterface{
   @Override
   public void installDriver() {
	// TODO Auto-generated method stub
	   System.out.println("������������");
   }
   @Override
	public void doWork() {
		// TODO Auto-generated method stub
	   System.out.println("���������Ϣ");
	}
	
}

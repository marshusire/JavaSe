package day13.interface02;
//��ǰ��ʵ��Usb �淶
public class Fan implements USBInterface{

	@Override
	public void installDriver() {
		// TODO Auto-generated method stub
		System.out.println("���ȼ���������");
	}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
	    System.out.println("���ȿ�ʼ����");
   }
	
  //�Զ��� ����
	public void method(){
		System.out.println("����");
		
	}
	
	
}

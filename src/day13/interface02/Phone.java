package day13.interface02;

//�ֻ���ѭUSB�淶
public class Phone implements USBInterface{

	public void call(){
		System.out.println("����绰��");
	}
	
	@Override
	public void installDriver() {
		// TODO Auto-generated method stub
	   System.out.println("�ֻ�����������");	
	}
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ������");
		
	}
	
}

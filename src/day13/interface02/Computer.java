package day13.interface02;

//���Կ���ʹ��usb�豸
public class Computer {
  //����USB�豸
	public static void insertDevice(USBInterface face){
		//ִ��usb�ķ���
		face.installDriver();
		face.doWork();
		//�ֻ���绰
		//��ת��   ��Ҫ���������ͽ����ж�
		if(face instanceof Phone){
		  Phone p=(Phone)face;
		  //ִ�д�绰  ����˽�з���
		  p.call();
		}	
	}
	
	public static void main(String[] args) {
	   //1.��ʼ��һ�����ȶ���
		 Fan f=new Fan();
	   //2.���ȿ��԰�װ������
		 insertDevice(f);
	   //3.����һ��������
		 Mouse  m=new Mouse();
		 //��갲װ�ڵ�����
		 insertDevice(m);
	   //4.��ʼ��һ��U�̶���
		 MoveDevice d=new MoveDevice();
		 //��U�̲��������
		 insertDevice(d);
		
	   //5.��ʼ��һ���ֻ�����
		 Phone phone=new Phone();
		//���ֻ����ӵ�������
		 insertDevice(phone);
		 
		
	}
	
	
	
}

package day13.interface01;

/*
 * 
 * 
 * */
public class Window implements ThirdMyInterFace,FirstInterface {
   @Override
   public void guardWang() {
	   System.out.println("������ͷ  ����װ��  ���� ������Ϣ  �����Զ�����");
   }
   @Override
	public void lock() {
		// TODO Auto-generated method stub
	System.out.println("��������");
	}
   @Override
	public void unlock() {
		// TODO Auto-generated method stub
	System.out.println("��������");	
	}
}

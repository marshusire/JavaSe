package day13.interface03;

/**
 * �﷨���ӿڼ̳��﷨
 *   ���η� Interface �ӿ� extends �ӿ�1,�ӿ�2...{
 *   
 *   }
 *   
 *  ���ԣ�
 *     1.�ӿڿ��Լ̳нӿ�
 *     2.�ӿڿ��Զ�̳У��̳�ֻ�ܼ̳нӿ��еĳ��󷽷�
 *     3.�ӿ�ֻ�ܼ̳нӿ�,���ܼ̳���
 *     
 * @author Administrator
 *
 */
interface  SecondInterface{
	public void methodC();
}

interface ThirdInterface{
	public void methodB();
}
//�ӿڼ̳�
interface FourInterface extends SecondInterface,ThirdInterface{
   
}

public interface FirstInterface {
	//����һ������
	public void methodA();
}

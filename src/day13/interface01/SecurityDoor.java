package day13.interface01;

/**
 * ������ 
 *  �����ŵ��ص�
 *  ���Ĺ���
 * 
 * */

/**
 *   ʵ����:ʵ��ĳ���ӿڵ���
 *   �����Ҫʵ��ĳһ���ӿ��﷨
 *   ���η� class ����  extends ����  implements �ӿ�1,�ӿ�2,...{
 *     //������д�ӿ������з���
 *   }
 *   
 * 
 * 
 * */

//���ΰ�ȫ
public class SecurityDoor extends Door implements FirstInterface,SecondInterface,ThirdMyInterFace{
	@Override
	public void lock() {
       System.out.println("ͨ��Կ�׽�������");	
	}

	@Override
	public void unlock() {
		System.out.println("ͨ��Կ�׽��н���");
	}

	@Override
	public void fireProof() {
		System.out.println("��ˮ ������");
	}
	
	@Override
	public void guardWang() {
        System.out.println("��Ϣ���� ���Ŵ򲻿� ¼��  ������ϱ����绰");	
	}
	
}

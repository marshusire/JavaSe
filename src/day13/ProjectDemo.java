package day13;

import java.util.Scanner;


public class ProjectDemo {

	public static void main(String[] args) {
      //1.��ʼ��һ������ ��ſγ�����
		String[]arr={"����","��ѧ","����"};
	  //2.��ʼ��һ������¼�����
		Scanner input=new Scanner(System.in);
	  //3.ͨ������¼�����Ϣ��ȡ����Ԫ�ص�ֵ
		System.out.println("������ 1 2 3 ѡ��γ�");
		int num=input.nextInt();
		try{
		String tmp=arr[num-1]; //�����±�Խ�� ѡ����� �׳��쳣
		System.out.println("ѡ���ѧ����"+tmp);
		}catch (Exception e) {
		System.out.println("��������ȷ���±�");
		}finally {
		System.out.println("��ӭ�������");	
		}
		
	}

}

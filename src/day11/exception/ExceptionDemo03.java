package day11.exception;

public class ExceptionDemo03 {
	/**
	 * �����쳣  �ùؼ��� throws
	 * ���η� ����ֵ���� ������(�����б�) throws �쳣����,�쳣����1..{
	 * 
	 * 
	 * }
	 * 
	 * 
	 * ���ã����߷��������ߣ����ø÷����п��ܻ���� �쳣���ͣ�����������Ҫ�� �쳣���ͽ��д���
	 * 
	 * 
	 * 
	 * �쳣������������ 
	 *  ���ᴴ���µ��쳣��Ϣ���ᱣ��ԭ�����쳣��Ϣ ���������ϴ�
	 * 
	 * 
	 * */
	
	//���巽��
	public static  void methodA()throws ArithmeticException{
		//������������
		 int a=10;
		 int b=10;	
		 System.out.println("a/b="+a/b);//�п��ܲ����쳣����,���Ը��쳣����
		 methodB();//����MethodB
	}
	
	//
	public static void methodB() throws ArrayIndexOutOfBoundsException{
		//��������
		int[]arr={1};
		System.out.println(arr[2]);//��ǰ���������쳣����ֻ���쳣����������˭���ã�˭����
	}
	
	
	public static void main(String[] args) {
		//�����߲����쳣��Ϣ
	    try{
		  methodA();
		}catch(Exception e){
		  e.printStackTrace();
		}
	    /*
		try{
	      methodB();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}*/
		System.out.println("�쳣�������");
		
	}
	
	
}

package day12.test;


class Test{
	
	Test methodA() throws ArrayIndexOutOfBoundsException{
		System.out.println("�� �ܸ�,��˧");
		return null;
	}
	
}


public class Demo01 extends Test{
  /**
   *  ��������
   *     �ص�: ��ͬ һ��ͬ
   *         ��ͬ�� ͬ��  ͬ������
   *        һ��ͬ�� �����б� ��ͬ
   */
	public double getArea(int num){
		
		Demo02 demo=new Demo02(2);
		
		return 0;
	}
	public double getArea(int num ,int num1){
		return num*num1;
	}
	
	/**
	 * ������д��
	 *     ���������Ϊ���㲻���������Ϊ����,��Ҫ�Ը������Ϊ,�������¶��塣
	 *  �ص㣺
	 *      �����м̳й�ϵ��������д����������д
	 *      ������,��������͸��ౣ��һ��
	 *      �����ķ���ֵ���� �͸��ౣ��һ�»���������
	 *      �������쳣,�͸���һ�»���������
	 *      ���η����ܱȸ����С
	 * 
	 * */
	 
	       //��д
	    @Override  
	   public Test methodA() throws ArrayIndexOutOfBoundsException {
	    		// �������Ϊ���㲻���������Ϊ 
	    	      System.out.println("�ܸ�");
	    		 // super.methodA();//�����˸�������� 
	    		 return null;
	    		 
	    		 
	    		
	    		
	   }
	
	
	
	
}

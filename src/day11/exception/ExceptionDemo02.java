package day11.exception;

public class ExceptionDemo02 {
	
	public static void main(String[] args) {
		
		/**
		 * try catch finally���
		 * ���ʹ��return��䣬������ִ����finally֮����ִ��return��� 
		 * ��ֹfinally���ִ�� ֻ��һ�����
		 * 
		 * 
		 * 
		 * */
		
		
		try{
			//���ܳ��ֵ��쳣����
			 int a=10;
			 int b=0;
		 	 System.out.println("a/b="+a/b);
		 	// return;
		}catch(Exception e){
			System.out.println("���Ѿ�������");
			System.exit(0);//��ֹ��ǰ�����
			//return;
		}finally{
			System.out.println("��������Ҫִ�е�һ��");
		}
		
		   System.out.println("���в������������");
		
		
		
	}
	

}

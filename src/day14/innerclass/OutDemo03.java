package day14.innerclass;

public class OutDemo03 {
   //����
	String name;
    int    sex;
	
	public void methodA(){
		System.out.println("�ⲿ���ʵ������");
	}
	
	/***
	 * �ֲ��ڲ���
	 *  λ��:������
	 *  ��Ա�� ���붼��ʵ����Ա
	 *  
	 *  ֻ���������ķ�����ʹ��
	 */
	public  void methodB(){
		
		final int num=10; 
		
	    class Inner02{
		     String name;
		     int  age;
		     public void methodc(){
		    	 //�ֲ��ڲ�����Է����ⲿ������г�Ա 
		    	 System.out.println(sex);
		    	
		    	 //�����ⲿ�� �������ڵľֲ�����  �ֲ������������final���η� ��Jdk1.8��ʼ����Ҫ���
		    	 System.out.println(num);
		    	 System.out.println("�ֲ��ڲ���� ʵ������");
		     }
//		     public static void methodD(){
//		    	 System.out.println("�ֲ��ڲ���ľ�̬����");
//		     }       
		  }
	     
	     //1.��ʼ��һ���ڲ������
	      Inner02 in=new Inner02();
	     //2.���ʳ�Ա
	      in.name="mars";
	      in.age=12;
	      in.methodc();
	      
	     
	     
		  	
	}
	
	 public static void main(String[] args) {
	    //��ʼ��һ������ �ⲿ��Ķ���
		   OutDemo03 demo=new OutDemo03();
		   demo.methodB();
		 
		 
		 
		 
	 }
	
	
	
}

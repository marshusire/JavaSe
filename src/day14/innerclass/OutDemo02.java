package day14.innerclass;

public class OutDemo02 {
   String name;
   static int  number;
   public void methodA(){
	 System.out.println("�ⲿ��ʵ������");  
   }
   public static void methodB(){
	 System.out.println("�ⲿ�ྲ̬����");
   }
   /**
    *  ��̬�ڲ���
    *    λ�ã� ���� �����ⲿ
    *    ����: final abstract static  private  public  protected
    *    ��Ա��
    *      ��̬ �Ǿ�̬
    *      
    */
      static class Inner01{
    	  String  name;
    	  static  int age;
    	  public Inner01(){
    		  System.out.println("���췽��");
    	  }
    	  
    	  public void mehtodA(){
    		  System.out.println("�ڲ����ʵ����Ա");
    		  //��̬�ڲ����ʵ����Ա���Է����ⲿ��ľ�̬��Ա
    		    number=112;
    		    name="mars";//�������ڲ����Ա
    		  // OutDemo02.this.name="123"; ����������ⲿ���ʵ����Ա
    		  
    	  }
    	  public static void methodB(){
    		  //ֻ�ܷ����ⲿ��ľ�̬��Ա
    		  
    		  System.out.println("�ڲ���ľ�̬��Ա");
    	  }
    	  
      }
   
     public static void main(String[] args) {
		//1.��ʼ��һ����̬�ڲ������  û�г�ʼ���ⲿ�����
    	  OutDemo02.Inner01 in=new OutDemo02.Inner01();
    	//2.�����ڲ��� ��Ա ���Է��� ���еĳ�Ա
    	  in.mehtodA();//�ڲ����ʵ������
    	  in.methodB();//�ڲ���ľ�̬����
    	  
    	//ֱ�ӷ����ڲ���ľ�̬��Ա  ����������
    	  OutDemo02.Inner01.age=11;
    	  OutDemo02.Inner01.methodB();
    	  
         //�ڲ�������ⲿ��ĳ�Ա ֻ�ܷ��ʾ�̬��Ա��	  
    	   
	}
   
	
	
}

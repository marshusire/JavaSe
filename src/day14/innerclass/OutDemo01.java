package day14.innerclass;

/**
 * �ڲ��ࣺ
 *      ������ڲ��ڶ���һ����,���Կ�������ĳ�Ա��
 * ��ĳ�Ա��
 *       �ֶΣ��������ࡣ
 *       
 * �ڲ������ͣ�
 *     1.ʵ���ڲ���      
 *     2.��̬�ڲ���
 *     3.�ֲ��ڲ���
 *     4.�����ڲ���  
 *     
 * @author Administrator
 *
 */


public class OutDemo01 {
	//�ⲿ�������
	 String name;//ʵ����Ա
	 int  age;
	//�ⲿ��ķ���
	 public void methodA(){
	   System.out.println("���"); 
	 }
	 //����һ��ʵ���ڲ���
	 /**
	  * ʵ���ڲ���
	  *   λ�ã� ���� ������
	  *   ���η���public private  protected
	  *   ������static
	  *    
	  *    ���ж���ĳ�Ա
	  *    ����ʹ��static��������
	  *    ����Ȩ�����η� ������
	  *       
	  *    //�ڲ�������ⲿ��ĳ�Ա   
	  *       ���ڲ����п���ֱ�ӷ����ⲿ��ĳ�Ա(ʵ���;�̬)
	  *       
	  *    
	  */
	      class Inner{	  
		   //�����ڲ��ĳ�Ա
		      String name;//ʵ����Ա
		   // static int  number;// ����ʹ��static ��������
		   public void printmsg(){
			   System.out.println("����ʵ���ڲ���ķ���"+name+age);
		   } 
		   public void printOutMsg(){
			  //����ⲿ���Ա���ڲ����Աһ�� Ĭ�Ϸ��ʵ����ڲ���ĳ�Ա��
			  //���Ҫ�����ⲿ���Ա
			     System.out.println(OutDemo01.this.name);
			  //�����ⲿ���methodA����
			     OutDemo01.this.methodA();   
			  //ͨ���ڲ��� ���ⲿ���Ա��ֵ
			     OutDemo01.this.age=11;
		   }
		   
		   public void methodA(){
			   System.out.println("�ڲ���ķ���"); 
		   }
		   
		   public Inner(){
			   System.out.println("���췽��");
		   }
		   
	   
	    }
	 
	
	      
	

}

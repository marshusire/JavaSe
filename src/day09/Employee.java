package day09;

/**
 * ����̳��� Person
 * 
 * Super ���Է��ʸ���  ���Ժͷ���
 * superֻ�ܴ�������ķ�����
 * super���Դ�������Ĺ��췽���� �������ø���Ĺ��췽��   ������ڹ��췽����һ��Super();
 *
 * 
 * */
public class Employee extends Person{
   //����
	String hireDate;//��ְʱ��
	
	//�����ж���͸��๦����Ϊ������
	 String name;//���������
   
   //��Ϊ ����Ҳ��
	 public void sleep(){
		 System.out.println("����˯��");
	 }
	 
	 
	 /**
	  * ��ʼ��һ�������ʱ�򣬹��췽�����뱻����һ��
	  *   1.�������Ĺ��췽����û����ʾ���ø���Ĺ��췽��,Ĭ�ϵ����޲����Ĺ��췽��
	  *   2.�����ʾ��super�����ø���ָ���Ĺ��췽��,����ָ�����췽���ᱻִ��һ�Σ�
	  * 
	  * */
	 //�����й��취����
	 public Employee(){
		 //��ʾ���ø���Ĺ��췽��
		// super();//ָ������Ĭ�ϵĹ��췽��
		 super("ddd");//ָ�����ô������ĸ���Ĺ��췽��
		 
		 System.out.println("����Ĺ��췽��"); 
	 }
	 
	 public Employee(String name){
		 
		 System.out.println("�����вι��췽��");
	 }
	 
	 
	public void methodA(){
		//��ʹ��super ���Է��ʸ���ĳ�Ա
		
		//���౾��û�к͸�����ͬ��  ���Ժͷ���
		 System.out.println("name="+this.name);//���õ�ǰ��
		 System.out.println("supername"+super.name);//���ø���
		 super.sleep();//�����˸���ķ���
		 this.sleep();
		 //  
		 
	}
	
	
	
	
}

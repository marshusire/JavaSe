package day10.test01;

public class Master {

// //�������п���
//  public void cure(Dog dog){
//	  dog.toHospital();//��ҽԺ
//  }
//  public void cure(Penguin pen){
//	  pen.toHospital();
//  }
//  
	
	//1.����  ����
	 // С��  ����  
	
	
	
	
  //�����г��￴��
  public void cure(Pet  p){
	//����Ķ��� ���������
	  System.out.println("pppp===="+p);
	//����ȥҽԺ�ķ���  ִ������Ķ���ķ���
	  p.toHospital();
	  
	 //���������Ҫִ���Լ������ԣ���Ҫ����ǿ������ת��
	 //instanceof �ж϶��������, ��֤��������ת����ȷ
	  
	  
	//ִ��С���ӷ���  �������������
	  //ǿ��ת�� ����ת���� (��ת��) ��Ҫǿ������ת����
	  if(p instanceof Dog){
	   Dog dog =(Dog)p;
	   dog.playPan();
	  }else if(p instanceof Penguin){
	  //ǿ������ת�� 
		Penguin p1=(Penguin)p;  
	  //ִ��������������
		p1.swimming();
	  }


  }
  
   
  //��ڷ���
     public static void main(String[] args) {
		//1.��ʼ��һ����������� 
    	   Master m=new Master();
    	//2.��ʼ��һ��Dog���� ����dog����  ��ֵ�� ��ֵ���������ͣ����ࣩ
    	   Dog  dog=new Dog(40);
    	   System.out.println(dog);
    	   Pet p=dog;  //��ת��
    	   System.out.println(p);
    	   //�����￴��
    	   m.cure(p);
    	   
    	   
    	//3.��ʼ��һ��������,������������ø�ֵ���������ͣ����ࣩ   
    	   Penguin pen=new Penguin(20);
    	   System.out.println(pen);
    	   Pet p1=pen;//������Ķ���ֵ�����������
    	   System.out.println(p1);
    	   m.cure(p1);
    	   
    	//4.��ʼ��һ��cat����
    	   Cat cat=new Cat(20);
    	   //��è����
    	   m.cure(cat);
    	   
    	   
    	  /**
    	   * ��̬
    	   * 1. ������Ķ��� ��ֵ�����������
    	   * 2. ���ø������õ��ø���ķ���ʱ��ִ�е���������д�ķ�����
    	   * 3. ���ʹ�ö�̬ �����м̳й�ϵ 
    	   * */
    	      //������ ����ֱ�ӽ���ʵ����
    	      // Pet p2=new Pet();
    	   
    	   
    	 
	 }
	
	
}

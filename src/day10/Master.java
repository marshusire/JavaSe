package day10;

/**
 * 
 * ������
 * */
public class Master {

 //��������п���
  public void cure(Dog dog){
	  System.out.println("��С������");
	  //dog.toHospital();//��������
  }
 //����쿴��	
  public void cure(Penguin pen){
	  System.out.println("����쿴��");
	 // pen.toHospital();//����쿴��
	  
  }
  
  
  public static void main(String[] args) {
    //1.��ʼ��һ��Mater ����
	  Master m=new Master();
	  
	//2.��ʼ�� �������ĳ���  
	  Dog dog=new Dog();
	  Penguin pen=new Penguin();
	
	//3.��������п���
	  m.cure(dog);
	  m.cure(pen);
  }
	
}

package day10.test02;

public class Master {
     //��������Ϊ�����β� ��ʵ�ֶ�̬
	
	//�����г������ιʳ
	public static void toEat(Pet p){
		//ιʳ
		 p.eat();
	}
	
	public static void main(String[] args) {
		//1.��ʼ�������������
		  Dog dog=new Dog();
		  Penguin p=new Penguin();
		//2.������ιʳ ������ֵ����100 ����ιʳ
		  //С��
		  while(dog.getHealth()<100){
		     toEat(dog);//ιʳһ��
		  }
		  
		  //�ж�������ιʳ
		  while(p.getHealth()<100){
			  toEat(p);
		  }
		  
	}

}

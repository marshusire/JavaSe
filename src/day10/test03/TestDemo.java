package day10.test03;

public class TestDemo {

	//���� ��������Ϊ����ֵ����
	 public static Goods getType(int type){
		 if(type==1){
		    //1.��ʼ��һ��Foods����
			 Foods food=new Foods();
			 //�������Ե�ֵ
			 food.setPrice(100);
			//�����󷵻�
			 return food; 
		 }
		 
		 //����һ��TVs����
		 TVs tv=new TVs();
		 //��������ֵ
		 tv.setPrice(2000);
		 //�����󷵻�
		 return tv;
	 }
	
	
	
	public static void main(String[] args) {
		//���÷��� ����ָ��������
		 getType(1).printPirce();
         getType(2).printPirce();
	}

}

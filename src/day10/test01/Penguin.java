package day10.test01;
//����̳и���
public class Penguin extends Pet {
   //Ĭ�ϵĹ��췽��
	 public Penguin(){}
	 public Penguin(int health){
		 this.setHealth(health);
	 }
	 //����������Ϊ
	 public void swimming(){
		 System.out.println("�ϼ���Ӿ");
	 }
	 
	 
   //��д���࿴������
	 @Override
	public void toHospital() {
		//������쿴���ķ���
		 if(this.getHealth()<50){
			 System.out.println("���  ���� ʳ��...");
			 //�ָ�����ֵ
			 this.setHealth(95);
		 }
		
	}
	
}
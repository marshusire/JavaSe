package day10.test;
//����̳и��� ӵ�и��๫�������Ժͷ���
public class Dog extends Pet{
   
	//���췽��
	public Dog(){
	}
	public Dog(int health){
		this.setHealth(health);
	}
	
	
	
	//��д�����ķ���
	@Override
	public void toHospital() {
	  //���幷�Ŀ�������
		if(this.getHealth()<60){
		   System.out.println("���� ���д��� ��ҩ �ָ�����ֵ��...");
		   //�ָ�����ֵ
		   this.setHealth(90);
		}
	}
	
	
}

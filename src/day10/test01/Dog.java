package day10.test01;
//����̳и��� ӵ�и��๫�������Ժͷ���
public class Dog extends Pet{
   
	//���췽��
	public Dog(){
	}
	public Dog(int health){
		this.setHealth(health);
	}
	
	//��������һ������
		public void playPan(){
			System.out.println("�ӷ���");
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

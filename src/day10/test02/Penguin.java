package day10.test02;

public class Penguin extends Pet{

	@Override
	public void eat() {
		// �����ιʳ ���ָ�����ֵ
		if(this.getHealth()<100){
		   System.out.println("���ιʳһ�� ��������ֵ 5");
		   this.setHealth(this.getHealth()+5);
		   //�жϽ���ֵ�Ƿ�����100
		   if(this.getHealth()>=100){
			   this.setHealth(100);
		   }
		}
	}
	
	
}

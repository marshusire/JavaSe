package day14.enums;

class WeekDay{
   /*
    * ����һ��Monday ���ڶ�:Tuesday��������
    *  Wednesday�����ģ�Thursday�����壺Friday
    *  ��������Saturda
    *  �����գ�
    *  Sunday
    * */
  //������һ��������
   public static final int MON=1;   //��һ
   public static final int TUES=2;  //�ܶ�
   public static final int WEDNES=3;//����
   public static final int THURS=4; //����
   public static final int FRI=5;   //����
   public static final int SATUR=6; //����
   public static final int SUN=7;   //����
	
	
}


public class Employee01 {
   //����
	private int restDay;//��Ϣ��

	public int getRestDay() {
		return restDay;
	}

	public void setRestDay(int restDay) {
		this.restDay = restDay;
	}
	
   //���÷���
	public void dayOfRestDay(){
		switch (this.restDay) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		   System.out.println("��Ҫ��ש");	
		 break;
		case 7:
		   System.out.println("��Ϣһ��");
		 break;
		default:
		   System.out.println("��������ȷ���� 1-7");
		 break;
		}
	}
	
	 public static void main(String[] args) {
		//1.��ʼ��һ������
		 Employee01 em=new Employee01();
		//2.�����Խ��и�ֵ 1-7����ߴ�����Ķ��ԡ�
		 em.setRestDay(WeekDay.MON);
		//3.�ж������Ƿ��ǿ�����Ϣ��
		 em.dayOfRestDay();
		 
	 }
	
	
	
}

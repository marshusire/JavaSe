package day14.enums;

/**
 * ��ǰ����� 
 *   ���ֻ������ 7������
 *   ÿ���������һ��ֵ
 * */
class WeekDay01{
	//��ʼ��7������ ����Ϊ��ǰ�ྲ̬����
	/**
   public static final int MON=1;   //��һ
   public static final int TUES=2;  //�ܶ�
   public static final int WEDNES=3;//����
   public static final int THURS=4; //����
   public static final int FRI=5;   //����
   public static final int SATUR=6; //����
   public static final int SUN=7;   //����
	 */
	public static final WeekDay01 MON=new WeekDay01();
	public static final WeekDay01 TUES=new WeekDay01();
	public static final WeekDay01 WEDNES=new WeekDay01();
	public static final WeekDay01 THURS=new WeekDay01();
	public static final WeekDay01 FRI=new WeekDay01();
	public static final WeekDay01 SATUR=new WeekDay01();
	public static final WeekDay01 SUN=new WeekDay01();
	
	//���췽��˽�л� ����ֻ���ڱ�����ʵ����
	  private WeekDay01(){
		  
	  }
	
	
}


public class Employee02 {
	//����
	private WeekDay01 restDay;

	public WeekDay01 getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay01 restDay) {
		this.restDay = restDay;
	}
	
	//�ж��Ƿ�����Ϣ��
	public void dayOfRestDay(){
		if(this.restDay==WeekDay01.SUN){
			System.out.println("��Ϣһ��");
		}else{
			System.out.println("��Ҫ��ש");
		}
	}
	
	public static void main(String[] args) {
		//1.��ʼ��һ��Ա������
		  Employee02 em=new Employee02();
		//2.��������  ���� ������Ķ��� ��Լ����
		// WeekDay01 WEEK=new WeekDay01();
		  em.setRestDay(WeekDay01.SATUR);
		 //3.�ж�����
		  em.dayOfRestDay();
		
		
	}
	

}

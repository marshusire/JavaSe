package day14.enums;

/**
public static final int MON=1;   //��һ
public static final int TUES=2;  //�ܶ�
public static final int WEDNES=3;//����
public static final int THURS=4; //����
public static final int FRI=5;   //����
public static final int SATUR=6; //����
public static final int SUN=7;   //����
	 */
/**
 * ����һ��ö����
 * 
 * @author Administrator
 */
enum Weekday02 {

	/***
	 * Ĭ�ϼ̳� java.lang.enum �����
	 *
	 * ʹ�ù����� ֻ���������� �������֮���ö��Ÿ��� ����������ڵ�һ��
	 * 
	 * ��������������������  ���ǵ�ǰö�ٵĶ���
	 */
	MON, TUES, WEDNES, THURS, FRI, SATUR, SUN;

	int age;

	public void methodA() {
		System.out.println("��Ҫ��ש");
	}

	// �����й��췽�� �����ǹ��췽��������˽�еĳ�Ա
	private Weekday02() {

	}

	private Weekday02(String name) {

	}
	// public static final WeekDay02 MON=new WeekDay02(); �ȼ�MON
	// �����췽��Ҳ�ǽ���˽�л�
	// ö�����ڲ� ���������� �ֶ� ���� ���췽�� �ڲ��� ������ڳ���֮��
}

public class Employee03 {
	// ����
	private Weekday02 restDay;

	public Weekday02 getRestDay() {
		return restDay;
	}

	public void setRestDay(Weekday02 restDay) {
		this.restDay = restDay;
	}
   //�ж��Ƿ�����Ϣ��
	public void dayOfRestDay(){
	  switch (this.restDay) {
		case MON://��һ
		case TUES:
		case WEDNES:
		case THURS:
		case FRI:
		case SATUR:
		   System.out.println("��ש��");
		   break;
		case SUN:
		   System.out.println("��Ϣ��");
		}
		
	}
	
	public static void main(String[] args) {
		//1.��ʼ��һ������
		 Employee03 em=new Employee03();
		//2.�������Ե�ֵ ö��
		 em.setRestDay(Weekday02.SUN);
		//3.�ж��Ƿ���Ϣ
		 em.dayOfRestDay();
		
  	 //��ȡö�ٶ��������
		 String name=Weekday02.SUN.name();
		 System.out.println(name);
		 //��ȡö�����͵�����
		 name=Weekday02.FRI.toString();
		 System.out.println(name);
		 
	 //��ȡö�ٶ��� ���� �����кŴ�0��ʼ
		 int index=Weekday02.SUN.ordinal();
		 System.out.println(index);
		 
		 //��ȡ����ö�ٳ��� ����һ������
		 Weekday02[]arr=Weekday02.values();
		 for (Weekday02 weekday02 : arr) {
			System.out.println(weekday02);
		 }
		 //��String����ת����ö�ٳ���    Ҫ��String���� �����ö�����ͳ�������һ��
		  Weekday02 day=Weekday02.valueOf("SUN");
		  System.out.println(day);
		  System.out.println(day.ordinal());
	}
	
	
	

}

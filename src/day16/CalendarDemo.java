package day16;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    /**
     * ������ 
     *   calendar
     *   ����� date
     *   1.��ȡʱ�� get(filed) 
     *   2.����ʱ��set(file)
     * 

     * @param args
     */
	
	public static void main(String[] args) {
		//1.��ȡһ����������
		 Calendar c=Calendar.getInstance();
		 //c.set(Calendar.DAY_OF_MONTH,8);
		 
		//2.���������� ת��date
		  Date d=c.getTime();
		 System.out.println(d);
		//3.����ת����ʱ���
		 long l=c.getTimeInMillis();
		 System.out.println(l);
		
		//4.��ȡ������ʱ��
		 System.out.println(c.get(Calendar.YEAR));//��ȡ��
		 System.out.println(c.get(Calendar.MONTH));//��ȡ�·� ��0��ʼ
		 System.out.println(c.get(Calendar.DAY_OF_MONTH));//����µڼ���
		 System.out.println(c.get(Calendar.DAY_OF_WEEK));//���ܵڼ��� ������һ�ܵĵ�һ��������
		 System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//����������µĵڼ��� 1�ſ�ʼ�ǵ�һ��
		 System.out.println(c.get(Calendar.AM_PM));//���磨0�� �������磨1��
		 System.out.println(c.get(Calendar.DATE));//��ȡ��ǰ����µڼ���
		 System.out.println(c.get(Calendar.HOUR_OF_DAY));//��ȡ24Сʱ�� ʱ��
		 System.out.println(c.get(Calendar.HOUR));//12Сʱ��
		 System.out.println(c.get(Calendar.MINUTE));//��ȡ��
		 System.out.println(c.get(Calendar.SECOND));//��ȡ��
		 System.out.println(c.get(Calendar.MILLISECOND));//��ȡ����
		 System.out.println(c.get(Calendar.WEEK_OF_MONTH));//������µڼ���
		 System.out.println(c.get(Calendar.WEEK_OF_YEAR));//��һ��ĵڼ���
         System.out.println(c.get(Calendar.DAY_OF_YEAR)); //��һ��ĵڼ���
         
      //5.����ʹ���ֶ�������ʱ��
         c.set(Calendar.AM_PM,Calendar.AM);
         c.setTime(new Date());//��date ת��������
         System.out.println(c.get(Calendar.AM_PM));
         c.setTimeInMillis(l);//��ʱ��� ת��������        
         System.out.println(c.getTime());
         
      //��� �Զ���ʱ���ʽ   
         

	}

}

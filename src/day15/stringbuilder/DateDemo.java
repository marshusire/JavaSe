package day15.stringbuilder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 * Date��һ��������
		 *    ������ ���Ի�ȡ��ǰϵͳ��ʱ��
		 *    ��ȡ��ǰ��ʱ���  ����Ϊ��λ  �� 1970 01-01 00:00:00 Ϊ��׼ʱ�� ��֮��Ĳ�
		 *    
		 */
		  //1.��ʼ��һ��date ���� ��ȡ��ǰ��ϵͳʱ��
		      Date d=new Date();
	      //2.��ӡ��ǰϵͳʱ�� Ĭ�ϵ�ʱ���ʽ
		      System.out.println(d.toString());
		  //3.��ȡ��ǰʱ���ʱ���
		     long l=d.getTime();
		     System.out.println(l);
		   /**
		    * Tue Aug 07 11:09:36 CST 2018
		    * 1533611376062  
		    */
		   //4.ͨ��ʱ�����������  
		     Date d1=new Date(1533611376062L);
		   //5.�鿴ʱ��
		     System.out.println(d1.toString());
		
		     //��ȡһ�����ڸ�ʽ������ 
		     //���� ת����String
		     DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);//Ĭ��ϵͳ�ĸ�ʽ
		     System.out.println(df.format(d1));//��ʱ��ת���ɹ涨��ʽString
		     
		     df=DateFormat.getTimeInstance(DateFormat.FULL);//ֻת��ʱ��
		     System.out.println(df.format(d1));
		     
		     //���� ʱ��
		     df=DateFormat.getDateTimeInstance(DateFormat.FULL,0);
		     System.out.println(df.format(d1));
		     
		     //�Զ�ʱ���ʽ
		     SimpleDateFormat f=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss:SSS E G Z");
		     //������ת���ɹ̶��ĸ�ʽ ����===>�ı�
		     String time=f.format(d);
		     System.out.println(time);
		     
		     //���ı� ��ԭ�����ڶ���   ����
		      d=f.parse("2018��08��07�� 11:46:09:402 ");//���ı�������ԭ��Date����
		      System.out.println("�������ʱ����"+d);
		     
           
	}

}

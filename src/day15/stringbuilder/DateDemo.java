package day15.stringbuilder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 * Date是一个日期类
		 *    在类中 可以获取当前系统的时间
		 *    获取当前的时间戳  毫秒为单位  以 1970 01-01 00:00:00 为基准时间 求之间的差
		 *    
		 */
		  //1.初始化一个date 对象 获取当前的系统时间
		      Date d=new Date();
	      //2.打印当前系统时间 默认的时间格式
		      System.out.println(d.toString());
		  //3.获取当前时间的时间戳
		     long l=d.getTime();
		     System.out.println(l);
		   /**
		    * Tue Aug 07 11:09:36 CST 2018
		    * 1533611376062  
		    */
		   //4.通过时间戳创建对象  
		     Date d1=new Date(1533611376062L);
		   //5.查看时间
		     System.out.println(d1.toString());
		
		     //获取一个日期格式化对象 
		     //对象 转换成String
		     DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);//默认系统的格式
		     System.out.println(df.format(d1));//将时间转换成规定格式String
		     
		     df=DateFormat.getTimeInstance(DateFormat.FULL);//只转换时间
		     System.out.println(df.format(d1));
		     
		     //日期 时间
		     df=DateFormat.getDateTimeInstance(DateFormat.FULL,0);
		     System.out.println(df.format(d1));
		     
		     //自定时间格式
		     SimpleDateFormat f=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS E G Z");
		     //将日期转换成固定的格式 日期===>文本
		     String time=f.format(d);
		     System.out.println(time);
		     
		     //将文本 还原成日期对象   解析
		      d=f.parse("2018年08月07日 11:46:09:402 ");//将文本解析还原成Date对象
		      System.out.println("解析后的时间是"+d);
		     
           
	}

}

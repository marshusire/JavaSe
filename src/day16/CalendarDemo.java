package day16;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    /**
     * 日历类 
     *   calendar
     *   是替代 date
     *   1.获取时间 get(filed) 
     *   2.设置时间set(file)
     * 

     * @param args
     */
	
	public static void main(String[] args) {
		//1.获取一个日历对象
		 Calendar c=Calendar.getInstance();
		 //c.set(Calendar.DAY_OF_MONTH,8);
		 
		//2.将日历对象 转换date
		  Date d=c.getTime();
		 System.out.println(d);
		//3.日历转换成时间戳
		 long l=c.getTimeInMillis();
		 System.out.println(l);
		
		//4.获取日历的时间
		 System.out.println(c.get(Calendar.YEAR));//获取年
		 System.out.println(c.get(Calendar.MONTH));//获取月份 从0开始
		 System.out.println(c.get(Calendar.DAY_OF_MONTH));//这个月第几天
		 System.out.println(c.get(Calendar.DAY_OF_WEEK));//这周第几天 ，美国一周的第一天是周日
		 System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//当天是这个月的第几周 1号开始是第一周
		 System.out.println(c.get(Calendar.AM_PM));//上午（0） 还是下午（1）
		 System.out.println(c.get(Calendar.DATE));//获取当前这个月第几天
		 System.out.println(c.get(Calendar.HOUR_OF_DAY));//获取24小时的 时间
		 System.out.println(c.get(Calendar.HOUR));//12小时制
		 System.out.println(c.get(Calendar.MINUTE));//获取分
		 System.out.println(c.get(Calendar.SECOND));//获取秒
		 System.out.println(c.get(Calendar.MILLISECOND));//获取毫秒
		 System.out.println(c.get(Calendar.WEEK_OF_MONTH));//在这个月第几周
		 System.out.println(c.get(Calendar.WEEK_OF_YEAR));//这一年的第几周
         System.out.println(c.get(Calendar.DAY_OF_YEAR)); //这一年的第几天
         
      //5.可以使用字段来设置时间
         c.set(Calendar.AM_PM,Calendar.AM);
         c.setTime(new Date());//将date 转换成日历
         System.out.println(c.get(Calendar.AM_PM));
         c.setTimeInMillis(l);//将时间戳 转换成日历        
         System.out.println(c.getTime());
         
      //如何 自定义时间格式   
         

	}

}
